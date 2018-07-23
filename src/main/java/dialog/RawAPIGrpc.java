package dialog;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.2)",
    comments = "Source: raw_api.proto")
public final class RawAPIGrpc {

  private RawAPIGrpc() {}

  public static final String SERVICE_NAME = "dialog.RawAPI";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.RawApi.RequestRawRequest,
      dialog.RawApi.ResponseRawRequest> getRawRequestMethod;

  public static io.grpc.MethodDescriptor<dialog.RawApi.RequestRawRequest,
      dialog.RawApi.ResponseRawRequest> getRawRequestMethod() {
    io.grpc.MethodDescriptor<dialog.RawApi.RequestRawRequest, dialog.RawApi.ResponseRawRequest> getRawRequestMethod;
    if ((getRawRequestMethod = RawAPIGrpc.getRawRequestMethod) == null) {
      synchronized (RawAPIGrpc.class) {
        if ((getRawRequestMethod = RawAPIGrpc.getRawRequestMethod) == null) {
          RawAPIGrpc.getRawRequestMethod = getRawRequestMethod = 
              io.grpc.MethodDescriptor.<dialog.RawApi.RequestRawRequest, dialog.RawApi.ResponseRawRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.RawAPI", "RawRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RawApi.RequestRawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RawApi.ResponseRawRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new RawAPIMethodDescriptorSupplier("RawRequest"))
                  .build();
          }
        }
     }
     return getRawRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RawAPIStub newStub(io.grpc.Channel channel) {
    return new RawAPIStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RawAPIBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RawAPIBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RawAPIFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RawAPIFutureStub(channel);
  }

  /**
   */
  public static abstract class RawAPIImplBase implements io.grpc.BindableService {

    /**
     */
    public void rawRequest(dialog.RawApi.RequestRawRequest request,
        io.grpc.stub.StreamObserver<dialog.RawApi.ResponseRawRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getRawRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRawRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.RawApi.RequestRawRequest,
                dialog.RawApi.ResponseRawRequest>(
                  this, METHODID_RAW_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class RawAPIStub extends io.grpc.stub.AbstractStub<RawAPIStub> {
    private RawAPIStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RawAPIStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawAPIStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RawAPIStub(channel, callOptions);
    }

    /**
     */
    public void rawRequest(dialog.RawApi.RequestRawRequest request,
        io.grpc.stub.StreamObserver<dialog.RawApi.ResponseRawRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRawRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RawAPIBlockingStub extends io.grpc.stub.AbstractStub<RawAPIBlockingStub> {
    private RawAPIBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RawAPIBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawAPIBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RawAPIBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.RawApi.ResponseRawRequest rawRequest(dialog.RawApi.RequestRawRequest request) {
      return blockingUnaryCall(
          getChannel(), getRawRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RawAPIFutureStub extends io.grpc.stub.AbstractStub<RawAPIFutureStub> {
    private RawAPIFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RawAPIFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawAPIFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RawAPIFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.RawApi.ResponseRawRequest> rawRequest(
        dialog.RawApi.RequestRawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRawRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RAW_REQUEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RawAPIImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RawAPIImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RAW_REQUEST:
          serviceImpl.rawRequest((dialog.RawApi.RequestRawRequest) request,
              (io.grpc.stub.StreamObserver<dialog.RawApi.ResponseRawRequest>) responseObserver);
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

  private static abstract class RawAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RawAPIBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.RawApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RawAPI");
    }
  }

  private static final class RawAPIFileDescriptorSupplier
      extends RawAPIBaseDescriptorSupplier {
    RawAPIFileDescriptorSupplier() {}
  }

  private static final class RawAPIMethodDescriptorSupplier
      extends RawAPIBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RawAPIMethodDescriptorSupplier(String methodName) {
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
      synchronized (RawAPIGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RawAPIFileDescriptorSupplier())
              .addMethod(getRawRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
