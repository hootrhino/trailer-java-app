package com.hootrhino;

import io.grpc.Deadline;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;
import trailer.RulexTrailer;
import trailer.TrailerGrpc;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class TrailerClient {
    public static void main(String[] args) throws InterruptedException {
        String target = "localhost:7701";
        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
                .build();
        TrailerGrpc.TrailerStub asyncStub = TrailerGrpc.newStub(channel);

        TrailerGrpc.TrailerBlockingStub blockingStub = TrailerGrpc.newBlockingStub(channel);
        new Thread(() -> {
//            asyncStub.clientStreamMethod(new StreamObserver<RulexTrailer.StreamResponse>() {
//                @Override
//                public void onNext(RulexTrailer.StreamResponse value) {
//                }
//
//                @Override
//                public void onError(Throwable t) {
//                }
//
//                @Override
//                public void onCompleted() {
//                }
//            });
//            asyncStub.biStream(new StreamObserver<RulexTrailer.StreamResponse>() {
//                @Override
//                public void onNext(RulexTrailer.StreamResponse value) {
//
//                }
//
//                @Override
//                public void onError(Throwable t) {
//
//                }
//
//                @Override
//                public void onCompleted() {
//
//                }
//            });

            RulexTrailer.StreamRequest streamRequest = RulexTrailer.StreamRequest.newBuilder()
                    .build();
            Iterator<RulexTrailer.StreamResponse> streamResponseIterator = blockingStub.onStream(streamRequest);
            while(streamResponseIterator.hasNext()) {
                RulexTrailer.StreamResponse next = streamResponseIterator.next();
                System.out.println(next.getCode());
            }
        }).start();
        if (true) {
            return;
        }
        int N = (int)1e5;
        long l = System.currentTimeMillis();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(8, 8, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        System.out.println("start...");
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (int i = 0; i < N; i++) {
            executor.execute(() -> {
                try {
                    RulexTrailer.Request request = RulexTrailer.Request.newBuilder()
                            .build();
                    RulexTrailer.StatusResponse status = blockingStub.status(request);
                    String message = status.getMessage();
                    RulexTrailer.StatusResponse.Status status1 = status.getStatus();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    atomicInteger.addAndGet(1);
                }
            });
        }

        while(true) {
            System.out.printf("end elapsed %d ms, %s %d\n", System.currentTimeMillis() - l, "count = ", atomicInteger.get());
            Thread.sleep(2000);
        }
    }
}
