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
    comments = "Source: web_rtc.proto")
public final class WebRTCGrpc {

  private WebRTCGrpc() {}

  public static final String SERVICE_NAME = "dialog.WebRTC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.WebRtc.RequestGetCallInfo,
      dialog.WebRtc.ResponseGetCallInfo> getGetCallInfoMethod;

  public static io.grpc.MethodDescriptor<dialog.WebRtc.RequestGetCallInfo,
      dialog.WebRtc.ResponseGetCallInfo> getGetCallInfoMethod() {
    io.grpc.MethodDescriptor<dialog.WebRtc.RequestGetCallInfo, dialog.WebRtc.ResponseGetCallInfo> getGetCallInfoMethod;
    if ((getGetCallInfoMethod = WebRTCGrpc.getGetCallInfoMethod) == null) {
      synchronized (WebRTCGrpc.class) {
        if ((getGetCallInfoMethod = WebRTCGrpc.getGetCallInfoMethod) == null) {
          WebRTCGrpc.getGetCallInfoMethod = getGetCallInfoMethod = 
              io.grpc.MethodDescriptor.<dialog.WebRtc.RequestGetCallInfo, dialog.WebRtc.ResponseGetCallInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.WebRTC", "GetCallInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.RequestGetCallInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.ResponseGetCallInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new WebRTCMethodDescriptorSupplier("GetCallInfo"))
                  .build();
          }
        }
     }
     return getGetCallInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.WebRtc.RequestLoadCalls,
      dialog.WebRtc.ResponseLoadCalls> getLoadCallsMethod;

