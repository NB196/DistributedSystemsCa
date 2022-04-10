package com.service1;

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
    comments = "Source: service1.proto")
public final class service1Grpc {

  private service1Grpc() {}

  public static final String SERVICE_NAME = "service1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.containsString> getGetFirstStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirstString",
      requestType = com.service1.containsString.class,
      responseType = com.service1.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.containsString> getGetFirstStringMethod() {
    io.grpc.MethodDescriptor<com.service1.containsString, com.service1.containsString> getGetFirstStringMethod;
    if ((getGetFirstStringMethod = service1Grpc.getGetFirstStringMethod) == null) {
      synchronized (service1Grpc.class) {
        if ((getGetFirstStringMethod = service1Grpc.getGetFirstStringMethod) == null) {
          service1Grpc.getGetFirstStringMethod = getGetFirstStringMethod = 
              io.grpc.MethodDescriptor.<com.service1.containsString, com.service1.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1", "GetFirstString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new service1MethodDescriptorSupplier("GetFirstString"))
                  .build();
          }
        }
     }
     return getGetFirstStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.newResponse> getGetFirstIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirstInt",
      requestType = com.service1.containsString.class,
      responseType = com.service1.newResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.newResponse> getGetFirstIntMethod() {
    io.grpc.MethodDescriptor<com.service1.containsString, com.service1.newResponse> getGetFirstIntMethod;
    if ((getGetFirstIntMethod = service1Grpc.getGetFirstIntMethod) == null) {
      synchronized (service1Grpc.class) {
        if ((getGetFirstIntMethod = service1Grpc.getGetFirstIntMethod) == null) {
          service1Grpc.getGetFirstIntMethod = getGetFirstIntMethod = 
              io.grpc.MethodDescriptor.<com.service1.containsString, com.service1.newResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1", "GetFirstInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.newResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new service1MethodDescriptorSupplier("GetFirstInt"))
                  .build();
          }
        }
     }
     return getGetFirstIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.containsString> getGetFirstStringServerStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirstStringServerStreaming",
      requestType = com.service1.containsString.class,
      responseType = com.service1.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.containsString> getGetFirstStringServerStreamingMethod() {
    io.grpc.MethodDescriptor<com.service1.containsString, com.service1.containsString> getGetFirstStringServerStreamingMethod;
    if ((getGetFirstStringServerStreamingMethod = service1Grpc.getGetFirstStringServerStreamingMethod) == null) {
      synchronized (service1Grpc.class) {
        if ((getGetFirstStringServerStreamingMethod = service1Grpc.getGetFirstStringServerStreamingMethod) == null) {
          service1Grpc.getGetFirstStringServerStreamingMethod = getGetFirstStringServerStreamingMethod = 
              io.grpc.MethodDescriptor.<com.service1.containsString, com.service1.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1", "GetFirstStringServerStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new service1MethodDescriptorSupplier("GetFirstStringServerStreaming"))
                  .build();
          }
        }
     }
     return getGetFirstStringServerStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.containsString> getSendStringClientStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendStringClientStreaming",
      requestType = com.service1.containsString.class,
      responseType = com.service1.containsString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.service1.containsString,
      com.service1.containsString> getSendStringClientStreamingMethod() {
    io.grpc.MethodDescriptor<com.service1.containsString, com.service1.containsString> getSendStringClientStreamingMethod;
    if ((getSendStringClientStreamingMethod = service1Grpc.getSendStringClientStreamingMethod) == null) {
      synchronized (service1Grpc.class) {
        if ((getSendStringClientStreamingMethod = service1Grpc.getSendStringClientStreamingMethod) == null) {
          service1Grpc.getSendStringClientStreamingMethod = getSendStringClientStreamingMethod = 
              io.grpc.MethodDescriptor.<com.service1.containsString, com.service1.containsString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1", "SendStringClientStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.containsString.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.service1.containsString.getDefaultInstance()))
                  .setSchemaDescriptor(new service1MethodDescriptorSupplier("SendStringClientStreaming"))
                  .build();
          }
        }
     }
     return getSendStringClientStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static service1Stub newStub(io.grpc.Channel channel) {
    return new service1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static service1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new service1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static service1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new service1FutureStub(channel);
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static abstract class service1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *this is a unary. To create a stream, you need to include the stream keyword if you want it to be a stream.
     * </pre>
     */
    public void getFirstString(com.service1.containsString request,
        io.grpc.stub.StreamObserver<com.service1.containsString> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirstStringMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unary. second rpc. Get an int from the server. when you add a new rpc, make sure you run maven build on the pom file
     * </pre>
     */
    public void getFirstInt(com.service1.containsString request,
        io.grpc.stub.StreamObserver<com.service1.newResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirstIntMethod(), responseObserver);
    }

    /**
     * <pre>
     *server streaming rpc
     * </pre>
     */
    public void getFirstStringServerStreaming(com.service1.containsString request,
        io.grpc.stub.StreamObserver<com.service1.containsString> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirstStringServerStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming rpc.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.service1.containsString> sendStringClientStreaming(
        io.grpc.stub.StreamObserver<com.service1.containsString> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendStringClientStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFirstStringMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service1.containsString,
                com.service1.containsString>(
                  this, METHODID_GET_FIRST_STRING)))
          .addMethod(
            getGetFirstIntMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.service1.containsString,
                com.service1.newResponse>(
                  this, METHODID_GET_FIRST_INT)))
          .addMethod(
            getGetFirstStringServerStreamingMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.service1.containsString,
                com.service1.containsString>(
                  this, METHODID_GET_FIRST_STRING_SERVER_STREAMING)))
          .addMethod(
            getSendStringClientStreamingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.service1.containsString,
                com.service1.containsString>(
                  this, METHODID_SEND_STRING_CLIENT_STREAMING)))
          .build();
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service1Stub extends io.grpc.stub.AbstractStub<service1Stub> {
    private service1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private service1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service1Stub(channel, callOptions);
    }

    /**
     * <pre>
     *this is a unary. To create a stream, you need to include the stream keyword if you want it to be a stream.
     * </pre>
     */
    public void getFirstString(com.service1.containsString request,
        io.grpc.stub.StreamObserver<com.service1.containsString> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFirstStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Unary. second rpc. Get an int from the server. when you add a new rpc, make sure you run maven build on the pom file
     * </pre>
     */
    public void getFirstInt(com.service1.containsString request,
        io.grpc.stub.StreamObserver<com.service1.newResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFirstIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server streaming rpc
     * </pre>
     */
    public void getFirstStringServerStreaming(com.service1.containsString request,
        io.grpc.stub.StreamObserver<com.service1.containsString> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetFirstStringServerStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming rpc.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.service1.containsString> sendStringClientStreaming(
        io.grpc.stub.StreamObserver<com.service1.containsString> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendStringClientStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service1BlockingStub extends io.grpc.stub.AbstractStub<service1BlockingStub> {
    private service1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *this is a unary. To create a stream, you need to include the stream keyword if you want it to be a stream.
     * </pre>
     */
    public com.service1.containsString getFirstString(com.service1.containsString request) {
      return blockingUnaryCall(
          getChannel(), getGetFirstStringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Unary. second rpc. Get an int from the server. when you add a new rpc, make sure you run maven build on the pom file
     * </pre>
     */
    public com.service1.newResponse getFirstInt(com.service1.containsString request) {
      return blockingUnaryCall(
          getChannel(), getGetFirstIntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server streaming rpc
     * </pre>
     */
    public java.util.Iterator<com.service1.containsString> getFirstStringServerStreaming(
        com.service1.containsString request) {
      return blockingServerStreamingCall(
          getChannel(), getGetFirstStringServerStreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *creating grp service. You specify methods
   * </pre>
   */
  public static final class service1FutureStub extends io.grpc.stub.AbstractStub<service1FutureStub> {
    private service1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private service1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected service1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new service1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *this is a unary. To create a stream, you need to include the stream keyword if you want it to be a stream.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service1.containsString> getFirstString(
        com.service1.containsString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFirstStringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Unary. second rpc. Get an int from the server. when you add a new rpc, make sure you run maven build on the pom file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.service1.newResponse> getFirstInt(
        com.service1.containsString request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFirstIntMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FIRST_STRING = 0;
  private static final int METHODID_GET_FIRST_INT = 1;
  private static final int METHODID_GET_FIRST_STRING_SERVER_STREAMING = 2;
  private static final int METHODID_SEND_STRING_CLIENT_STREAMING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final service1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(service1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FIRST_STRING:
          serviceImpl.getFirstString((com.service1.containsString) request,
              (io.grpc.stub.StreamObserver<com.service1.containsString>) responseObserver);
          break;
        case METHODID_GET_FIRST_INT:
          serviceImpl.getFirstInt((com.service1.containsString) request,
              (io.grpc.stub.StreamObserver<com.service1.newResponse>) responseObserver);
          break;
        case METHODID_GET_FIRST_STRING_SERVER_STREAMING:
          serviceImpl.getFirstStringServerStreaming((com.service1.containsString) request,
              (io.grpc.stub.StreamObserver<com.service1.containsString>) responseObserver);
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
        case METHODID_SEND_STRING_CLIENT_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendStringClientStreaming(
              (io.grpc.stub.StreamObserver<com.service1.containsString>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    service1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.service1.Service1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("service1");
    }
  }

  private static final class service1FileDescriptorSupplier
      extends service1BaseDescriptorSupplier {
    service1FileDescriptorSupplier() {}
  }

  private static final class service1MethodDescriptorSupplier
      extends service1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    service1MethodDescriptorSupplier(String methodName) {
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
      synchronized (service1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new service1FileDescriptorSupplier())
              .addMethod(getGetFirstStringMethod())
              .addMethod(getGetFirstIntMethod())
              .addMethod(getGetFirstStringServerStreamingMethod())
              .addMethod(getSendStringClientStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
