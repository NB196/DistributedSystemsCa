package com.service3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *creating grp service. You specify methods
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service3.proto")
public final class service3Grpc {

  private service3Grpc() {}

  public static final String SERVICE_NAME = "service3";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service3.authenticateRequest,
      com.service3.authenticateReply> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = com.service3.authenticateRequest.class,
      responseType = com.service3.authenticateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service3.authenticateRequest,
      com.service3.authenticateReply> getLoginMethod() {
    io.grpc.MethodDescriptor<com.service3.authenticateRequest, com.service3.authenticateReply> getLoginMethod;
    if ((getLoginMethod = service3Grpc.getLoginMethod) == null) {
      synchronized (service3Grpc.class) {
        if ((getLoginMethod = service3Grpc.getLoginMethod) == null) {
          service3Grpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.service3.authenticateRequest, com.service3.authenticateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service3", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service3.authenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service3.authenticateReply.getDefaultInstance()))
                  .setSchemaDescriptor(new service3MethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static service3Stub newStub(io.grpc.Channel channel) {
    return new service3Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static service3BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new service3BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static service3FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new service3FutureStub(channel);
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static abstract class service3ImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.service3.authenticateRequest request,
        io.grpc.stub.StreamObserver<com.service3.authenticateReply> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service3.authenticateRequest,
                com.service3.authenticateReply>(
                  this, METHODID_LOGIN)))
          .build();
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service3Stub extends io.grpc.stub.AbstractStub<service3Stub> {
    private service3Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private service3Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service3Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service3Stub(channel, callOptions);
    }

    /**
     */
    public void login(com.service3.authenticateRequest request,
        io.grpc.stub.StreamObserver<com.service3.authenticateReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service3BlockingStub extends io.grpc.stub.AbstractStub<service3BlockingStub> {
    private service3BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service3BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service3BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service3BlockingStub(channel, callOptions);
    }

    /**
     */
    public com.service3.authenticateReply login(com.service3.authenticateRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service3FutureStub extends io.grpc.stub.AbstractStub<service3FutureStub> {
    private service3FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service3FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service3FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service3FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service3.authenticateReply> login(
        com.service3.authenticateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final service3ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(service3ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.service3.authenticateRequest) request,
              (io.grpc.stub.StreamObserver<com.service3.authenticateReply>) responseObserver);
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

  private static abstract class service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    service3BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service3.Service3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("service3");
    }
  }

  private static final class service3FileDescriptorSupplier
      extends service3BaseDescriptorSupplier {
    service3FileDescriptorSupplier() {}
  }

  private static final class service3MethodDescriptorSupplier
      extends service3BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    service3MethodDescriptorSupplier(String methodName) {
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
      synchronized (service3Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new service3FileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
