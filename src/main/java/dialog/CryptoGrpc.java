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
    comments = "Source: crypto.proto")
public final class CryptoGrpc {

  private CryptoGrpc() {}

  public static final String SERVICE_NAME = "dialog.Crypto";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.CryptoOuterClass.RequestKeyExchange,
      dialog.CryptoOuterClass.ResponseKeyExchange> getKeyExchangeMethod;

  public static io.grpc.MethodDescriptor<dialog.CryptoOuterClass.RequestKeyExchange,
      dialog.CryptoOuterClass.ResponseKeyExchange> getKeyExchangeMethod() {
    io.grpc.MethodDescriptor<dialog.CryptoOuterClass.RequestKeyExchange, dialog.CryptoOuterClass.ResponseKeyExchange> getKeyExchangeMethod;
    if ((getKeyExchangeMethod = CryptoGrpc.getKeyExchangeMethod) == null) {
      synchronized (CryptoGrpc.class) {
        if ((getKeyExchangeMethod = CryptoGrpc.getKeyExchangeMethod) == null) {
          CryptoGrpc.getKeyExchangeMethod = getKeyExchangeMethod = 
              io.grpc.MethodDescriptor.<dialog.CryptoOuterClass.RequestKeyExchange, dialog.CryptoOuterClass.ResponseKeyExchange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Crypto", "KeyExchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.CryptoOuterClass.RequestKeyExchange.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.CryptoOuterClass.ResponseKeyExchange.getDefaultInstance()))
                  .setSchemaDescriptor(new CryptoMethodDescriptorSupplier("KeyExchange"))
                  .build();
          }
        }
     }
     return getKeyExchangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CryptoStub newStub(io.grpc.Channel channel) {
    return new CryptoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CryptoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CryptoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CryptoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CryptoFutureStub(channel);
  }

  /**
   */
  public static abstract class CryptoImplBase implements io.grpc.BindableService {

    /**
     */
    public void keyExchange(dialog.CryptoOuterClass.RequestKeyExchange request,
        io.grpc.stub.StreamObserver<dialog.CryptoOuterClass.ResponseKeyExchange> responseObserver) {
      asyncUnimplementedUnaryCall(getKeyExchangeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getKeyExchangeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.CryptoOuterClass.RequestKeyExchange,
                dialog.CryptoOuterClass.ResponseKeyExchange>(
                  this, METHODID_KEY_EXCHANGE)))
          .build();
    }
  }

  /**
   */
  public static final class CryptoStub extends io.grpc.stub.AbstractStub<CryptoStub> {
    private CryptoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CryptoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CryptoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CryptoStub(channel, callOptions);
    }

    /**
     */
    public void keyExchange(dialog.CryptoOuterClass.RequestKeyExchange request,
        io.grpc.stub.StreamObserver<dialog.CryptoOuterClass.ResponseKeyExchange> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeyExchangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CryptoBlockingStub extends io.grpc.stub.AbstractStub<CryptoBlockingStub> {
    private CryptoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CryptoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CryptoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CryptoBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.CryptoOuterClass.ResponseKeyExchange keyExchange(dialog.CryptoOuterClass.RequestKeyExchange request) {
      return blockingUnaryCall(
          getChannel(), getKeyExchangeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CryptoFutureStub extends io.grpc.stub.AbstractStub<CryptoFutureStub> {
    private CryptoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CryptoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CryptoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CryptoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.CryptoOuterClass.ResponseKeyExchange> keyExchange(
        dialog.CryptoOuterClass.RequestKeyExchange request) {
      return futureUnaryCall(
          getChannel().newCall(getKeyExchangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_KEY_EXCHANGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CryptoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CryptoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_KEY_EXCHANGE:
          serviceImpl.keyExchange((dialog.CryptoOuterClass.RequestKeyExchange) request,
              (io.grpc.stub.StreamObserver<dialog.CryptoOuterClass.ResponseKeyExchange>) responseObserver);
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

  private static abstract class CryptoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CryptoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.CryptoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Crypto");
    }
  }

  private static final class CryptoFileDescriptorSupplier
      extends CryptoBaseDescriptorSupplier {
    CryptoFileDescriptorSupplier() {}
  }

  private static final class CryptoMethodDescriptorSupplier
      extends CryptoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CryptoMethodDescriptorSupplier(String methodName) {
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
      synchronized (CryptoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CryptoFileDescriptorSupplier())
              .addMethod(getKeyExchangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
