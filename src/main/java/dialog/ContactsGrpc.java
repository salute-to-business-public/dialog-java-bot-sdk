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
    comments = "Source: contacts.proto")
public final class ContactsGrpc {

  private ContactsGrpc() {}

  public static final String SERVICE_NAME = "dialog.Contacts";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestImportContacts,
      dialog.ContactsOuterClass.ResponseImportContacts> getImportContactsMethod;

  public static io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestImportContacts,
      dialog.ContactsOuterClass.ResponseImportContacts> getImportContactsMethod() {
    io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestImportContacts, dialog.ContactsOuterClass.ResponseImportContacts> getImportContactsMethod;
    if ((getImportContactsMethod = ContactsGrpc.getImportContactsMethod) == null) {
      synchronized (ContactsGrpc.class) {
        if ((getImportContactsMethod = ContactsGrpc.getImportContactsMethod) == null) {
          ContactsGrpc.getImportContactsMethod = getImportContactsMethod = 
              io.grpc.MethodDescriptor.<dialog.ContactsOuterClass.RequestImportContacts, dialog.ContactsOuterClass.ResponseImportContacts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Contacts", "ImportContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.RequestImportContacts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.ResponseImportContacts.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactsMethodDescriptorSupplier("ImportContacts"))
                  .build();
          }
        }
     }
     return getImportContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestDeferredImportContacts,
      dialog.ContactsOuterClass.ResponseDeferredImportContacts> getDeferredImportContactsMethod;

  public static io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestDeferredImportContacts,
      dialog.ContactsOuterClass.ResponseDeferredImportContacts> getDeferredImportContactsMethod() {
    io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestDeferredImportContacts, dialog.ContactsOuterClass.ResponseDeferredImportContacts> getDeferredImportContactsMethod;
    if ((getDeferredImportContactsMethod = ContactsGrpc.getDeferredImportContactsMethod) == null) {
      synchronized (ContactsGrpc.class) {
        if ((getDeferredImportContactsMethod = ContactsGrpc.getDeferredImportContactsMethod) == null) {
          ContactsGrpc.getDeferredImportContactsMethod = getDeferredImportContactsMethod = 
              io.grpc.MethodDescriptor.<dialog.ContactsOuterClass.RequestDeferredImportContacts, dialog.ContactsOuterClass.ResponseDeferredImportContacts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Contacts", "DeferredImportContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.RequestDeferredImportContacts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.ResponseDeferredImportContacts.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactsMethodDescriptorSupplier("DeferredImportContacts"))
                  .build();
          }
        }
     }
     return getDeferredImportContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestGetContacts,
      dialog.ContactsOuterClass.ResponseGetContacts> getGetContactsMethod;

  public static io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestGetContacts,
      dialog.ContactsOuterClass.ResponseGetContacts> getGetContactsMethod() {
    io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestGetContacts, dialog.ContactsOuterClass.ResponseGetContacts> getGetContactsMethod;
    if ((getGetContactsMethod = ContactsGrpc.getGetContactsMethod) == null) {
      synchronized (ContactsGrpc.class) {
        if ((getGetContactsMethod = ContactsGrpc.getGetContactsMethod) == null) {
          ContactsGrpc.getGetContactsMethod = getGetContactsMethod = 
              io.grpc.MethodDescriptor.<dialog.ContactsOuterClass.RequestGetContacts, dialog.ContactsOuterClass.ResponseGetContacts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Contacts", "GetContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.RequestGetContacts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.ResponseGetContacts.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactsMethodDescriptorSupplier("GetContacts"))
                  .build();
          }
        }
     }
     return getGetContactsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestRemoveContact,
      dialog.Miscellaneous.ResponseSeq> getRemoveContactMethod;

  public static io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestRemoveContact,
      dialog.Miscellaneous.ResponseSeq> getRemoveContactMethod() {
    io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestRemoveContact, dialog.Miscellaneous.ResponseSeq> getRemoveContactMethod;
    if ((getRemoveContactMethod = ContactsGrpc.getRemoveContactMethod) == null) {
      synchronized (ContactsGrpc.class) {
        if ((getRemoveContactMethod = ContactsGrpc.getRemoveContactMethod) == null) {
          ContactsGrpc.getRemoveContactMethod = getRemoveContactMethod = 
              io.grpc.MethodDescriptor.<dialog.ContactsOuterClass.RequestRemoveContact, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Contacts", "RemoveContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.RequestRemoveContact.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactsMethodDescriptorSupplier("RemoveContact"))
                  .build();
          }
        }
     }
     return getRemoveContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestAddContact,
      dialog.Miscellaneous.ResponseSeq> getAddContactMethod;

