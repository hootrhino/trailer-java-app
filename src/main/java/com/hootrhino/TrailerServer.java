package com.hootrhino;

import com.google.protobuf.ByteString;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import trailer.RulexTrailer;
import trailer.TrailerGrpc;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrailerServer {
    private static final Logger log = Logger.getLogger(TrailerServer.class.getName());

    private Server server;

    private void start() throws IOException {
        int port = 7701;
        server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
                .addService(new TrailerImpl())
                .build()
                .start();
        log.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    TrailerServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }

    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        TrailerServer trailerServer = new TrailerServer();
        trailerServer.start();
        trailerServer.blockUntilShutdown();
    }

    static class TrailerImpl extends TrailerGrpc.TrailerImplBase {
        @Override
        public void init(RulexTrailer.Config request, StreamObserver<RulexTrailer.Response> responseObserver) {
            log.info("来自协议包的日志 Init, Config=" + request.toString());
            RulexTrailer.Response response = RulexTrailer.Response.getDefaultInstance();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void start(RulexTrailer.Request request, StreamObserver<RulexTrailer.Response> responseObserver) {
            log.info("来自协议包的日志 start");
            RulexTrailer.Response response = RulexTrailer.Response.getDefaultInstance();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void status(RulexTrailer.Request request, StreamObserver<RulexTrailer.StatusResponse> responseObserver) {
            log.info("来自协议包的日志 Status");
            RulexTrailer.StatusResponse.Builder builder = RulexTrailer.StatusResponse.newBuilder();
            builder.setStatus(RulexTrailer.StatusResponse.Status.RUNNING);
            builder.setMessage("Success");
            RulexTrailer.StatusResponse response = builder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void service(RulexTrailer.ServiceRequest request, StreamObserver<RulexTrailer.ServiceResponse> responseObserver) {
            log.info("来自协议包的日志 service");
            if (Objects.equals("query", request.getArgs().toString())) {
                RulexTrailer.ServiceResponse.Builder builder = RulexTrailer.ServiceResponse.newBuilder();
                builder.setData(ByteString.EMPTY);
                responseObserver.onCompleted();
                return;
            }
            responseObserver.onNext(RulexTrailer.ServiceResponse.getDefaultInstance());
            responseObserver.onCompleted();
        }

        @Override
        public void query(RulexTrailer.DataRowsRequest request, StreamObserver<RulexTrailer.DataRowsResponse> responseObserver) {
            log.info("来自协议包的日志 query");
            ArrayList<ConstantValue> list = ConstantValue.list;
            RulexTrailer.DataRow.Builder rowBuilder = RulexTrailer.DataRow.newBuilder();
            for (ConstantValue constantValue : list) {
                RulexTrailer.ColumnValue.Builder gridBuilder = RulexTrailer.ColumnValue.newBuilder();
                gridBuilder.setId(UUID.randomUUID().toString());
                gridBuilder.setName(constantValue.getName());
                gridBuilder.setType(constantValue.getType());
                gridBuilder.setValue(ByteString.copyFrom(constantValue.getValue(), StandardCharsets.UTF_8));
                RulexTrailer.ColumnValue grid = gridBuilder.build();
                rowBuilder.addColumn(grid);
            }
            RulexTrailer.DataRow row = rowBuilder.build();

            RulexTrailer.DataRowsResponse.Builder builder = RulexTrailer.DataRowsResponse.newBuilder();
            for (int i = 0; i < 123; i++) {
                builder.addRow(row);
            }
            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }

        @Override
        public StreamObserver<RulexTrailer.StreamRequest> onStream(StreamObserver<RulexTrailer.StreamResponse> responseObserver) {
            return new StreamObserver<RulexTrailer.StreamRequest>() {
                @Override
                public void onNext(RulexTrailer.StreamRequest streamRequest) {
                    log.info("来自协议包的日志 onStream");
                }

                @Override
                public void onError(Throwable throwable) {
                    log.log(Level.ALL, throwable.getMessage());
                }

                @Override
                public void onCompleted() {
                    RulexTrailer.StreamResponse response = RulexTrailer.StreamResponse.newBuilder()
                            .setCode(1)
                            .setData(ByteString.copyFrom("OK", StandardCharsets.UTF_8))
                            .build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();
                }
            };
        }

        @Override
        public void schema(RulexTrailer.SchemaRequest request, StreamObserver<RulexTrailer.SchemaResponse> responseObserver) {
            log.info("来自协议包的日志 schema");
            RulexTrailer.SchemaResponse.Builder builder = RulexTrailer.SchemaResponse.newBuilder();
            ArrayList<ConstantValue> list = ConstantValue.list;
            for (int i = 0; i < list.size(); i++) {
                ConstantValue value = list.get(i);
                builder.addColumns(i,
                        RulexTrailer.Column.newBuilder()
                                .setName(value.getName())
                                .setType(value.getType())
                                .setDescription(value.getDescription())
                );
            }
            RulexTrailer.SchemaResponse response = builder.build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void stop(RulexTrailer.Request request, StreamObserver<RulexTrailer.Response> responseObserver) {
            log.info("来自协议包的日志 Stop");
            RulexTrailer.Response response = RulexTrailer.Response.getDefaultInstance();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
