package trailer;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: trailer.proto")
public final class TrailerGrpc {

  private TrailerGrpc() {}

  public static final String SERVICE_NAME = "trailer.Trailer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.Config,
      trailer.RulexTrailer.Response> METHOD_INIT =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.Config, trailer.RulexTrailer.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "Init"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.Config.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.Response> METHOD_START =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.Request, trailer.RulexTrailer.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "Start"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.StatusResponse> METHOD_STATUS =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.Request, trailer.RulexTrailer.StatusResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "Status"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.StatusResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.ServiceRequest,
      trailer.RulexTrailer.ServiceResponse> METHOD_SERVICE =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.ServiceRequest, trailer.RulexTrailer.ServiceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "Service"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.ServiceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.ServiceResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.StreamRequest,
      trailer.RulexTrailer.StreamResponse> METHOD_ON_STREAM =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.StreamRequest, trailer.RulexTrailer.StreamResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "OnStream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.StreamRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.StreamResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.DataRowsRequest,
      trailer.RulexTrailer.DataRowsResponse> METHOD_QUERY =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.DataRowsRequest, trailer.RulexTrailer.DataRowsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "Query"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.DataRowsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.DataRowsResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.SchemaRequest,
      trailer.RulexTrailer.SchemaResponse> METHOD_SCHEMA =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.SchemaRequest, trailer.RulexTrailer.SchemaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "Schema"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.SchemaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.SchemaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.Response> METHOD_STOP =
      io.grpc.MethodDescriptor.<trailer.RulexTrailer.Request, trailer.RulexTrailer.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trailer.Trailer", "Stop"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              trailer.RulexTrailer.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrailerStub newStub(io.grpc.Channel channel) {
    return new TrailerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrailerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrailerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrailerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrailerFutureStub(channel);
  }

  /**
   */
  public static abstract class TrailerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    public void init(trailer.RulexTrailer.Config request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INIT, responseObserver);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    public void start(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START, responseObserver);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    public void status(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STATUS, responseObserver);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    public void service(trailer.RulexTrailer.ServiceRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.ServiceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SERVICE, responseObserver);
    }

    /**
     * <pre>
     * 流数据
     * </pre>
     */
    public io.grpc.stub.StreamObserver<trailer.RulexTrailer.StreamRequest> onStream(
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ON_STREAM, responseObserver);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    public void query(trailer.RulexTrailer.DataRowsRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.DataRowsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUERY, responseObserver);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    public void schema(trailer.RulexTrailer.SchemaRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.SchemaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SCHEMA, responseObserver);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    public void stop(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_STOP, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_INIT,
            asyncUnaryCall(
              new MethodHandlers<
                trailer.RulexTrailer.Config,
                trailer.RulexTrailer.Response>(
                  this, METHODID_INIT)))
          .addMethod(
            METHOD_START,
            asyncUnaryCall(
              new MethodHandlers<
                trailer.RulexTrailer.Request,
                trailer.RulexTrailer.Response>(
                  this, METHODID_START)))
          .addMethod(
            METHOD_STATUS,
            asyncUnaryCall(
              new MethodHandlers<
                trailer.RulexTrailer.Request,
                trailer.RulexTrailer.StatusResponse>(
                  this, METHODID_STATUS)))
          .addMethod(
            METHOD_SERVICE,
            asyncUnaryCall(
              new MethodHandlers<
                trailer.RulexTrailer.ServiceRequest,
                trailer.RulexTrailer.ServiceResponse>(
                  this, METHODID_SERVICE)))
          .addMethod(
            METHOD_ON_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                trailer.RulexTrailer.StreamRequest,
                trailer.RulexTrailer.StreamResponse>(
                  this, METHODID_ON_STREAM)))
          .addMethod(
            METHOD_QUERY,
            asyncUnaryCall(
              new MethodHandlers<
                trailer.RulexTrailer.DataRowsRequest,
                trailer.RulexTrailer.DataRowsResponse>(
                  this, METHODID_QUERY)))
          .addMethod(
            METHOD_SCHEMA,
            asyncUnaryCall(
              new MethodHandlers<
                trailer.RulexTrailer.SchemaRequest,
                trailer.RulexTrailer.SchemaResponse>(
                  this, METHODID_SCHEMA)))
          .addMethod(
            METHOD_STOP,
            asyncUnaryCall(
              new MethodHandlers<
                trailer.RulexTrailer.Request,
                trailer.RulexTrailer.Response>(
                  this, METHODID_STOP)))
          .build();
    }
  }

  /**
   */
  public static final class TrailerStub extends io.grpc.stub.AbstractStub<TrailerStub> {
    private TrailerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrailerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrailerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    public void init(trailer.RulexTrailer.Config request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INIT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    public void start(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    public void status(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STATUS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    public void service(trailer.RulexTrailer.ServiceRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.ServiceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SERVICE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 流数据
     * </pre>
     */
    public io.grpc.stub.StreamObserver<trailer.RulexTrailer.StreamRequest> onStream(
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ON_STREAM, getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    public void query(trailer.RulexTrailer.DataRowsRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.DataRowsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    public void schema(trailer.RulexTrailer.SchemaRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.SchemaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SCHEMA, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    public void stop(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_STOP, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrailerBlockingStub extends io.grpc.stub.AbstractStub<TrailerBlockingStub> {
    private TrailerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrailerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrailerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    public trailer.RulexTrailer.Response init(trailer.RulexTrailer.Config request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INIT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    public trailer.RulexTrailer.Response start(trailer.RulexTrailer.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    public trailer.RulexTrailer.StatusResponse status(trailer.RulexTrailer.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STATUS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    public trailer.RulexTrailer.ServiceResponse service(trailer.RulexTrailer.ServiceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SERVICE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    public trailer.RulexTrailer.DataRowsResponse query(trailer.RulexTrailer.DataRowsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUERY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    public trailer.RulexTrailer.SchemaResponse schema(trailer.RulexTrailer.SchemaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SCHEMA, getCallOptions(), request);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    public trailer.RulexTrailer.Response stop(trailer.RulexTrailer.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_STOP, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrailerFutureStub extends io.grpc.stub.AbstractStub<TrailerFutureStub> {
    private TrailerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrailerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrailerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.Response> init(
        trailer.RulexTrailer.Config request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INIT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.Response> start(
        trailer.RulexTrailer.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.StatusResponse> status(
        trailer.RulexTrailer.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STATUS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.ServiceResponse> service(
        trailer.RulexTrailer.ServiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SERVICE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.DataRowsResponse> query(
        trailer.RulexTrailer.DataRowsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUERY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.SchemaResponse> schema(
        trailer.RulexTrailer.SchemaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SCHEMA, getCallOptions()), request);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.Response> stop(
        trailer.RulexTrailer.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_STOP, getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT = 0;
  private static final int METHODID_START = 1;
  private static final int METHODID_STATUS = 2;
  private static final int METHODID_SERVICE = 3;
  private static final int METHODID_QUERY = 4;
  private static final int METHODID_SCHEMA = 5;
  private static final int METHODID_STOP = 6;
  private static final int METHODID_ON_STREAM = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrailerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrailerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INIT:
          serviceImpl.init((trailer.RulexTrailer.Config) request,
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response>) responseObserver);
          break;
        case METHODID_START:
          serviceImpl.start((trailer.RulexTrailer.Request) request,
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((trailer.RulexTrailer.Request) request,
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.StatusResponse>) responseObserver);
          break;
        case METHODID_SERVICE:
          serviceImpl.service((trailer.RulexTrailer.ServiceRequest) request,
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.ServiceResponse>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((trailer.RulexTrailer.DataRowsRequest) request,
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.DataRowsResponse>) responseObserver);
          break;
        case METHODID_SCHEMA:
          serviceImpl.schema((trailer.RulexTrailer.SchemaRequest) request,
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.SchemaResponse>) responseObserver);
          break;
        case METHODID_STOP:
          serviceImpl.stop((trailer.RulexTrailer.Request) request,
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ON_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.onStream(
              (io.grpc.stub.StreamObserver<trailer.RulexTrailer.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class TrailerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return trailer.RulexTrailer.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrailerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrailerDescriptorSupplier())
              .addMethod(METHOD_INIT)
              .addMethod(METHOD_START)
              .addMethod(METHOD_STATUS)
              .addMethod(METHOD_SERVICE)
              .addMethod(METHOD_ON_STREAM)
              .addMethod(METHOD_QUERY)
              .addMethod(METHOD_SCHEMA)
              .addMethod(METHOD_STOP)
              .build();
        }
      }
    }
    return result;
  }
}