  public static io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestAddContact,
      dialog.Miscellaneous.ResponseSeq> getAddContactMethod() {
    io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestAddContact, dialog.Miscellaneous.ResponseSeq> getAddContactMethod;
    if ((getAddContactMethod = ContactsGrpc.getAddContactMethod) == null) {
      synchronized (ContactsGrpc.class) {
        if ((getAddContactMethod = ContactsGrpc.getAddContactMethod) == null) {
          ContactsGrpc.getAddContactMethod = getAddContactMethod = 
              io.grpc.MethodDescriptor.<dialog.ContactsOuterClass.RequestAddContact, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Contacts", "AddContact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.RequestAddContact.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactsMethodDescriptorSupplier("AddContact"))
                  .build();
          }
        }
     }
     return getAddContactMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestSearchContacts,
      dialog.ContactsOuterClass.ResponseSearchContacts> getSearchContactsMethod;

  public static io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestSearchContacts,
      dialog.ContactsOuterClass.ResponseSearchContacts> getSearchContactsMethod() {
    io.grpc.MethodDescriptor<dialog.ContactsOuterClass.RequestSearchContacts, dialog.ContactsOuterClass.ResponseSearchContacts> getSearchContactsMethod;
    if ((getSearchContactsMethod = ContactsGrpc.getSearchContactsMethod) == null) {
      synchronized (ContactsGrpc.class) {
        if ((getSearchContactsMethod = ContactsGrpc.getSearchContactsMethod) == null) {
          ContactsGrpc.getSearchContactsMethod = getSearchContactsMethod = 
              io.grpc.MethodDescriptor.<dialog.ContactsOuterClass.RequestSearchContacts, dialog.ContactsOuterClass.ResponseSearchContacts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Contacts", "SearchContacts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.RequestSearchContacts.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ContactsOuterClass.ResponseSearchContacts.getDefaultInstance()))
                  .setSchemaDescriptor(new ContactsMethodDescriptorSupplier("SearchContacts"))
                  .build();
          }
        }
     }
     return getSearchContactsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContactsStub newStub(io.grpc.Channel channel) {
    return new ContactsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContactsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContactsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContactsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContactsFutureStub(channel);
  }

  /**
   */
  public static abstract class ContactsImplBase implements io.grpc.BindableService {

    /**
     */
    public void importContacts(dialog.ContactsOuterClass.RequestImportContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseImportContacts> responseObserver) {
      asyncUnimplementedUnaryCall(getImportContactsMethod(), responseObserver);
    }

    /**
     */
    public void deferredImportContacts(dialog.ContactsOuterClass.RequestDeferredImportContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseDeferredImportContacts> responseObserver) {
      asyncUnimplementedUnaryCall(getDeferredImportContactsMethod(), responseObserver);
    }

    /**
     */
    public void getContacts(dialog.ContactsOuterClass.RequestGetContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseGetContacts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetContactsMethod(), responseObserver);
    }

    /**
     */
    public void removeContact(dialog.ContactsOuterClass.RequestRemoveContact request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveContactMethod(), responseObserver);
    }

    /**
     */
    public void addContact(dialog.ContactsOuterClass.RequestAddContact request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getAddContactMethod(), responseObserver);
    }

    /**
     */
    public void searchContacts(dialog.ContactsOuterClass.RequestSearchContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseSearchContacts> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchContactsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getImportContactsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ContactsOuterClass.RequestImportContacts,
                dialog.ContactsOuterClass.ResponseImportContacts>(
                  this, METHODID_IMPORT_CONTACTS)))
          .addMethod(
            getDeferredImportContactsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ContactsOuterClass.RequestDeferredImportContacts,
                dialog.ContactsOuterClass.ResponseDeferredImportContacts>(
                  this, METHODID_DEFERRED_IMPORT_CONTACTS)))
          .addMethod(
            getGetContactsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ContactsOuterClass.RequestGetContacts,
                dialog.ContactsOuterClass.ResponseGetContacts>(
                  this, METHODID_GET_CONTACTS)))
          .addMethod(
            getRemoveContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ContactsOuterClass.RequestRemoveContact,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_REMOVE_CONTACT)))
          .addMethod(
            getAddContactMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ContactsOuterClass.RequestAddContact,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_ADD_CONTACT)))
          .addMethod(
            getSearchContactsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ContactsOuterClass.RequestSearchContacts,
                dialog.ContactsOuterClass.ResponseSearchContacts>(
                  this, METHODID_SEARCH_CONTACTS)))
          .build();
    }
  }

  /**
   */
  public static final class ContactsStub extends io.grpc.stub.AbstractStub<ContactsStub> {
    private ContactsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactsStub(channel, callOptions);
    }

    /**
     */
    public void importContacts(dialog.ContactsOuterClass.RequestImportContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseImportContacts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deferredImportContacts(dialog.ContactsOuterClass.RequestDeferredImportContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseDeferredImportContacts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeferredImportContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getContacts(dialog.ContactsOuterClass.RequestGetContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseGetContacts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetContactsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeContact(dialog.ContactsOuterClass.RequestRemoveContact request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addContact(dialog.ContactsOuterClass.RequestAddContact request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchContacts(dialog.ContactsOuterClass.RequestSearchContacts request,
        io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseSearchContacts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchContactsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContactsBlockingStub extends io.grpc.stub.AbstractStub<ContactsBlockingStub> {
    private ContactsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactsBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.ContactsOuterClass.ResponseImportContacts importContacts(dialog.ContactsOuterClass.RequestImportContacts request) {
      return blockingUnaryCall(
          getChannel(), getImportContactsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.ContactsOuterClass.ResponseDeferredImportContacts deferredImportContacts(dialog.ContactsOuterClass.RequestDeferredImportContacts request) {
      return blockingUnaryCall(
          getChannel(), getDeferredImportContactsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.ContactsOuterClass.ResponseGetContacts getContacts(dialog.ContactsOuterClass.RequestGetContacts request) {
      return blockingUnaryCall(
          getChannel(), getGetContactsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq removeContact(dialog.ContactsOuterClass.RequestRemoveContact request) {
      return blockingUnaryCall(
          getChannel(), getRemoveContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq addContact(dialog.ContactsOuterClass.RequestAddContact request) {
      return blockingUnaryCall(
          getChannel(), getAddContactMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.ContactsOuterClass.ResponseSearchContacts searchContacts(dialog.ContactsOuterClass.RequestSearchContacts request) {
      return blockingUnaryCall(
          getChannel(), getSearchContactsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContactsFutureStub extends io.grpc.stub.AbstractStub<ContactsFutureStub> {
    private ContactsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContactsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContactsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContactsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.ContactsOuterClass.ResponseImportContacts> importContacts(
        dialog.ContactsOuterClass.RequestImportContacts request) {
      return futureUnaryCall(
          getChannel().newCall(getImportContactsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.ContactsOuterClass.ResponseDeferredImportContacts> deferredImportContacts(
        dialog.ContactsOuterClass.RequestDeferredImportContacts request) {
      return futureUnaryCall(
          getChannel().newCall(getDeferredImportContactsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.ContactsOuterClass.ResponseGetContacts> getContacts(
        dialog.ContactsOuterClass.RequestGetContacts request) {
      return futureUnaryCall(
          getChannel().newCall(getGetContactsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> removeContact(
        dialog.ContactsOuterClass.RequestRemoveContact request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> addContact(
        dialog.ContactsOuterClass.RequestAddContact request) {
      return futureUnaryCall(
          getChannel().newCall(getAddContactMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.ContactsOuterClass.ResponseSearchContacts> searchContacts(
        dialog.ContactsOuterClass.RequestSearchContacts request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchContactsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IMPORT_CONTACTS = 0;
  private static final int METHODID_DEFERRED_IMPORT_CONTACTS = 1;
  private static final int METHODID_GET_CONTACTS = 2;
  private static final int METHODID_REMOVE_CONTACT = 3;
  private static final int METHODID_ADD_CONTACT = 4;
  private static final int METHODID_SEARCH_CONTACTS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContactsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContactsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMPORT_CONTACTS:
          serviceImpl.importContacts((dialog.ContactsOuterClass.RequestImportContacts) request,
              (io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseImportContacts>) responseObserver);
          break;
        case METHODID_DEFERRED_IMPORT_CONTACTS:
          serviceImpl.deferredImportContacts((dialog.ContactsOuterClass.RequestDeferredImportContacts) request,
              (io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseDeferredImportContacts>) responseObserver);
          break;
        case METHODID_GET_CONTACTS:
          serviceImpl.getContacts((dialog.ContactsOuterClass.RequestGetContacts) request,
              (io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseGetContacts>) responseObserver);
          break;
        case METHODID_REMOVE_CONTACT:
          serviceImpl.removeContact((dialog.ContactsOuterClass.RequestRemoveContact) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_ADD_CONTACT:
          serviceImpl.addContact((dialog.ContactsOuterClass.RequestAddContact) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_SEARCH_CONTACTS:
          serviceImpl.searchContacts((dialog.ContactsOuterClass.RequestSearchContacts) request,
              (io.grpc.stub.StreamObserver<dialog.ContactsOuterClass.ResponseSearchContacts>) responseObserver);
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

  private static abstract class ContactsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContactsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.ContactsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Contacts");
    }
  }

  private static final class ContactsFileDescriptorSupplier
      extends ContactsBaseDescriptorSupplier {
    ContactsFileDescriptorSupplier() {}
  }

  private static final class ContactsMethodDescriptorSupplier
      extends ContactsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContactsMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContactsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContactsFileDescriptorSupplier())
              .addMethod(getImportContactsMethod())
              .addMethod(getDeferredImportContactsMethod())
              .addMethod(getGetContactsMethod())
              .addMethod(getRemoveContactMethod())
              .addMethod(getAddContactMethod())
              .addMethod(getSearchContactsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
