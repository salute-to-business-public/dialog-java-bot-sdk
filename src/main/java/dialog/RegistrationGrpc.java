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
    comments = "Source: registration.proto")
public final class RegistrationGrpc {

  private RegistrationGrpc() {}

  public static final String SERVICE_NAME = "dialog.Registration";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken,
      dialog.RegistrationOuterClass.ResponseDeviceRequest> getExchangeAuthIdForTokenMethod;

  public static io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken,
      dialog.RegistrationOuterClass.ResponseDeviceRequest> getExchangeAuthIdForTokenMethod() {
    io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken, dialog.RegistrationOuterClass.ResponseDeviceRequest> getExchangeAuthIdForTokenMethod;
    if ((getExchangeAuthIdForTokenMethod = RegistrationGrpc.getExchangeAuthIdForTokenMethod) == null) {
      synchronized (RegistrationGrpc.class) {
        if ((getExchangeAuthIdForTokenMethod = RegistrationGrpc.getExchangeAuthIdForTokenMethod) == null) {
          RegistrationGrpc.getExchangeAuthIdForTokenMethod = getExchangeAuthIdForTokenMethod = 
              io.grpc.MethodDescriptor.<dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken, dialog.RegistrationOuterClass.ResponseDeviceRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Registration", "ExchangeAuthIdForToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RegistrationOuterClass.ResponseDeviceRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationMethodDescriptorSupplier("ExchangeAuthIdForToken"))
                  .build();
          }
        }
     }
     return getExchangeAuthIdForTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RequestRegisterDevice,
      dialog.RegistrationOuterClass.ResponseDeviceRequest> getRegisterDeviceMethod;

  public static io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RequestRegisterDevice,
      dialog.RegistrationOuterClass.ResponseDeviceRequest> getRegisterDeviceMethod() {
    io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RequestRegisterDevice, dialog.RegistrationOuterClass.ResponseDeviceRequest> getRegisterDeviceMethod;
    if ((getRegisterDeviceMethod = RegistrationGrpc.getRegisterDeviceMethod) == null) {
      synchronized (RegistrationGrpc.class) {
        if ((getRegisterDeviceMethod = RegistrationGrpc.getRegisterDeviceMethod) == null) {
          RegistrationGrpc.getRegisterDeviceMethod = getRegisterDeviceMethod = 
              io.grpc.MethodDescriptor.<dialog.RegistrationOuterClass.RequestRegisterDevice, dialog.RegistrationOuterClass.ResponseDeviceRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Registration", "RegisterDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RegistrationOuterClass.RequestRegisterDevice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RegistrationOuterClass.ResponseDeviceRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationMethodDescriptorSupplier("RegisterDevice"))
                  .build();
          }
        }
     }
     return getRegisterDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest,
      dialog.RegistrationOuterClass.ResponseDeviceRequest> getRegisterDeprecatedDeviceMethod;

  public static io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest,
      dialog.RegistrationOuterClass.ResponseDeviceRequest> getRegisterDeprecatedDeviceMethod() {
    io.grpc.MethodDescriptor<dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest, dialog.RegistrationOuterClass.ResponseDeviceRequest> getRegisterDeprecatedDeviceMethod;
    if ((getRegisterDeprecatedDeviceMethod = RegistrationGrpc.getRegisterDeprecatedDeviceMethod) == null) {
      synchronized (RegistrationGrpc.class) {
        if ((getRegisterDeprecatedDeviceMethod = RegistrationGrpc.getRegisterDeprecatedDeviceMethod) == null) {
          RegistrationGrpc.getRegisterDeprecatedDeviceMethod = getRegisterDeprecatedDeviceMethod = 
              io.grpc.MethodDescriptor.<dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest, dialog.RegistrationOuterClass.ResponseDeviceRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Registration", "RegisterDeprecatedDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.RegistrationOuterClass.ResponseDeviceRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new RegistrationMethodDescriptorSupplier("RegisterDeprecatedDevice"))
                  .build();
          }
        }
     }
     return getRegisterDeprecatedDeviceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistrationStub newStub(io.grpc.Channel channel) {
    return new RegistrationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistrationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegistrationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistrationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegistrationFutureStub(channel);
  }

  /**
   */
  public static abstract class RegistrationImplBase implements io.grpc.BindableService {

