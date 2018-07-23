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
    comments = "Source: search.proto")
public final class SearchGrpc {

  private SearchGrpc() {}

  public static final String SERVICE_NAME = "dialog.Search";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestPeerSearch,
      dialog.SearchOuterClass.ResponsePeerSearch> getPeerSearchMethod;

  public static io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestPeerSearch,
      dialog.SearchOuterClass.ResponsePeerSearch> getPeerSearchMethod() {
    io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestPeerSearch, dialog.SearchOuterClass.ResponsePeerSearch> getPeerSearchMethod;
    if ((getPeerSearchMethod = SearchGrpc.getPeerSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getPeerSearchMethod = SearchGrpc.getPeerSearchMethod) == null) {
          SearchGrpc.getPeerSearchMethod = getPeerSearchMethod = 
              io.grpc.MethodDescriptor.<dialog.SearchOuterClass.RequestPeerSearch, dialog.SearchOuterClass.ResponsePeerSearch>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Search", "PeerSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.RequestPeerSearch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.ResponsePeerSearch.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchMethodDescriptorSupplier("PeerSearch"))
                  .build();
          }
        }
     }
     return getPeerSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestResolvePeer,
      dialog.SearchOuterClass.ResponseResolvePeer> getResolvePeerMethod;

  public static io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestResolvePeer,
      dialog.SearchOuterClass.ResponseResolvePeer> getResolvePeerMethod() {
    io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestResolvePeer, dialog.SearchOuterClass.ResponseResolvePeer> getResolvePeerMethod;
    if ((getResolvePeerMethod = SearchGrpc.getResolvePeerMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getResolvePeerMethod = SearchGrpc.getResolvePeerMethod) == null) {
          SearchGrpc.getResolvePeerMethod = getResolvePeerMethod = 
              io.grpc.MethodDescriptor.<dialog.SearchOuterClass.RequestResolvePeer, dialog.SearchOuterClass.ResponseResolvePeer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Search", "ResolvePeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.RequestResolvePeer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.ResponseResolvePeer.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchMethodDescriptorSupplier("ResolvePeer"))
                  .build();
          }
        }
     }
     return getResolvePeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestMessageSearch,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getMessageSearchMethod;

  public static io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestMessageSearch,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getMessageSearchMethod() {
    io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestMessageSearch, dialog.SearchOuterClass.ResponseMessageSearchResponse> getMessageSearchMethod;
    if ((getMessageSearchMethod = SearchGrpc.getMessageSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getMessageSearchMethod = SearchGrpc.getMessageSearchMethod) == null) {
          SearchGrpc.getMessageSearchMethod = getMessageSearchMethod = 
              io.grpc.MethodDescriptor.<dialog.SearchOuterClass.RequestMessageSearch, dialog.SearchOuterClass.ResponseMessageSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Search", "MessageSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.RequestMessageSearch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.ResponseMessageSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchMethodDescriptorSupplier("MessageSearch"))
                  .build();
          }
        }
     }
     return getMessageSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestMessageSearchMore,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getMessageSearchMoreMethod;

  public static io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestMessageSearchMore,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getMessageSearchMoreMethod() {
    io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestMessageSearchMore, dialog.SearchOuterClass.ResponseMessageSearchResponse> getMessageSearchMoreMethod;
    if ((getMessageSearchMoreMethod = SearchGrpc.getMessageSearchMoreMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getMessageSearchMoreMethod = SearchGrpc.getMessageSearchMoreMethod) == null) {
          SearchGrpc.getMessageSearchMoreMethod = getMessageSearchMoreMethod = 
              io.grpc.MethodDescriptor.<dialog.SearchOuterClass.RequestMessageSearchMore, dialog.SearchOuterClass.ResponseMessageSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Search", "MessageSearchMore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.RequestMessageSearchMore.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.ResponseMessageSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchMethodDescriptorSupplier("MessageSearchMore"))
                  .build();
          }
        }
     }
     return getMessageSearchMoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestSimpleSearch,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getSimpleSearchMethod;

  public static io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestSimpleSearch,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getSimpleSearchMethod() {
    io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestSimpleSearch, dialog.SearchOuterClass.ResponseMessageSearchResponse> getSimpleSearchMethod;
    if ((getSimpleSearchMethod = SearchGrpc.getSimpleSearchMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSimpleSearchMethod = SearchGrpc.getSimpleSearchMethod) == null) {
          SearchGrpc.getSimpleSearchMethod = getSimpleSearchMethod = 
              io.grpc.MethodDescriptor.<dialog.SearchOuterClass.RequestSimpleSearch, dialog.SearchOuterClass.ResponseMessageSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Search", "SimpleSearch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.RequestSimpleSearch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.ResponseMessageSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SimpleSearch"))
                  .build();
          }
        }
     }
     return getSimpleSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestSimpleSearchMore,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getSimpleSearchMoreMethod;

  public static io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestSimpleSearchMore,
      dialog.SearchOuterClass.ResponseMessageSearchResponse> getSimpleSearchMoreMethod() {
    io.grpc.MethodDescriptor<dialog.SearchOuterClass.RequestSimpleSearchMore, dialog.SearchOuterClass.ResponseMessageSearchResponse> getSimpleSearchMoreMethod;
    if ((getSimpleSearchMoreMethod = SearchGrpc.getSimpleSearchMoreMethod) == null) {
      synchronized (SearchGrpc.class) {
        if ((getSimpleSearchMoreMethod = SearchGrpc.getSimpleSearchMoreMethod) == null) {
          SearchGrpc.getSimpleSearchMoreMethod = getSimpleSearchMoreMethod = 
              io.grpc.MethodDescriptor.<dialog.SearchOuterClass.RequestSimpleSearchMore, dialog.SearchOuterClass.ResponseMessageSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Search", "SimpleSearchMore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.RequestSimpleSearchMore.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SearchOuterClass.ResponseMessageSearchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchMethodDescriptorSupplier("SimpleSearchMore"))
                  .build();
          }
        }
     }
     return getSimpleSearchMoreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchStub newStub(io.grpc.Channel channel) {
    return new SearchStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchFutureStub(channel);
  }

  /**
   */
  public static abstract class SearchImplBase implements io.grpc.BindableService {

    /**
     */
    public void peerSearch(dialog.SearchOuterClass.RequestPeerSearch request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponsePeerSearch> responseObserver) {
      asyncUnimplementedUnaryCall(getPeerSearchMethod(), responseObserver);
    }

    /**
     */
    public void resolvePeer(dialog.SearchOuterClass.RequestResolvePeer request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseResolvePeer> responseObserver) {
      asyncUnimplementedUnaryCall(getResolvePeerMethod(), responseObserver);
    }

    /**
     */
    public void messageSearch(dialog.SearchOuterClass.RequestMessageSearch request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageSearchMethod(), responseObserver);
    }

    /**
     */
    public void messageSearchMore(dialog.SearchOuterClass.RequestMessageSearchMore request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageSearchMoreMethod(), responseObserver);
    }

    /**
     */
    public void simpleSearch(dialog.SearchOuterClass.RequestSimpleSearch request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSimpleSearchMethod(), responseObserver);
    }

    /**
     */
    public void simpleSearchMore(dialog.SearchOuterClass.RequestSimpleSearchMore request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSimpleSearchMoreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPeerSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SearchOuterClass.RequestPeerSearch,
                dialog.SearchOuterClass.ResponsePeerSearch>(
                  this, METHODID_PEER_SEARCH)))
          .addMethod(
            getResolvePeerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SearchOuterClass.RequestResolvePeer,
                dialog.SearchOuterClass.ResponseResolvePeer>(
                  this, METHODID_RESOLVE_PEER)))
          .addMethod(
            getMessageSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SearchOuterClass.RequestMessageSearch,
                dialog.SearchOuterClass.ResponseMessageSearchResponse>(
                  this, METHODID_MESSAGE_SEARCH)))
          .addMethod(
            getMessageSearchMoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SearchOuterClass.RequestMessageSearchMore,
                dialog.SearchOuterClass.ResponseMessageSearchResponse>(
                  this, METHODID_MESSAGE_SEARCH_MORE)))
          .addMethod(
            getSimpleSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SearchOuterClass.RequestSimpleSearch,
                dialog.SearchOuterClass.ResponseMessageSearchResponse>(
                  this, METHODID_SIMPLE_SEARCH)))
          .addMethod(
            getSimpleSearchMoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SearchOuterClass.RequestSimpleSearchMore,
                dialog.SearchOuterClass.ResponseMessageSearchResponse>(
                  this, METHODID_SIMPLE_SEARCH_MORE)))
          .build();
    }
  }

  /**
   */
  public static final class SearchStub extends io.grpc.stub.AbstractStub<SearchStub> {
    private SearchStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchStub(channel, callOptions);
    }

    /**
     */
    public void peerSearch(dialog.SearchOuterClass.RequestPeerSearch request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponsePeerSearch> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPeerSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resolvePeer(dialog.SearchOuterClass.RequestResolvePeer request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseResolvePeer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResolvePeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageSearch(dialog.SearchOuterClass.RequestMessageSearch request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageSearchMore(dialog.SearchOuterClass.RequestMessageSearchMore request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageSearchMoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void simpleSearch(dialog.SearchOuterClass.RequestSimpleSearch request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimpleSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void simpleSearchMore(dialog.SearchOuterClass.RequestSimpleSearchMore request,
        io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimpleSearchMoreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchBlockingStub extends io.grpc.stub.AbstractStub<SearchBlockingStub> {
    private SearchBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.SearchOuterClass.ResponsePeerSearch peerSearch(dialog.SearchOuterClass.RequestPeerSearch request) {
      return blockingUnaryCall(
          getChannel(), getPeerSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SearchOuterClass.ResponseResolvePeer resolvePeer(dialog.SearchOuterClass.RequestResolvePeer request) {
      return blockingUnaryCall(
          getChannel(), getResolvePeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SearchOuterClass.ResponseMessageSearchResponse messageSearch(dialog.SearchOuterClass.RequestMessageSearch request) {
      return blockingUnaryCall(
          getChannel(), getMessageSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SearchOuterClass.ResponseMessageSearchResponse messageSearchMore(dialog.SearchOuterClass.RequestMessageSearchMore request) {
      return blockingUnaryCall(
          getChannel(), getMessageSearchMoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SearchOuterClass.ResponseMessageSearchResponse simpleSearch(dialog.SearchOuterClass.RequestSimpleSearch request) {
      return blockingUnaryCall(
          getChannel(), getSimpleSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SearchOuterClass.ResponseMessageSearchResponse simpleSearchMore(dialog.SearchOuterClass.RequestSimpleSearchMore request) {
      return blockingUnaryCall(
          getChannel(), getSimpleSearchMoreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchFutureStub extends io.grpc.stub.AbstractStub<SearchFutureStub> {
    private SearchFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SearchOuterClass.ResponsePeerSearch> peerSearch(
        dialog.SearchOuterClass.RequestPeerSearch request) {
      return futureUnaryCall(
          getChannel().newCall(getPeerSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SearchOuterClass.ResponseResolvePeer> resolvePeer(
        dialog.SearchOuterClass.RequestResolvePeer request) {
      return futureUnaryCall(
          getChannel().newCall(getResolvePeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SearchOuterClass.ResponseMessageSearchResponse> messageSearch(
        dialog.SearchOuterClass.RequestMessageSearch request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SearchOuterClass.ResponseMessageSearchResponse> messageSearchMore(
        dialog.SearchOuterClass.RequestMessageSearchMore request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageSearchMoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SearchOuterClass.ResponseMessageSearchResponse> simpleSearch(
        dialog.SearchOuterClass.RequestSimpleSearch request) {
      return futureUnaryCall(
          getChannel().newCall(getSimpleSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SearchOuterClass.ResponseMessageSearchResponse> simpleSearchMore(
        dialog.SearchOuterClass.RequestSimpleSearchMore request) {
      return futureUnaryCall(
          getChannel().newCall(getSimpleSearchMoreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PEER_SEARCH = 0;
  private static final int METHODID_RESOLVE_PEER = 1;
  private static final int METHODID_MESSAGE_SEARCH = 2;
  private static final int METHODID_MESSAGE_SEARCH_MORE = 3;
  private static final int METHODID_SIMPLE_SEARCH = 4;
  private static final int METHODID_SIMPLE_SEARCH_MORE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PEER_SEARCH:
          serviceImpl.peerSearch((dialog.SearchOuterClass.RequestPeerSearch) request,
              (io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponsePeerSearch>) responseObserver);
          break;
        case METHODID_RESOLVE_PEER:
          serviceImpl.resolvePeer((dialog.SearchOuterClass.RequestResolvePeer) request,
              (io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseResolvePeer>) responseObserver);
          break;
        case METHODID_MESSAGE_SEARCH:
          serviceImpl.messageSearch((dialog.SearchOuterClass.RequestMessageSearch) request,
              (io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse>) responseObserver);
          break;
        case METHODID_MESSAGE_SEARCH_MORE:
          serviceImpl.messageSearchMore((dialog.SearchOuterClass.RequestMessageSearchMore) request,
              (io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse>) responseObserver);
          break;
        case METHODID_SIMPLE_SEARCH:
          serviceImpl.simpleSearch((dialog.SearchOuterClass.RequestSimpleSearch) request,
              (io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse>) responseObserver);
          break;
        case METHODID_SIMPLE_SEARCH_MORE:
          serviceImpl.simpleSearchMore((dialog.SearchOuterClass.RequestSimpleSearchMore) request,
              (io.grpc.stub.StreamObserver<dialog.SearchOuterClass.ResponseMessageSearchResponse>) responseObserver);
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

  private static abstract class SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.SearchOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Search");
    }
  }

  private static final class SearchFileDescriptorSupplier
      extends SearchBaseDescriptorSupplier {
    SearchFileDescriptorSupplier() {}
  }

  private static final class SearchMethodDescriptorSupplier
      extends SearchBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchFileDescriptorSupplier())
              .addMethod(getPeerSearchMethod())
              .addMethod(getResolvePeerMethod())
              .addMethod(getMessageSearchMethod())
              .addMethod(getMessageSearchMoreMethod())
              .addMethod(getSimpleSearchMethod())
              .addMethod(getSimpleSearchMoreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