  public static io.grpc.MethodDescriptor<dialog.WebRtc.RequestLoadCalls,
      dialog.WebRtc.ResponseLoadCalls> getLoadCallsMethod() {
    io.grpc.MethodDescriptor<dialog.WebRtc.RequestLoadCalls, dialog.WebRtc.ResponseLoadCalls> getLoadCallsMethod;
    if ((getLoadCallsMethod = WebRTCGrpc.getLoadCallsMethod) == null) {
      synchronized (WebRTCGrpc.class) {
        if ((getLoadCallsMethod = WebRTCGrpc.getLoadCallsMethod) == null) {
          WebRTCGrpc.getLoadCallsMethod = getLoadCallsMethod = 
              io.grpc.MethodDescriptor.<dialog.WebRtc.RequestLoadCalls, dialog.WebRtc.ResponseLoadCalls>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.WebRTC", "LoadCalls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.RequestLoadCalls.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.ResponseLoadCalls.getDefaultInstance()))
                  .setSchemaDescriptor(new WebRTCMethodDescriptorSupplier("LoadCalls"))
                  .build();
          }
        }
     }
     return getLoadCallsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.WebRtc.RequestDoCall,
      dialog.WebRtc.ResponseDoCall> getDoCallMethod;

  public static io.grpc.MethodDescriptor<dialog.WebRtc.RequestDoCall,
      dialog.WebRtc.ResponseDoCall> getDoCallMethod() {
    io.grpc.MethodDescriptor<dialog.WebRtc.RequestDoCall, dialog.WebRtc.ResponseDoCall> getDoCallMethod;
    if ((getDoCallMethod = WebRTCGrpc.getDoCallMethod) == null) {
      synchronized (WebRTCGrpc.class) {
        if ((getDoCallMethod = WebRTCGrpc.getDoCallMethod) == null) {
          WebRTCGrpc.getDoCallMethod = getDoCallMethod = 
              io.grpc.MethodDescriptor.<dialog.WebRtc.RequestDoCall, dialog.WebRtc.ResponseDoCall>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.WebRTC", "DoCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.RequestDoCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.ResponseDoCall.getDefaultInstance()))
                  .setSchemaDescriptor(new WebRTCMethodDescriptorSupplier("DoCall"))
                  .build();
          }
        }
     }
     return getDoCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.WebRtc.RequestJoinCall,
      dialog.Miscellaneous.ResponseVoid> getJoinCallMethod;

  public static io.grpc.MethodDescriptor<dialog.WebRtc.RequestJoinCall,
      dialog.Miscellaneous.ResponseVoid> getJoinCallMethod() {
    io.grpc.MethodDescriptor<dialog.WebRtc.RequestJoinCall, dialog.Miscellaneous.ResponseVoid> getJoinCallMethod;
    if ((getJoinCallMethod = WebRTCGrpc.getJoinCallMethod) == null) {
      synchronized (WebRTCGrpc.class) {
        if ((getJoinCallMethod = WebRTCGrpc.getJoinCallMethod) == null) {
          WebRTCGrpc.getJoinCallMethod = getJoinCallMethod = 
              io.grpc.MethodDescriptor.<dialog.WebRtc.RequestJoinCall, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.WebRTC", "JoinCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.RequestJoinCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new WebRTCMethodDescriptorSupplier("JoinCall"))
                  .build();
          }
        }
     }
     return getJoinCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.WebRtc.RequestRejectCall,
      dialog.Miscellaneous.ResponseVoid> getRejectCallMethod;

  public static io.grpc.MethodDescriptor<dialog.WebRtc.RequestRejectCall,
      dialog.Miscellaneous.ResponseVoid> getRejectCallMethod() {
    io.grpc.MethodDescriptor<dialog.WebRtc.RequestRejectCall, dialog.Miscellaneous.ResponseVoid> getRejectCallMethod;
    if ((getRejectCallMethod = WebRTCGrpc.getRejectCallMethod) == null) {
      synchronized (WebRTCGrpc.class) {
        if ((getRejectCallMethod = WebRTCGrpc.getRejectCallMethod) == null) {
          WebRTCGrpc.getRejectCallMethod = getRejectCallMethod = 
              io.grpc.MethodDescriptor.<dialog.WebRtc.RequestRejectCall, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.WebRTC", "RejectCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.RequestRejectCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new WebRTCMethodDescriptorSupplier("RejectCall"))
                  .build();
          }
        }
     }
     return getRejectCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.WebRtc.RequestChangeCallDisplayName,
      dialog.Miscellaneous.ResponseVoid> getChangeCallDisplayNameMethod;

  public static io.grpc.MethodDescriptor<dialog.WebRtc.RequestChangeCallDisplayName,
      dialog.Miscellaneous.ResponseVoid> getChangeCallDisplayNameMethod() {
    io.grpc.MethodDescriptor<dialog.WebRtc.RequestChangeCallDisplayName, dialog.Miscellaneous.ResponseVoid> getChangeCallDisplayNameMethod;
    if ((getChangeCallDisplayNameMethod = WebRTCGrpc.getChangeCallDisplayNameMethod) == null) {
      synchronized (WebRTCGrpc.class) {
        if ((getChangeCallDisplayNameMethod = WebRTCGrpc.getChangeCallDisplayNameMethod) == null) {
          WebRTCGrpc.getChangeCallDisplayNameMethod = getChangeCallDisplayNameMethod = 
              io.grpc.MethodDescriptor.<dialog.WebRtc.RequestChangeCallDisplayName, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.WebRTC", "ChangeCallDisplayName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.RequestChangeCallDisplayName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new WebRTCMethodDescriptorSupplier("ChangeCallDisplayName"))
                  .build();
          }
        }
     }
     return getChangeCallDisplayNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.WebRtc.RequestDeleteCall,
      dialog.Miscellaneous.ResponseVoid> getDeleteCallMethod;

  public static io.grpc.MethodDescriptor<dialog.WebRtc.RequestDeleteCall,
      dialog.Miscellaneous.ResponseVoid> getDeleteCallMethod() {
    io.grpc.MethodDescriptor<dialog.WebRtc.RequestDeleteCall, dialog.Miscellaneous.ResponseVoid> getDeleteCallMethod;
    if ((getDeleteCallMethod = WebRTCGrpc.getDeleteCallMethod) == null) {
      synchronized (WebRTCGrpc.class) {
        if ((getDeleteCallMethod = WebRTCGrpc.getDeleteCallMethod) == null) {
          WebRTCGrpc.getDeleteCallMethod = getDeleteCallMethod = 
              io.grpc.MethodDescriptor.<dialog.WebRtc.RequestDeleteCall, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.WebRTC", "DeleteCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.WebRtc.RequestDeleteCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new WebRTCMethodDescriptorSupplier("DeleteCall"))
                  .build();
          }
        }
     }
     return getDeleteCallMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebRTCStub newStub(io.grpc.Channel channel) {
    return new WebRTCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebRTCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WebRTCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebRTCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WebRTCFutureStub(channel);
  }

  /**
   */
  public static abstract class WebRTCImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCallInfo(dialog.WebRtc.RequestGetCallInfo request,
        io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseGetCallInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCallInfoMethod(), responseObserver);
    }

    /**
     */
    public void loadCalls(dialog.WebRtc.RequestLoadCalls request,
        io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseLoadCalls> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadCallsMethod(), responseObserver);
    }

    /**
     */
    public void doCall(dialog.WebRtc.RequestDoCall request,
        io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseDoCall> responseObserver) {
      asyncUnimplementedUnaryCall(getDoCallMethod(), responseObserver);
    }

    /**
     */
    public void joinCall(dialog.WebRtc.RequestJoinCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinCallMethod(), responseObserver);
    }

    /**
     */
    public void rejectCall(dialog.WebRtc.RequestRejectCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getRejectCallMethod(), responseObserver);
    }

    /**
     */
    public void changeCallDisplayName(dialog.WebRtc.RequestChangeCallDisplayName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeCallDisplayNameMethod(), responseObserver);
    }

    /**
     */
    public void deleteCall(dialog.WebRtc.RequestDeleteCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCallMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCallInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.WebRtc.RequestGetCallInfo,
                dialog.WebRtc.ResponseGetCallInfo>(
                  this, METHODID_GET_CALL_INFO)))
          .addMethod(
            getLoadCallsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.WebRtc.RequestLoadCalls,
                dialog.WebRtc.ResponseLoadCalls>(
                  this, METHODID_LOAD_CALLS)))
          .addMethod(
            getDoCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.WebRtc.RequestDoCall,
                dialog.WebRtc.ResponseDoCall>(
                  this, METHODID_DO_CALL)))
          .addMethod(
            getJoinCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.WebRtc.RequestJoinCall,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_JOIN_CALL)))
          .addMethod(
            getRejectCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.WebRtc.RequestRejectCall,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_REJECT_CALL)))
          .addMethod(
            getChangeCallDisplayNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.WebRtc.RequestChangeCallDisplayName,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_CHANGE_CALL_DISPLAY_NAME)))
          .addMethod(
            getDeleteCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.WebRtc.RequestDeleteCall,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_DELETE_CALL)))
          .build();
    }
  }

  /**
   */
  public static final class WebRTCStub extends io.grpc.stub.AbstractStub<WebRTCStub> {
    private WebRTCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebRTCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebRTCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebRTCStub(channel, callOptions);
    }

    /**
     */
    public void getCallInfo(dialog.WebRtc.RequestGetCallInfo request,
        io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseGetCallInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCallInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadCalls(dialog.WebRtc.RequestLoadCalls request,
        io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseLoadCalls> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadCallsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doCall(dialog.WebRtc.RequestDoCall request,
        io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseDoCall> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinCall(dialog.WebRtc.RequestJoinCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rejectCall(dialog.WebRtc.RequestRejectCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRejectCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeCallDisplayName(dialog.WebRtc.RequestChangeCallDisplayName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeCallDisplayNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCall(dialog.WebRtc.RequestDeleteCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCallMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WebRTCBlockingStub extends io.grpc.stub.AbstractStub<WebRTCBlockingStub> {
    private WebRTCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebRTCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebRTCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebRTCBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.WebRtc.ResponseGetCallInfo getCallInfo(dialog.WebRtc.RequestGetCallInfo request) {
      return blockingUnaryCall(
          getChannel(), getGetCallInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.WebRtc.ResponseLoadCalls loadCalls(dialog.WebRtc.RequestLoadCalls request) {
      return blockingUnaryCall(
          getChannel(), getLoadCallsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.WebRtc.ResponseDoCall doCall(dialog.WebRtc.RequestDoCall request) {
      return blockingUnaryCall(
          getChannel(), getDoCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid joinCall(dialog.WebRtc.RequestJoinCall request) {
      return blockingUnaryCall(
          getChannel(), getJoinCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid rejectCall(dialog.WebRtc.RequestRejectCall request) {
      return blockingUnaryCall(
          getChannel(), getRejectCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid changeCallDisplayName(dialog.WebRtc.RequestChangeCallDisplayName request) {
      return blockingUnaryCall(
          getChannel(), getChangeCallDisplayNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid deleteCall(dialog.WebRtc.RequestDeleteCall request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCallMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WebRTCFutureStub extends io.grpc.stub.AbstractStub<WebRTCFutureStub> {
    private WebRTCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WebRTCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebRTCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WebRTCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.WebRtc.ResponseGetCallInfo> getCallInfo(
        dialog.WebRtc.RequestGetCallInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCallInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.WebRtc.ResponseLoadCalls> loadCalls(
        dialog.WebRtc.RequestLoadCalls request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadCallsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.WebRtc.ResponseDoCall> doCall(
        dialog.WebRtc.RequestDoCall request) {
      return futureUnaryCall(
          getChannel().newCall(getDoCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> joinCall(
        dialog.WebRtc.RequestJoinCall request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> rejectCall(
        dialog.WebRtc.RequestRejectCall request) {
      return futureUnaryCall(
          getChannel().newCall(getRejectCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> changeCallDisplayName(
        dialog.WebRtc.RequestChangeCallDisplayName request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeCallDisplayNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> deleteCall(
        dialog.WebRtc.RequestDeleteCall request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CALL_INFO = 0;
  private static final int METHODID_LOAD_CALLS = 1;
  private static final int METHODID_DO_CALL = 2;
  private static final int METHODID_JOIN_CALL = 3;
  private static final int METHODID_REJECT_CALL = 4;
  private static final int METHODID_CHANGE_CALL_DISPLAY_NAME = 5;
  private static final int METHODID_DELETE_CALL = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WebRTCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WebRTCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CALL_INFO:
          serviceImpl.getCallInfo((dialog.WebRtc.RequestGetCallInfo) request,
              (io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseGetCallInfo>) responseObserver);
          break;
        case METHODID_LOAD_CALLS:
          serviceImpl.loadCalls((dialog.WebRtc.RequestLoadCalls) request,
              (io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseLoadCalls>) responseObserver);
          break;
        case METHODID_DO_CALL:
          serviceImpl.doCall((dialog.WebRtc.RequestDoCall) request,
              (io.grpc.stub.StreamObserver<dialog.WebRtc.ResponseDoCall>) responseObserver);
          break;
        case METHODID_JOIN_CALL:
          serviceImpl.joinCall((dialog.WebRtc.RequestJoinCall) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_REJECT_CALL:
          serviceImpl.rejectCall((dialog.WebRtc.RequestRejectCall) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_CHANGE_CALL_DISPLAY_NAME:
          serviceImpl.changeCallDisplayName((dialog.WebRtc.RequestChangeCallDisplayName) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_DELETE_CALL:
          serviceImpl.deleteCall((dialog.WebRtc.RequestDeleteCall) request,
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

  private static abstract class WebRTCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebRTCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.WebRtc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebRTC");
    }
  }

  private static final class WebRTCFileDescriptorSupplier
      extends WebRTCBaseDescriptorSupplier {
    WebRTCFileDescriptorSupplier() {}
  }

  private static final class WebRTCMethodDescriptorSupplier
      extends WebRTCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WebRTCMethodDescriptorSupplier(String methodName) {
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
      synchronized (WebRTCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebRTCFileDescriptorSupplier())
              .addMethod(getGetCallInfoMethod())
              .addMethod(getLoadCallsMethod())
              .addMethod(getDoCallMethod())
              .addMethod(getJoinCallMethod())
              .addMethod(getRejectCallMethod())
              .addMethod(getChangeCallDisplayNameMethod())
              .addMethod(getDeleteCallMethod())
              .build();
        }
      }
    }
    return result;
  }
}