    /**
     */
    public void exchangeAuthIdForToken(dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken request,
        io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getExchangeAuthIdForTokenMethod(), responseObserver);
    }

    /**
     */
    public void registerDevice(dialog.RegistrationOuterClass.RequestRegisterDevice request,
        io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterDeviceMethod(), responseObserver);
    }

    /**
     */
    public void registerDeprecatedDevice(dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest request,
        io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterDeprecatedDeviceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExchangeAuthIdForTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken,
                dialog.RegistrationOuterClass.ResponseDeviceRequest>(
                  this, METHODID_EXCHANGE_AUTH_ID_FOR_TOKEN)))
          .addMethod(
            getRegisterDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.RegistrationOuterClass.RequestRegisterDevice,
                dialog.RegistrationOuterClass.ResponseDeviceRequest>(
                  this, METHODID_REGISTER_DEVICE)))
          .addMethod(
            getRegisterDeprecatedDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest,
                dialog.RegistrationOuterClass.ResponseDeviceRequest>(
                  this, METHODID_REGISTER_DEPRECATED_DEVICE)))
          .build();
    }
  }

  /**
   */
  public static final class RegistrationStub extends io.grpc.stub.AbstractStub<RegistrationStub> {
    private RegistrationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationStub(channel, callOptions);
    }

    /**
     */
    public void exchangeAuthIdForToken(dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken request,
        io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExchangeAuthIdForTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerDevice(dialog.RegistrationOuterClass.RequestRegisterDevice request,
        io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerDeprecatedDevice(dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest request,
        io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterDeprecatedDeviceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegistrationBlockingStub extends io.grpc.stub.AbstractStub<RegistrationBlockingStub> {
    private RegistrationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.RegistrationOuterClass.ResponseDeviceRequest exchangeAuthIdForToken(dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken request) {
      return blockingUnaryCall(
          getChannel(), getExchangeAuthIdForTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.RegistrationOuterClass.ResponseDeviceRequest registerDevice(dialog.RegistrationOuterClass.RequestRegisterDevice request) {
      return blockingUnaryCall(
          getChannel(), getRegisterDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.RegistrationOuterClass.ResponseDeviceRequest registerDeprecatedDevice(dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterDeprecatedDeviceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegistrationFutureStub extends io.grpc.stub.AbstractStub<RegistrationFutureStub> {
    private RegistrationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegistrationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistrationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegistrationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.RegistrationOuterClass.ResponseDeviceRequest> exchangeAuthIdForToken(
        dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken request) {
      return futureUnaryCall(
          getChannel().newCall(getExchangeAuthIdForTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.RegistrationOuterClass.ResponseDeviceRequest> registerDevice(
        dialog.RegistrationOuterClass.RequestRegisterDevice request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.RegistrationOuterClass.ResponseDeviceRequest> registerDeprecatedDevice(
        dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterDeprecatedDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE_AUTH_ID_FOR_TOKEN = 0;
  private static final int METHODID_REGISTER_DEVICE = 1;
  private static final int METHODID_REGISTER_DEPRECATED_DEVICE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistrationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistrationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXCHANGE_AUTH_ID_FOR_TOKEN:
          serviceImpl.exchangeAuthIdForToken((dialog.RegistrationOuterClass.RequestExchangeAuthIdForToken) request,
              (io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest>) responseObserver);
          break;
        case METHODID_REGISTER_DEVICE:
          serviceImpl.registerDevice((dialog.RegistrationOuterClass.RequestRegisterDevice) request,
              (io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest>) responseObserver);
          break;
        case METHODID_REGISTER_DEPRECATED_DEVICE:
          serviceImpl.registerDeprecatedDevice((dialog.RegistrationOuterClass.RegisterDeprecatedDeviceRequest) request,
              (io.grpc.stub.StreamObserver<dialog.RegistrationOuterClass.ResponseDeviceRequest>) responseObserver);
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

  private static abstract class RegistrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistrationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.RegistrationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Registration");
    }
  }

  private static final class RegistrationFileDescriptorSupplier
      extends RegistrationBaseDescriptorSupplier {
    RegistrationFileDescriptorSupplier() {}
  }

  private static final class RegistrationMethodDescriptorSupplier
      extends RegistrationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistrationMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistrationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistrationFileDescriptorSupplier())
              .addMethod(getExchangeAuthIdForTokenMethod())
              .addMethod(getRegisterDeviceMethod())
              .addMethod(getRegisterDeprecatedDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
