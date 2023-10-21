package trailer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: trailer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrailerGrpc {

  private TrailerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "trailer.Trailer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<trailer.RulexTrailer.Config,
      trailer.RulexTrailer.Response> getInitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Init",
      requestType = trailer.RulexTrailer.Config.class,
      responseType = trailer.RulexTrailer.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trailer.RulexTrailer.Config,
      trailer.RulexTrailer.Response> getInitMethod() {
    io.grpc.MethodDescriptor<trailer.RulexTrailer.Config, trailer.RulexTrailer.Response> getInitMethod;
    if ((getInitMethod = TrailerGrpc.getInitMethod) == null) {
      synchronized (TrailerGrpc.class) {
        if ((getInitMethod = TrailerGrpc.getInitMethod) == null) {
          TrailerGrpc.getInitMethod = getInitMethod =
              io.grpc.MethodDescriptor.<trailer.RulexTrailer.Config, trailer.RulexTrailer.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Init"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.Config.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TrailerMethodDescriptorSupplier("Init"))
              .build();
        }
      }
    }
    return getInitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.Response> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Start",
      requestType = trailer.RulexTrailer.Request.class,
      responseType = trailer.RulexTrailer.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.Response> getStartMethod() {
    io.grpc.MethodDescriptor<trailer.RulexTrailer.Request, trailer.RulexTrailer.Response> getStartMethod;
    if ((getStartMethod = TrailerGrpc.getStartMethod) == null) {
      synchronized (TrailerGrpc.class) {
        if ((getStartMethod = TrailerGrpc.getStartMethod) == null) {
          TrailerGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<trailer.RulexTrailer.Request, trailer.RulexTrailer.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TrailerMethodDescriptorSupplier("Start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.StatusResponse> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = trailer.RulexTrailer.Request.class,
      responseType = trailer.RulexTrailer.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.StatusResponse> getStatusMethod() {
    io.grpc.MethodDescriptor<trailer.RulexTrailer.Request, trailer.RulexTrailer.StatusResponse> getStatusMethod;
    if ((getStatusMethod = TrailerGrpc.getStatusMethod) == null) {
      synchronized (TrailerGrpc.class) {
        if ((getStatusMethod = TrailerGrpc.getStatusMethod) == null) {
          TrailerGrpc.getStatusMethod = getStatusMethod =
              io.grpc.MethodDescriptor.<trailer.RulexTrailer.Request, trailer.RulexTrailer.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailerMethodDescriptorSupplier("Status"))
              .build();
        }
      }
    }
    return getStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trailer.RulexTrailer.ServiceRequest,
      trailer.RulexTrailer.ServiceResponse> getServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Service",
      requestType = trailer.RulexTrailer.ServiceRequest.class,
      responseType = trailer.RulexTrailer.ServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trailer.RulexTrailer.ServiceRequest,
      trailer.RulexTrailer.ServiceResponse> getServiceMethod() {
    io.grpc.MethodDescriptor<trailer.RulexTrailer.ServiceRequest, trailer.RulexTrailer.ServiceResponse> getServiceMethod;
    if ((getServiceMethod = TrailerGrpc.getServiceMethod) == null) {
      synchronized (TrailerGrpc.class) {
        if ((getServiceMethod = TrailerGrpc.getServiceMethod) == null) {
          TrailerGrpc.getServiceMethod = getServiceMethod =
              io.grpc.MethodDescriptor.<trailer.RulexTrailer.ServiceRequest, trailer.RulexTrailer.ServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Service"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.ServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.ServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailerMethodDescriptorSupplier("Service"))
              .build();
        }
      }
    }
    return getServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trailer.RulexTrailer.DataRowsRequest,
      trailer.RulexTrailer.DataRowsResponse> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = trailer.RulexTrailer.DataRowsRequest.class,
      responseType = trailer.RulexTrailer.DataRowsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trailer.RulexTrailer.DataRowsRequest,
      trailer.RulexTrailer.DataRowsResponse> getQueryMethod() {
    io.grpc.MethodDescriptor<trailer.RulexTrailer.DataRowsRequest, trailer.RulexTrailer.DataRowsResponse> getQueryMethod;
    if ((getQueryMethod = TrailerGrpc.getQueryMethod) == null) {
      synchronized (TrailerGrpc.class) {
        if ((getQueryMethod = TrailerGrpc.getQueryMethod) == null) {
          TrailerGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<trailer.RulexTrailer.DataRowsRequest, trailer.RulexTrailer.DataRowsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.DataRowsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.DataRowsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailerMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trailer.RulexTrailer.SchemaRequest,
      trailer.RulexTrailer.SchemaResponse> getSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Schema",
      requestType = trailer.RulexTrailer.SchemaRequest.class,
      responseType = trailer.RulexTrailer.SchemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trailer.RulexTrailer.SchemaRequest,
      trailer.RulexTrailer.SchemaResponse> getSchemaMethod() {
    io.grpc.MethodDescriptor<trailer.RulexTrailer.SchemaRequest, trailer.RulexTrailer.SchemaResponse> getSchemaMethod;
    if ((getSchemaMethod = TrailerGrpc.getSchemaMethod) == null) {
      synchronized (TrailerGrpc.class) {
        if ((getSchemaMethod = TrailerGrpc.getSchemaMethod) == null) {
          TrailerGrpc.getSchemaMethod = getSchemaMethod =
              io.grpc.MethodDescriptor.<trailer.RulexTrailer.SchemaRequest, trailer.RulexTrailer.SchemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Schema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.SchemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.SchemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrailerMethodDescriptorSupplier("Schema"))
              .build();
        }
      }
    }
    return getSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.Response> getStopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Stop",
      requestType = trailer.RulexTrailer.Request.class,
      responseType = trailer.RulexTrailer.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<trailer.RulexTrailer.Request,
      trailer.RulexTrailer.Response> getStopMethod() {
    io.grpc.MethodDescriptor<trailer.RulexTrailer.Request, trailer.RulexTrailer.Response> getStopMethod;
    if ((getStopMethod = TrailerGrpc.getStopMethod) == null) {
      synchronized (TrailerGrpc.class) {
        if ((getStopMethod = TrailerGrpc.getStopMethod) == null) {
          TrailerGrpc.getStopMethod = getStopMethod =
              io.grpc.MethodDescriptor.<trailer.RulexTrailer.Request, trailer.RulexTrailer.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Stop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  trailer.RulexTrailer.Response.getDefaultInstance()))
              .setSchemaDescriptor(new TrailerMethodDescriptorSupplier("Stop"))
              .build();
        }
      }
    }
    return getStopMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrailerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailerStub>() {
        @java.lang.Override
        public TrailerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailerStub(channel, callOptions);
        }
      };
    return TrailerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrailerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailerBlockingStub>() {
        @java.lang.Override
        public TrailerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailerBlockingStub(channel, callOptions);
        }
      };
    return TrailerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrailerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrailerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrailerFutureStub>() {
        @java.lang.Override
        public TrailerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrailerFutureStub(channel, callOptions);
        }
      };
    return TrailerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    default void init(trailer.RulexTrailer.Config request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitMethod(), responseObserver);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    default void start(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    default void status(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    default void service(trailer.RulexTrailer.ServiceRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.ServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    default void query(trailer.RulexTrailer.DataRowsRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.DataRowsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    default void schema(trailer.RulexTrailer.SchemaRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.SchemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSchemaMethod(), responseObserver);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    default void stop(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Trailer.
   */
  public static abstract class TrailerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrailerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Trailer.
   */
  public static final class TrailerStub
      extends io.grpc.stub.AbstractAsyncStub<TrailerStub> {
    private TrailerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    public void init(trailer.RulexTrailer.Config request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    public void start(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    public void status(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    public void service(trailer.RulexTrailer.ServiceRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.ServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    public void query(trailer.RulexTrailer.DataRowsRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.DataRowsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    public void schema(trailer.RulexTrailer.SchemaRequest request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.SchemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    public void stop(trailer.RulexTrailer.Request request,
        io.grpc.stub.StreamObserver<trailer.RulexTrailer.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Trailer.
   */
  public static final class TrailerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrailerBlockingStub> {
    private TrailerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    public trailer.RulexTrailer.Response init(trailer.RulexTrailer.Config request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    public trailer.RulexTrailer.Response start(trailer.RulexTrailer.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    public trailer.RulexTrailer.StatusResponse status(trailer.RulexTrailer.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    public trailer.RulexTrailer.ServiceResponse service(trailer.RulexTrailer.ServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    public trailer.RulexTrailer.DataRowsResponse query(trailer.RulexTrailer.DataRowsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    public trailer.RulexTrailer.SchemaResponse schema(trailer.RulexTrailer.SchemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSchemaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    public trailer.RulexTrailer.Response stop(trailer.RulexTrailer.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Trailer.
   */
  public static final class TrailerFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrailerFutureStub> {
    private TrailerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrailerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrailerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 初始化, 主要是为了传配置进去
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.Response> init(
        trailer.RulexTrailer.Config request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 启动
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.Response> start(
        trailer.RulexTrailer.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.StatusResponse> status(
        trailer.RulexTrailer.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 服务调用
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.ServiceResponse> service(
        trailer.RulexTrailer.ServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 数据查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.DataRowsResponse> query(
        trailer.RulexTrailer.DataRowsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 数据模型
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.SchemaResponse> schema(
        trailer.RulexTrailer.SchemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSchemaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 停止
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<trailer.RulexTrailer.Response> stop(
        trailer.RulexTrailer.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT = 0;
  private static final int METHODID_START = 1;
  private static final int METHODID_STATUS = 2;
  private static final int METHODID_SERVICE = 3;
  private static final int METHODID_QUERY = 4;
  private static final int METHODID_SCHEMA = 5;
  private static final int METHODID_STOP = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getInitMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              trailer.RulexTrailer.Config,
              trailer.RulexTrailer.Response>(
                service, METHODID_INIT)))
        .addMethod(
          getStartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              trailer.RulexTrailer.Request,
              trailer.RulexTrailer.Response>(
                service, METHODID_START)))
        .addMethod(
          getStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              trailer.RulexTrailer.Request,
              trailer.RulexTrailer.StatusResponse>(
                service, METHODID_STATUS)))
        .addMethod(
          getServiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              trailer.RulexTrailer.ServiceRequest,
              trailer.RulexTrailer.ServiceResponse>(
                service, METHODID_SERVICE)))
        .addMethod(
          getQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              trailer.RulexTrailer.DataRowsRequest,
              trailer.RulexTrailer.DataRowsResponse>(
                service, METHODID_QUERY)))
        .addMethod(
          getSchemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              trailer.RulexTrailer.SchemaRequest,
              trailer.RulexTrailer.SchemaResponse>(
                service, METHODID_SCHEMA)))
        .addMethod(
          getStopMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              trailer.RulexTrailer.Request,
              trailer.RulexTrailer.Response>(
                service, METHODID_STOP)))
        .build();
  }

  private static abstract class TrailerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrailerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return trailer.RulexTrailer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Trailer");
    }
  }

  private static final class TrailerFileDescriptorSupplier
      extends TrailerBaseDescriptorSupplier {
    TrailerFileDescriptorSupplier() {}
  }

  private static final class TrailerMethodDescriptorSupplier
      extends TrailerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrailerMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
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
              .setSchemaDescriptor(new TrailerFileDescriptorSupplier())
              .addMethod(getInitMethod())
              .addMethod(getStartMethod())
              .addMethod(getStatusMethod())
              .addMethod(getServiceMethod())
              .addMethod(getQueryMethod())
              .addMethod(getSchemaMethod())
              .addMethod(getStopMethod())
              .build();
        }
      }
    }
    return result;
  }
}
