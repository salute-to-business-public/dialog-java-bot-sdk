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
    comments = "Source: push.proto")
public final class PushGrpc {

  private PushGrpc() {}

  public static final String SERVICE_NAME = "dialog.Push";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterGooglePush,
      dialog.Miscellaneous.ResponseVoid> getRegisterGooglePushMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterGooglePush,
      dialog.Miscellaneous.ResponseVoid> getRegisterGooglePushMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterGooglePush, dialog.Miscellaneous.ResponseVoid> getRegisterGooglePushMethod;
    if ((getRegisterGooglePushMethod = PushGrpc.getRegisterGooglePushMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getRegisterGooglePushMethod = PushGrpc.getRegisterGooglePushMethod) == null) {
          PushGrpc.getRegisterGooglePushMethod = getRegisterGooglePushMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestRegisterGooglePush, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "RegisterGooglePush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestRegisterGooglePush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("RegisterGooglePush"))
                  .build();
          }
        }
     }
     return getRegisterGooglePushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterGooglePush,
      dialog.Miscellaneous.ResponseVoid> getUnregisterGooglePushMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterGooglePush,
      dialog.Miscellaneous.ResponseVoid> getUnregisterGooglePushMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterGooglePush, dialog.Miscellaneous.ResponseVoid> getUnregisterGooglePushMethod;
    if ((getUnregisterGooglePushMethod = PushGrpc.getUnregisterGooglePushMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getUnregisterGooglePushMethod = PushGrpc.getUnregisterGooglePushMethod) == null) {
          PushGrpc.getUnregisterGooglePushMethod = getUnregisterGooglePushMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestUnregisterGooglePush, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "UnregisterGooglePush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestUnregisterGooglePush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("UnregisterGooglePush"))
                  .build();
          }
        }
     }
     return getUnregisterGooglePushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePush,
      dialog.Miscellaneous.ResponseVoid> getRegisterApplePushMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePush,
      dialog.Miscellaneous.ResponseVoid> getRegisterApplePushMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePush, dialog.Miscellaneous.ResponseVoid> getRegisterApplePushMethod;
    if ((getRegisterApplePushMethod = PushGrpc.getRegisterApplePushMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getRegisterApplePushMethod = PushGrpc.getRegisterApplePushMethod) == null) {
          PushGrpc.getRegisterApplePushMethod = getRegisterApplePushMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestRegisterApplePush, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "RegisterApplePush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestRegisterApplePush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("RegisterApplePush"))
                  .build();
          }
        }
     }
     return getRegisterApplePushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePush,
      dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePush,
      dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePush, dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushMethod;
    if ((getUnregisterApplePushMethod = PushGrpc.getUnregisterApplePushMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getUnregisterApplePushMethod = PushGrpc.getUnregisterApplePushMethod) == null) {
          PushGrpc.getUnregisterApplePushMethod = getUnregisterApplePushMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestUnregisterApplePush, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "UnregisterApplePush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestUnregisterApplePush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("UnregisterApplePush"))
                  .build();
          }
        }
     }
     return getUnregisterApplePushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePushKit,
      dialog.Miscellaneous.ResponseVoid> getRegisterApplePushKitMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePushKit,
      dialog.Miscellaneous.ResponseVoid> getRegisterApplePushKitMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePushKit, dialog.Miscellaneous.ResponseVoid> getRegisterApplePushKitMethod;
    if ((getRegisterApplePushKitMethod = PushGrpc.getRegisterApplePushKitMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getRegisterApplePushKitMethod = PushGrpc.getRegisterApplePushKitMethod) == null) {
          PushGrpc.getRegisterApplePushKitMethod = getRegisterApplePushKitMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestRegisterApplePushKit, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "RegisterApplePushKit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestRegisterApplePushKit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("RegisterApplePushKit"))
                  .build();
          }
        }
     }
     return getRegisterApplePushKitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePushKit,
      dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushKitMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePushKit,
      dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushKitMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePushKit, dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushKitMethod;
    if ((getUnregisterApplePushKitMethod = PushGrpc.getUnregisterApplePushKitMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getUnregisterApplePushKitMethod = PushGrpc.getUnregisterApplePushKitMethod) == null) {
          PushGrpc.getUnregisterApplePushKitMethod = getUnregisterApplePushKitMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestUnregisterApplePushKit, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "UnregisterApplePushKit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestUnregisterApplePushKit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("UnregisterApplePushKit"))
                  .build();
          }
        }
     }
     return getUnregisterApplePushKitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePushToken,
      dialog.Miscellaneous.ResponseVoid> getRegisterApplePushTokenMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePushToken,
      dialog.Miscellaneous.ResponseVoid> getRegisterApplePushTokenMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestRegisterApplePushToken, dialog.Miscellaneous.ResponseVoid> getRegisterApplePushTokenMethod;
    if ((getRegisterApplePushTokenMethod = PushGrpc.getRegisterApplePushTokenMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getRegisterApplePushTokenMethod = PushGrpc.getRegisterApplePushTokenMethod) == null) {
          PushGrpc.getRegisterApplePushTokenMethod = getRegisterApplePushTokenMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestRegisterApplePushToken, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "RegisterApplePushToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestRegisterApplePushToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("RegisterApplePushToken"))
                  .build();
          }
        }
     }
     return getRegisterApplePushTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePushToken,
      dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushTokenMethod;

  public static io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePushToken,
      dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushTokenMethod() {
    io.grpc.MethodDescriptor<dialog.PushOuterClass.RequestUnregisterApplePushToken, dialog.Miscellaneous.ResponseVoid> getUnregisterApplePushTokenMethod;
    if ((getUnregisterApplePushTokenMethod = PushGrpc.getUnregisterApplePushTokenMethod) == null) {
      synchronized (PushGrpc.class) {
        if ((getUnregisterApplePushTokenMethod = PushGrpc.getUnregisterApplePushTokenMethod) == null) {
          PushGrpc.getUnregisterApplePushTokenMethod = getUnregisterApplePushTokenMethod = 
              io.grpc.MethodDescriptor.<dialog.PushOuterClass.RequestUnregisterApplePushToken, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Push", "UnregisterApplePushToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PushOuterClass.RequestUnregisterApplePushToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new PushMethodDescriptorSupplier("UnregisterApplePushToken"))
                  .build();
          }
        }
     }
     return getUnregisterApplePushTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PushStub newStub(io.grpc.Channel channel) {
    return new PushStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PushBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PushBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PushFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PushFutureStub(channel);
  }

  /**
   */
  public static abstract class PushImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerGooglePush(dialog.PushOuterClass.RequestRegisterGooglePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterGooglePushMethod(), responseObserver);
    }

    /**
     */
    public void unregisterGooglePush(dialog.PushOuterClass.RequestUnregisterGooglePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getUnregisterGooglePushMethod(), responseObserver);
    }

    /**
     */
    public void registerApplePush(dialog.PushOuterClass.RequestRegisterApplePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterApplePushMethod(), responseObserver);
    }

    /**
     */
    public void unregisterApplePush(dialog.PushOuterClass.RequestUnregisterApplePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getUnregisterApplePushMethod(), responseObserver);
    }

    /**
     */
    public void registerApplePushKit(dialog.PushOuterClass.RequestRegisterApplePushKit request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterApplePushKitMethod(), responseObserver);
    }

    /**
     */
    public void unregisterApplePushKit(dialog.PushOuterClass.RequestUnregisterApplePushKit request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getUnregisterApplePushKitMethod(), responseObserver);
    }

    /**
     */
    public void registerApplePushToken(dialog.PushOuterClass.RequestRegisterApplePushToken request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterApplePushTokenMethod(), responseObserver);
    }

    /**
     */
    public void unregisterApplePushToken(dialog.PushOuterClass.RequestUnregisterApplePushToken request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getUnregisterApplePushTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterGooglePushMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestRegisterGooglePush,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_REGISTER_GOOGLE_PUSH)))
          .addMethod(
            getUnregisterGooglePushMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestUnregisterGooglePush,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_UNREGISTER_GOOGLE_PUSH)))
          .addMethod(
            getRegisterApplePushMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestRegisterApplePush,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_REGISTER_APPLE_PUSH)))
          .addMethod(
            getUnregisterApplePushMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestUnregisterApplePush,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_UNREGISTER_APPLE_PUSH)))
          .addMethod(
            getRegisterApplePushKitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestRegisterApplePushKit,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_REGISTER_APPLE_PUSH_KIT)))
          .addMethod(
            getUnregisterApplePushKitMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestUnregisterApplePushKit,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_UNREGISTER_APPLE_PUSH_KIT)))
          .addMethod(
            getRegisterApplePushTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestRegisterApplePushToken,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_REGISTER_APPLE_PUSH_TOKEN)))
          .addMethod(
            getUnregisterApplePushTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PushOuterClass.RequestUnregisterApplePushToken,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_UNREGISTER_APPLE_PUSH_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class PushStub extends io.grpc.stub.AbstractStub<PushStub> {
    private PushStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PushStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PushStub(channel, callOptions);
    }

    /**
     */
    public void registerGooglePush(dialog.PushOuterClass.RequestRegisterGooglePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterGooglePushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterGooglePush(dialog.PushOuterClass.RequestUnregisterGooglePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnregisterGooglePushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerApplePush(dialog.PushOuterClass.RequestRegisterApplePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterApplePushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterApplePush(dialog.PushOuterClass.RequestUnregisterApplePush request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnregisterApplePushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerApplePushKit(dialog.PushOuterClass.RequestRegisterApplePushKit request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterApplePushKitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterApplePushKit(dialog.PushOuterClass.RequestUnregisterApplePushKit request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnregisterApplePushKitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void registerApplePushToken(dialog.PushOuterClass.RequestRegisterApplePushToken request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterApplePushTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unregisterApplePushToken(dialog.PushOuterClass.RequestUnregisterApplePushToken request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnregisterApplePushTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PushBlockingStub extends io.grpc.stub.AbstractStub<PushBlockingStub> {
    private PushBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PushBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PushBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid registerGooglePush(dialog.PushOuterClass.RequestRegisterGooglePush request) {
      return blockingUnaryCall(
          getChannel(), getRegisterGooglePushMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid unregisterGooglePush(dialog.PushOuterClass.RequestUnregisterGooglePush request) {
      return blockingUnaryCall(
          getChannel(), getUnregisterGooglePushMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid registerApplePush(dialog.PushOuterClass.RequestRegisterApplePush request) {
      return blockingUnaryCall(
          getChannel(), getRegisterApplePushMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid unregisterApplePush(dialog.PushOuterClass.RequestUnregisterApplePush request) {
      return blockingUnaryCall(
          getChannel(), getUnregisterApplePushMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid registerApplePushKit(dialog.PushOuterClass.RequestRegisterApplePushKit request) {
      return blockingUnaryCall(
          getChannel(), getRegisterApplePushKitMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid unregisterApplePushKit(dialog.PushOuterClass.RequestUnregisterApplePushKit request) {
      return blockingUnaryCall(
          getChannel(), getUnregisterApplePushKitMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid registerApplePushToken(dialog.PushOuterClass.RequestRegisterApplePushToken request) {
      return blockingUnaryCall(
          getChannel(), getRegisterApplePushTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid unregisterApplePushToken(dialog.PushOuterClass.RequestUnregisterApplePushToken request) {
      return blockingUnaryCall(
          getChannel(), getUnregisterApplePushTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PushFutureStub extends io.grpc.stub.AbstractStub<PushFutureStub> {
    private PushFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PushFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PushFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PushFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> registerGooglePush(
        dialog.PushOuterClass.RequestRegisterGooglePush request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterGooglePushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> unregisterGooglePush(
        dialog.PushOuterClass.RequestUnregisterGooglePush request) {
      return futureUnaryCall(
          getChannel().newCall(getUnregisterGooglePushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> registerApplePush(
        dialog.PushOuterClass.RequestRegisterApplePush request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterApplePushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> unregisterApplePush(
        dialog.PushOuterClass.RequestUnregisterApplePush request) {
      return futureUnaryCall(
          getChannel().newCall(getUnregisterApplePushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> registerApplePushKit(
        dialog.PushOuterClass.RequestRegisterApplePushKit request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterApplePushKitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> unregisterApplePushKit(
        dialog.PushOuterClass.RequestUnregisterApplePushKit request) {
      return futureUnaryCall(
          getChannel().newCall(getUnregisterApplePushKitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> registerApplePushToken(
        dialog.PushOuterClass.RequestRegisterApplePushToken request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterApplePushTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> unregisterApplePushToken(
        dialog.PushOuterClass.RequestUnregisterApplePushToken request) {
      return futureUnaryCall(
          getChannel().newCall(getUnregisterApplePushTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_GOOGLE_PUSH = 0;
  private static final int METHODID_UNREGISTER_GOOGLE_PUSH = 1;
  private static final int METHODID_REGISTER_APPLE_PUSH = 2;
  private static final int METHODID_UNREGISTER_APPLE_PUSH = 3;
  private static final int METHODID_REGISTER_APPLE_PUSH_KIT = 4;
  private static final int METHODID_UNREGISTER_APPLE_PUSH_KIT = 5;
  private static final int METHODID_REGISTER_APPLE_PUSH_TOKEN = 6;
  private static final int METHODID_UNREGISTER_APPLE_PUSH_TOKEN = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PushImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PushImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_GOOGLE_PUSH:
          serviceImpl.registerGooglePush((dialog.PushOuterClass.RequestRegisterGooglePush) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_UNREGISTER_GOOGLE_PUSH:
          serviceImpl.unregisterGooglePush((dialog.PushOuterClass.RequestUnregisterGooglePush) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_REGISTER_APPLE_PUSH:
          serviceImpl.registerApplePush((dialog.PushOuterClass.RequestRegisterApplePush) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_UNREGISTER_APPLE_PUSH:
          serviceImpl.unregisterApplePush((dialog.PushOuterClass.RequestUnregisterApplePush) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_REGISTER_APPLE_PUSH_KIT:
          serviceImpl.registerApplePushKit((dialog.PushOuterClass.RequestRegisterApplePushKit) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_UNREGISTER_APPLE_PUSH_KIT:
          serviceImpl.unregisterApplePushKit((dialog.PushOuterClass.RequestUnregisterApplePushKit) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_REGISTER_APPLE_PUSH_TOKEN:
          serviceImpl.registerApplePushToken((dialog.PushOuterClass.RequestRegisterApplePushToken) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_UNREGISTER_APPLE_PUSH_TOKEN:
          serviceImpl.unregisterApplePushToken((dialog.PushOuterClass.RequestUnregisterApplePushToken) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
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

  private static abstract class PushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PushBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.PushOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Push");
    }
  }

  private static final class PushFileDescriptorSupplier
      extends PushBaseDescriptorSupplier {
    PushFileDescriptorSupplier() {}
  }

  private static final class PushMethodDescriptorSupplier
      extends PushBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PushMethodDescriptorSupplier(String methodName) {
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
      synchronized (PushGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PushFileDescriptorSupplier())
              .addMethod(getRegisterGooglePushMethod())
              .addMethod(getUnregisterGooglePushMethod())
              .addMethod(getRegisterApplePushMethod())
              .addMethod(getUnregisterApplePushMethod())
              .addMethod(getRegisterApplePushKitMethod())
              .addMethod(getUnregisterApplePushKitMethod())
              .addMethod(getRegisterApplePushTokenMethod())
              .addMethod(getUnregisterApplePushTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
