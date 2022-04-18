package com.service2;

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

import io.grpc.stub.StreamObserver;

/**
 * <pre>
 *creating grp service. You specify methods
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class service2Grpc {

  private service2Grpc() {}

  public static final String SERVICE_NAME = "service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service2.Msg,
      com.service2.Response> getEnableAlarmOnAppMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enableAlarmOnApp",
      requestType = com.service2.Msg.class,
      responseType = com.service2.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.service2.Msg,
      com.service2.Response> getEnableAlarmOnAppMethod() {
    io.grpc.MethodDescriptor<com.service2.Msg, com.service2.Response> getEnableAlarmOnAppMethod;
    if ((getEnableAlarmOnAppMethod = service2Grpc.getEnableAlarmOnAppMethod) == null) {
      synchronized (service2Grpc.class) {
        if ((getEnableAlarmOnAppMethod = service2Grpc.getEnableAlarmOnAppMethod) == null) {
          service2Grpc.getEnableAlarmOnAppMethod = getEnableAlarmOnAppMethod = 
              io.grpc.MethodDescriptor.<com.service2.Msg, com.service2.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2", "enableAlarmOnApp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service2.Msg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service2.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new service2MethodDescriptorSupplier("enableAlarmOnApp"))
                  .build();
          }
        }
     }
     return getEnableAlarmOnAppMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static service2Stub newStub(io.grpc.Channel channel) {
    return new service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new service2FutureStub(channel);
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static abstract class service2ImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.service2.Msg> enableAlarmOnApp(
        io.grpc.stub.StreamObserver<com.service2.Response> responseObserver) {
      return asyncUnimplementedStreamingCall(getEnableAlarmOnAppMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnableAlarmOnAppMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.service2.Msg,
                com.service2.Response>(
                  this, METHODID_ENABLE_ALARM_ON_APP)))
          .build();
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service2Stub extends io.grpc.stub.AbstractStub<service2Stub> {
    private service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service2Stub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.service2.Msg> enableAlarmOnApp(
        io.grpc.stub.StreamObserver<com.service2.Response> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getEnableAlarmOnAppMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service2BlockingStub extends io.grpc.stub.AbstractStub<service2BlockingStub> {
    private service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service2BlockingStub(channel, callOptions);
    }

	public StreamObserver<Msg> enableAlarmOnApp(StreamObserver<Response> responseObserver) {
		// TODO Auto-generated method stub
		return null;
	}
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service2FutureStub extends io.grpc.stub.AbstractStub<service2FutureStub> {
    private service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service2FutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ENABLE_ALARM_ON_APP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENABLE_ALARM_ON_APP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enableAlarmOnApp(
              (io.grpc.stub.StreamObserver<com.service2.Response>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service2.Service2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("service2");
    }
  }

  private static final class service2FileDescriptorSupplier
      extends service2BaseDescriptorSupplier {
    service2FileDescriptorSupplier() {}
  }

  private static final class service2MethodDescriptorSupplier
      extends service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new service2FileDescriptorSupplier())
              .addMethod(getEnableAlarmOnAppMethod())
              .build();
        }
      }
    }
    return result;
  }
}
