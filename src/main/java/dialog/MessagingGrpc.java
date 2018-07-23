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
    comments = "Source: messaging.proto")
public final class MessagingGrpc {

  private MessagingGrpc() {}

  public static final String SERVICE_NAME = "dialog.Messaging";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDoInteractiveMediaAction,
      dialog.Miscellaneous.ResponseVoid> getDoInteractiveMediaActionMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDoInteractiveMediaAction,
      dialog.Miscellaneous.ResponseVoid> getDoInteractiveMediaActionMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDoInteractiveMediaAction, dialog.Miscellaneous.ResponseVoid> getDoInteractiveMediaActionMethod;
    if ((getDoInteractiveMediaActionMethod = MessagingGrpc.getDoInteractiveMediaActionMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getDoInteractiveMediaActionMethod = MessagingGrpc.getDoInteractiveMediaActionMethod) == null) {
          MessagingGrpc.getDoInteractiveMediaActionMethod = getDoInteractiveMediaActionMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestDoInteractiveMediaAction, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "DoInteractiveMediaAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestDoInteractiveMediaAction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("DoInteractiveMediaAction"))
                  .build();
          }
        }
     }
     return getDoInteractiveMediaActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestSendMessage,
      dialog.Miscellaneous.ResponseSeqDate> getSendMessageMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestSendMessage,
      dialog.Miscellaneous.ResponseSeqDate> getSendMessageMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestSendMessage, dialog.Miscellaneous.ResponseSeqDate> getSendMessageMethod;
    if ((getSendMessageMethod = MessagingGrpc.getSendMessageMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getSendMessageMethod = MessagingGrpc.getSendMessageMethod) == null) {
          MessagingGrpc.getSendMessageMethod = getSendMessageMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestSendMessage, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "SendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestSendMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("SendMessage"))
                  .build();
          }
        }
     }
     return getSendMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUpdateMessage,
      dialog.Miscellaneous.ResponseSeqDate> getUpdateMessageMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUpdateMessage,
      dialog.Miscellaneous.ResponseSeqDate> getUpdateMessageMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUpdateMessage, dialog.Miscellaneous.ResponseSeqDate> getUpdateMessageMethod;
    if ((getUpdateMessageMethod = MessagingGrpc.getUpdateMessageMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getUpdateMessageMethod = MessagingGrpc.getUpdateMessageMethod) == null) {
          MessagingGrpc.getUpdateMessageMethod = getUpdateMessageMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestUpdateMessage, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "UpdateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestUpdateMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("UpdateMessage"))
                  .build();
          }
        }
     }
     return getUpdateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageReceived,
      dialog.Miscellaneous.ResponseVoid> getMessageReceivedMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageReceived,
      dialog.Miscellaneous.ResponseVoid> getMessageReceivedMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageReceived, dialog.Miscellaneous.ResponseVoid> getMessageReceivedMethod;
    if ((getMessageReceivedMethod = MessagingGrpc.getMessageReceivedMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getMessageReceivedMethod = MessagingGrpc.getMessageReceivedMethod) == null) {
          MessagingGrpc.getMessageReceivedMethod = getMessageReceivedMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestMessageReceived, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "MessageReceived"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestMessageReceived.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("MessageReceived"))
                  .build();
          }
        }
     }
     return getMessageReceivedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageRead,
      dialog.Miscellaneous.ResponseVoid> getMessageReadMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageRead,
      dialog.Miscellaneous.ResponseVoid> getMessageReadMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageRead, dialog.Miscellaneous.ResponseVoid> getMessageReadMethod;
    if ((getMessageReadMethod = MessagingGrpc.getMessageReadMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getMessageReadMethod = MessagingGrpc.getMessageReadMethod) == null) {
          MessagingGrpc.getMessageReadMethod = getMessageReadMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestMessageRead, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "MessageRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestMessageRead.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("MessageRead"))
                  .build();
          }
        }
     }
     return getMessageReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDeleteMessageObsolete,
      dialog.Miscellaneous.ResponseSeq> getDeleteMessageObsoleteMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDeleteMessageObsolete,
      dialog.Miscellaneous.ResponseSeq> getDeleteMessageObsoleteMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDeleteMessageObsolete, dialog.Miscellaneous.ResponseSeq> getDeleteMessageObsoleteMethod;
    if ((getDeleteMessageObsoleteMethod = MessagingGrpc.getDeleteMessageObsoleteMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getDeleteMessageObsoleteMethod = MessagingGrpc.getDeleteMessageObsoleteMethod) == null) {
          MessagingGrpc.getDeleteMessageObsoleteMethod = getDeleteMessageObsoleteMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestDeleteMessageObsolete, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "DeleteMessageObsolete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestDeleteMessageObsolete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("DeleteMessageObsolete"))
                  .build();
          }
        }
     }
     return getDeleteMessageObsoleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestClearChat,
      dialog.Miscellaneous.ResponseSeq> getClearChatMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestClearChat,
      dialog.Miscellaneous.ResponseSeq> getClearChatMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestClearChat, dialog.Miscellaneous.ResponseSeq> getClearChatMethod;
    if ((getClearChatMethod = MessagingGrpc.getClearChatMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getClearChatMethod = MessagingGrpc.getClearChatMethod) == null) {
          MessagingGrpc.getClearChatMethod = getClearChatMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestClearChat, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "ClearChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestClearChat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("ClearChat"))
                  .build();
          }
        }
     }
     return getClearChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDeleteChat,
      dialog.Miscellaneous.ResponseSeq> getDeleteChatMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDeleteChat,
      dialog.Miscellaneous.ResponseSeq> getDeleteChatMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestDeleteChat, dialog.Miscellaneous.ResponseSeq> getDeleteChatMethod;
    if ((getDeleteChatMethod = MessagingGrpc.getDeleteChatMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getDeleteChatMethod = MessagingGrpc.getDeleteChatMethod) == null) {
          MessagingGrpc.getDeleteChatMethod = getDeleteChatMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestDeleteChat, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "DeleteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestDeleteChat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("DeleteChat"))
                  .build();
          }
        }
     }
     return getDeleteChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestArchiveChat,
      dialog.Miscellaneous.ResponseSeq> getArchiveChatMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestArchiveChat,
      dialog.Miscellaneous.ResponseSeq> getArchiveChatMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestArchiveChat, dialog.Miscellaneous.ResponseSeq> getArchiveChatMethod;
    if ((getArchiveChatMethod = MessagingGrpc.getArchiveChatMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getArchiveChatMethod = MessagingGrpc.getArchiveChatMethod) == null) {
          MessagingGrpc.getArchiveChatMethod = getArchiveChatMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestArchiveChat, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "ArchiveChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestArchiveChat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("ArchiveChat"))
                  .build();
          }
        }
     }
     return getArchiveChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageSetReaction,
      dialog.MessagingOuterClass.ResponseReactionsResponse> getMessageSetReactionMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageSetReaction,
      dialog.MessagingOuterClass.ResponseReactionsResponse> getMessageSetReactionMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageSetReaction, dialog.MessagingOuterClass.ResponseReactionsResponse> getMessageSetReactionMethod;
    if ((getMessageSetReactionMethod = MessagingGrpc.getMessageSetReactionMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getMessageSetReactionMethod = MessagingGrpc.getMessageSetReactionMethod) == null) {
          MessagingGrpc.getMessageSetReactionMethod = getMessageSetReactionMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestMessageSetReaction, dialog.MessagingOuterClass.ResponseReactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "MessageSetReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestMessageSetReaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseReactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("MessageSetReaction"))
                  .build();
          }
        }
     }
     return getMessageSetReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageRemoveReaction,
      dialog.MessagingOuterClass.ResponseReactionsResponse> getMessageRemoveReactionMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageRemoveReaction,
      dialog.MessagingOuterClass.ResponseReactionsResponse> getMessageRemoveReactionMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestMessageRemoveReaction, dialog.MessagingOuterClass.ResponseReactionsResponse> getMessageRemoveReactionMethod;
    if ((getMessageRemoveReactionMethod = MessagingGrpc.getMessageRemoveReactionMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getMessageRemoveReactionMethod = MessagingGrpc.getMessageRemoveReactionMethod) == null) {
          MessagingGrpc.getMessageRemoveReactionMethod = getMessageRemoveReactionMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestMessageRemoveReaction, dialog.MessagingOuterClass.ResponseReactionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "MessageRemoveReaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestMessageRemoveReaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseReactionsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("MessageRemoveReaction"))
                  .build();
          }
        }
     }
     return getMessageRemoveReactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadHistory,
      dialog.MessagingOuterClass.ResponseLoadHistory> getLoadHistoryMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadHistory,
      dialog.MessagingOuterClass.ResponseLoadHistory> getLoadHistoryMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadHistory, dialog.MessagingOuterClass.ResponseLoadHistory> getLoadHistoryMethod;
    if ((getLoadHistoryMethod = MessagingGrpc.getLoadHistoryMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getLoadHistoryMethod = MessagingGrpc.getLoadHistoryMethod) == null) {
          MessagingGrpc.getLoadHistoryMethod = getLoadHistoryMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestLoadHistory, dialog.MessagingOuterClass.ResponseLoadHistory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "LoadHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestLoadHistory.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseLoadHistory.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("LoadHistory"))
                  .build();
          }
        }
     }
     return getLoadHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadDialogs,
      dialog.MessagingOuterClass.ResponseLoadDialogs> getLoadDialogsMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadDialogs,
      dialog.MessagingOuterClass.ResponseLoadDialogs> getLoadDialogsMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadDialogs, dialog.MessagingOuterClass.ResponseLoadDialogs> getLoadDialogsMethod;
    if ((getLoadDialogsMethod = MessagingGrpc.getLoadDialogsMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getLoadDialogsMethod = MessagingGrpc.getLoadDialogsMethod) == null) {
          MessagingGrpc.getLoadDialogsMethod = getLoadDialogsMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestLoadDialogs, dialog.MessagingOuterClass.ResponseLoadDialogs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "LoadDialogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestLoadDialogs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseLoadDialogs.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("LoadDialogs"))
                  .build();
          }
        }
     }
     return getLoadDialogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestFetchDialogIndex,
      dialog.MessagingOuterClass.ResponseFetchDialogIndex> getFetchDialogIndexMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestFetchDialogIndex,
      dialog.MessagingOuterClass.ResponseFetchDialogIndex> getFetchDialogIndexMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestFetchDialogIndex, dialog.MessagingOuterClass.ResponseFetchDialogIndex> getFetchDialogIndexMethod;
    if ((getFetchDialogIndexMethod = MessagingGrpc.getFetchDialogIndexMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getFetchDialogIndexMethod = MessagingGrpc.getFetchDialogIndexMethod) == null) {
          MessagingGrpc.getFetchDialogIndexMethod = getFetchDialogIndexMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestFetchDialogIndex, dialog.MessagingOuterClass.ResponseFetchDialogIndex>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "FetchDialogIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestFetchDialogIndex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseFetchDialogIndex.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("FetchDialogIndex"))
                  .build();
          }
        }
     }
     return getFetchDialogIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadArchived,
      dialog.MessagingOuterClass.ResponseLoadArchived> getLoadArchivedMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadArchived,
      dialog.MessagingOuterClass.ResponseLoadArchived> getLoadArchivedMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadArchived, dialog.MessagingOuterClass.ResponseLoadArchived> getLoadArchivedMethod;
    if ((getLoadArchivedMethod = MessagingGrpc.getLoadArchivedMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getLoadArchivedMethod = MessagingGrpc.getLoadArchivedMethod) == null) {
          MessagingGrpc.getLoadArchivedMethod = getLoadArchivedMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestLoadArchived, dialog.MessagingOuterClass.ResponseLoadArchived>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "LoadArchived"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestLoadArchived.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseLoadArchived.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("LoadArchived"))
                  .build();
          }
        }
     }
     return getLoadArchivedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadGroupedDialogs,
      dialog.MessagingOuterClass.ResponseLoadGroupedDialogs> getLoadGroupedDialogsMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadGroupedDialogs,
      dialog.MessagingOuterClass.ResponseLoadGroupedDialogs> getLoadGroupedDialogsMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestLoadGroupedDialogs, dialog.MessagingOuterClass.ResponseLoadGroupedDialogs> getLoadGroupedDialogsMethod;
    if ((getLoadGroupedDialogsMethod = MessagingGrpc.getLoadGroupedDialogsMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getLoadGroupedDialogsMethod = MessagingGrpc.getLoadGroupedDialogsMethod) == null) {
          MessagingGrpc.getLoadGroupedDialogsMethod = getLoadGroupedDialogsMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestLoadGroupedDialogs, dialog.MessagingOuterClass.ResponseLoadGroupedDialogs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "LoadGroupedDialogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestLoadGroupedDialogs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseLoadGroupedDialogs.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("LoadGroupedDialogs"))
                  .build();
          }
        }
     }
     return getLoadGroupedDialogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestHideDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getHideDialogMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestHideDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getHideDialogMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestHideDialog, dialog.MessagingOuterClass.ResponseDialogsOrder> getHideDialogMethod;
    if ((getHideDialogMethod = MessagingGrpc.getHideDialogMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getHideDialogMethod = MessagingGrpc.getHideDialogMethod) == null) {
          MessagingGrpc.getHideDialogMethod = getHideDialogMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestHideDialog, dialog.MessagingOuterClass.ResponseDialogsOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "HideDialog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestHideDialog.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseDialogsOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("HideDialog"))
                  .build();
          }
        }
     }
     return getHideDialogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestShowDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getShowDialogMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestShowDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getShowDialogMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestShowDialog, dialog.MessagingOuterClass.ResponseDialogsOrder> getShowDialogMethod;
    if ((getShowDialogMethod = MessagingGrpc.getShowDialogMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getShowDialogMethod = MessagingGrpc.getShowDialogMethod) == null) {
          MessagingGrpc.getShowDialogMethod = getShowDialogMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestShowDialog, dialog.MessagingOuterClass.ResponseDialogsOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "ShowDialog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestShowDialog.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseDialogsOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("ShowDialog"))
                  .build();
          }
        }
     }
     return getShowDialogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestFavouriteDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getFavouriteDialogMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestFavouriteDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getFavouriteDialogMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestFavouriteDialog, dialog.MessagingOuterClass.ResponseDialogsOrder> getFavouriteDialogMethod;
    if ((getFavouriteDialogMethod = MessagingGrpc.getFavouriteDialogMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getFavouriteDialogMethod = MessagingGrpc.getFavouriteDialogMethod) == null) {
          MessagingGrpc.getFavouriteDialogMethod = getFavouriteDialogMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestFavouriteDialog, dialog.MessagingOuterClass.ResponseDialogsOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "FavouriteDialog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestFavouriteDialog.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseDialogsOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("FavouriteDialog"))
                  .build();
          }
        }
     }
     return getFavouriteDialogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUnfavouriteDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getUnfavouriteDialogMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUnfavouriteDialog,
      dialog.MessagingOuterClass.ResponseDialogsOrder> getUnfavouriteDialogMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUnfavouriteDialog, dialog.MessagingOuterClass.ResponseDialogsOrder> getUnfavouriteDialogMethod;
    if ((getUnfavouriteDialogMethod = MessagingGrpc.getUnfavouriteDialogMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getUnfavouriteDialogMethod = MessagingGrpc.getUnfavouriteDialogMethod) == null) {
          MessagingGrpc.getUnfavouriteDialogMethod = getUnfavouriteDialogMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestUnfavouriteDialog, dialog.MessagingOuterClass.ResponseDialogsOrder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "UnfavouriteDialog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestUnfavouriteDialog.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.ResponseDialogsOrder.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("UnfavouriteDialog"))
                  .build();
          }
        }
     }
     return getUnfavouriteDialogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestNotifyDialogOpened,
      dialog.Miscellaneous.ResponseVoid> getNotifyDialogOpenedMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestNotifyDialogOpened,
      dialog.Miscellaneous.ResponseVoid> getNotifyDialogOpenedMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestNotifyDialogOpened, dialog.Miscellaneous.ResponseVoid> getNotifyDialogOpenedMethod;
    if ((getNotifyDialogOpenedMethod = MessagingGrpc.getNotifyDialogOpenedMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getNotifyDialogOpenedMethod = MessagingGrpc.getNotifyDialogOpenedMethod) == null) {
          MessagingGrpc.getNotifyDialogOpenedMethod = getNotifyDialogOpenedMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestNotifyDialogOpened, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "NotifyDialogOpened"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestNotifyDialogOpened.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("NotifyDialogOpened"))
                  .build();
          }
        }
     }
     return getNotifyDialogOpenedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestPinMessage,
      dialog.Miscellaneous.ResponseSeqDate> getPinMessageMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestPinMessage,
      dialog.Miscellaneous.ResponseSeqDate> getPinMessageMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestPinMessage, dialog.Miscellaneous.ResponseSeqDate> getPinMessageMethod;
    if ((getPinMessageMethod = MessagingGrpc.getPinMessageMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getPinMessageMethod = MessagingGrpc.getPinMessageMethod) == null) {
          MessagingGrpc.getPinMessageMethod = getPinMessageMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestPinMessage, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "PinMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestPinMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("PinMessage"))
                  .build();
          }
        }
     }
     return getPinMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUnpinMessage,
      dialog.Miscellaneous.ResponseSeqDate> getUnpinMessageMethod;

  public static io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUnpinMessage,
      dialog.Miscellaneous.ResponseSeqDate> getUnpinMessageMethod() {
    io.grpc.MethodDescriptor<dialog.MessagingOuterClass.RequestUnpinMessage, dialog.Miscellaneous.ResponseSeqDate> getUnpinMessageMethod;
    if ((getUnpinMessageMethod = MessagingGrpc.getUnpinMessageMethod) == null) {
      synchronized (MessagingGrpc.class) {
        if ((getUnpinMessageMethod = MessagingGrpc.getUnpinMessageMethod) == null) {
          MessagingGrpc.getUnpinMessageMethod = getUnpinMessageMethod = 
              io.grpc.MethodDescriptor.<dialog.MessagingOuterClass.RequestUnpinMessage, dialog.Miscellaneous.ResponseSeqDate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Messaging", "UnpinMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MessagingOuterClass.RequestUnpinMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeqDate.getDefaultInstance()))
                  .setSchemaDescriptor(new MessagingMethodDescriptorSupplier("UnpinMessage"))
                  .build();
          }
        }
     }
     return getUnpinMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagingStub newStub(io.grpc.Channel channel) {
    return new MessagingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MessagingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MessagingFutureStub(channel);
  }

  /**
   */
  public static abstract class MessagingImplBase implements io.grpc.BindableService {

    /**
     */
    public void doInteractiveMediaAction(dialog.MessagingOuterClass.RequestDoInteractiveMediaAction request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getDoInteractiveMediaActionMethod(), responseObserver);
    }

    /**
     */
    public void sendMessage(dialog.MessagingOuterClass.RequestSendMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    /**
     */
    public void updateMessage(dialog.MessagingOuterClass.RequestUpdateMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMessageMethod(), responseObserver);
    }

    /**
     */
    public void messageReceived(dialog.MessagingOuterClass.RequestMessageReceived request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageReceivedMethod(), responseObserver);
    }

    /**
     */
    public void messageRead(dialog.MessagingOuterClass.RequestMessageRead request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageReadMethod(), responseObserver);
    }

    /**
     */
    public void deleteMessageObsolete(dialog.MessagingOuterClass.RequestDeleteMessageObsolete request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMessageObsoleteMethod(), responseObserver);
    }

    /**
     */
    public void clearChat(dialog.MessagingOuterClass.RequestClearChat request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getClearChatMethod(), responseObserver);
    }

    /**
     */
    public void deleteChat(dialog.MessagingOuterClass.RequestDeleteChat request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteChatMethod(), responseObserver);
    }

    /**
     */
    public void archiveChat(dialog.MessagingOuterClass.RequestArchiveChat request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getArchiveChatMethod(), responseObserver);
    }

    /**
     */
    public void messageSetReaction(dialog.MessagingOuterClass.RequestMessageSetReaction request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseReactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageSetReactionMethod(), responseObserver);
    }

    /**
     */
    public void messageRemoveReaction(dialog.MessagingOuterClass.RequestMessageRemoveReaction request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseReactionsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMessageRemoveReactionMethod(), responseObserver);
    }

    /**
     */
    public void loadHistory(dialog.MessagingOuterClass.RequestLoadHistory request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadHistory> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadHistoryMethod(), responseObserver);
    }

    /**
     */
    public void loadDialogs(dialog.MessagingOuterClass.RequestLoadDialogs request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadDialogs> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadDialogsMethod(), responseObserver);
    }

    /**
     */
    public void fetchDialogIndex(dialog.MessagingOuterClass.RequestFetchDialogIndex request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseFetchDialogIndex> responseObserver) {
      asyncUnimplementedUnaryCall(getFetchDialogIndexMethod(), responseObserver);
    }

    /**
     */
    public void loadArchived(dialog.MessagingOuterClass.RequestLoadArchived request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadArchived> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadArchivedMethod(), responseObserver);
    }

    /**
     */
    public void loadGroupedDialogs(dialog.MessagingOuterClass.RequestLoadGroupedDialogs request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadGroupedDialogs> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadGroupedDialogsMethod(), responseObserver);
    }

    /**
     */
    public void hideDialog(dialog.MessagingOuterClass.RequestHideDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getHideDialogMethod(), responseObserver);
    }

    /**
     */
    public void showDialog(dialog.MessagingOuterClass.RequestShowDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getShowDialogMethod(), responseObserver);
    }

    /**
     */
    public void favouriteDialog(dialog.MessagingOuterClass.RequestFavouriteDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getFavouriteDialogMethod(), responseObserver);
    }

    /**
     */
    public void unfavouriteDialog(dialog.MessagingOuterClass.RequestUnfavouriteDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnimplementedUnaryCall(getUnfavouriteDialogMethod(), responseObserver);
    }

    /**
     */
    public void notifyDialogOpened(dialog.MessagingOuterClass.RequestNotifyDialogOpened request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyDialogOpenedMethod(), responseObserver);
    }

    /**
     */
    public void pinMessage(dialog.MessagingOuterClass.RequestPinMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getPinMessageMethod(), responseObserver);
    }

    /**
     */
    public void unpinMessage(dialog.MessagingOuterClass.RequestUnpinMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnimplementedUnaryCall(getUnpinMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoInteractiveMediaActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestDoInteractiveMediaAction,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_DO_INTERACTIVE_MEDIA_ACTION)))
          .addMethod(
            getSendMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestSendMessage,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_SEND_MESSAGE)))
          .addMethod(
            getUpdateMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestUpdateMessage,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_UPDATE_MESSAGE)))
          .addMethod(
            getMessageReceivedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestMessageReceived,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_MESSAGE_RECEIVED)))
          .addMethod(
            getMessageReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestMessageRead,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_MESSAGE_READ)))
          .addMethod(
            getDeleteMessageObsoleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestDeleteMessageObsolete,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_DELETE_MESSAGE_OBSOLETE)))
          .addMethod(
            getClearChatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestClearChat,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_CLEAR_CHAT)))
          .addMethod(
            getDeleteChatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestDeleteChat,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_DELETE_CHAT)))
          .addMethod(
            getArchiveChatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestArchiveChat,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_ARCHIVE_CHAT)))
          .addMethod(
            getMessageSetReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestMessageSetReaction,
                dialog.MessagingOuterClass.ResponseReactionsResponse>(
                  this, METHODID_MESSAGE_SET_REACTION)))
          .addMethod(
            getMessageRemoveReactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestMessageRemoveReaction,
                dialog.MessagingOuterClass.ResponseReactionsResponse>(
                  this, METHODID_MESSAGE_REMOVE_REACTION)))
          .addMethod(
            getLoadHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestLoadHistory,
                dialog.MessagingOuterClass.ResponseLoadHistory>(
                  this, METHODID_LOAD_HISTORY)))
          .addMethod(
            getLoadDialogsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestLoadDialogs,
                dialog.MessagingOuterClass.ResponseLoadDialogs>(
                  this, METHODID_LOAD_DIALOGS)))
          .addMethod(
            getFetchDialogIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestFetchDialogIndex,
                dialog.MessagingOuterClass.ResponseFetchDialogIndex>(
                  this, METHODID_FETCH_DIALOG_INDEX)))
          .addMethod(
            getLoadArchivedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestLoadArchived,
                dialog.MessagingOuterClass.ResponseLoadArchived>(
                  this, METHODID_LOAD_ARCHIVED)))
          .addMethod(
            getLoadGroupedDialogsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestLoadGroupedDialogs,
                dialog.MessagingOuterClass.ResponseLoadGroupedDialogs>(
                  this, METHODID_LOAD_GROUPED_DIALOGS)))
          .addMethod(
            getHideDialogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestHideDialog,
                dialog.MessagingOuterClass.ResponseDialogsOrder>(
                  this, METHODID_HIDE_DIALOG)))
          .addMethod(
            getShowDialogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestShowDialog,
                dialog.MessagingOuterClass.ResponseDialogsOrder>(
                  this, METHODID_SHOW_DIALOG)))
          .addMethod(
            getFavouriteDialogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestFavouriteDialog,
                dialog.MessagingOuterClass.ResponseDialogsOrder>(
                  this, METHODID_FAVOURITE_DIALOG)))
          .addMethod(
            getUnfavouriteDialogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestUnfavouriteDialog,
                dialog.MessagingOuterClass.ResponseDialogsOrder>(
                  this, METHODID_UNFAVOURITE_DIALOG)))
          .addMethod(
            getNotifyDialogOpenedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestNotifyDialogOpened,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_NOTIFY_DIALOG_OPENED)))
          .addMethod(
            getPinMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestPinMessage,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_PIN_MESSAGE)))
          .addMethod(
            getUnpinMessageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MessagingOuterClass.RequestUnpinMessage,
                dialog.Miscellaneous.ResponseSeqDate>(
                  this, METHODID_UNPIN_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class MessagingStub extends io.grpc.stub.AbstractStub<MessagingStub> {
    private MessagingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingStub(channel, callOptions);
    }

    /**
     */
    public void doInteractiveMediaAction(dialog.MessagingOuterClass.RequestDoInteractiveMediaAction request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoInteractiveMediaActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendMessage(dialog.MessagingOuterClass.RequestSendMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMessage(dialog.MessagingOuterClass.RequestUpdateMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageReceived(dialog.MessagingOuterClass.RequestMessageReceived request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageReceivedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageRead(dialog.MessagingOuterClass.RequestMessageRead request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMessageObsolete(dialog.MessagingOuterClass.RequestDeleteMessageObsolete request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMessageObsoleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearChat(dialog.MessagingOuterClass.RequestClearChat request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChat(dialog.MessagingOuterClass.RequestDeleteChat request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void archiveChat(dialog.MessagingOuterClass.RequestArchiveChat request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getArchiveChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageSetReaction(dialog.MessagingOuterClass.RequestMessageSetReaction request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseReactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageSetReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void messageRemoveReaction(dialog.MessagingOuterClass.RequestMessageRemoveReaction request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseReactionsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMessageRemoveReactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadHistory(dialog.MessagingOuterClass.RequestLoadHistory request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadHistory> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadDialogs(dialog.MessagingOuterClass.RequestLoadDialogs request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadDialogs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadDialogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fetchDialogIndex(dialog.MessagingOuterClass.RequestFetchDialogIndex request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseFetchDialogIndex> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFetchDialogIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadArchived(dialog.MessagingOuterClass.RequestLoadArchived request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadArchived> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadArchivedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadGroupedDialogs(dialog.MessagingOuterClass.RequestLoadGroupedDialogs request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadGroupedDialogs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadGroupedDialogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hideDialog(dialog.MessagingOuterClass.RequestHideDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHideDialogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void showDialog(dialog.MessagingOuterClass.RequestShowDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowDialogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void favouriteDialog(dialog.MessagingOuterClass.RequestFavouriteDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFavouriteDialogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unfavouriteDialog(dialog.MessagingOuterClass.RequestUnfavouriteDialog request,
        io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnfavouriteDialogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyDialogOpened(dialog.MessagingOuterClass.RequestNotifyDialogOpened request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyDialogOpenedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pinMessage(dialog.MessagingOuterClass.RequestPinMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPinMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unpinMessage(dialog.MessagingOuterClass.RequestUnpinMessage request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnpinMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessagingBlockingStub extends io.grpc.stub.AbstractStub<MessagingBlockingStub> {
    private MessagingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid doInteractiveMediaAction(dialog.MessagingOuterClass.RequestDoInteractiveMediaAction request) {
      return blockingUnaryCall(
          getChannel(), getDoInteractiveMediaActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate sendMessage(dialog.MessagingOuterClass.RequestSendMessage request) {
      return blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate updateMessage(dialog.MessagingOuterClass.RequestUpdateMessage request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid messageReceived(dialog.MessagingOuterClass.RequestMessageReceived request) {
      return blockingUnaryCall(
          getChannel(), getMessageReceivedMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid messageRead(dialog.MessagingOuterClass.RequestMessageRead request) {
      return blockingUnaryCall(
          getChannel(), getMessageReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq deleteMessageObsolete(dialog.MessagingOuterClass.RequestDeleteMessageObsolete request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMessageObsoleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq clearChat(dialog.MessagingOuterClass.RequestClearChat request) {
      return blockingUnaryCall(
          getChannel(), getClearChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq deleteChat(dialog.MessagingOuterClass.RequestDeleteChat request) {
      return blockingUnaryCall(
          getChannel(), getDeleteChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq archiveChat(dialog.MessagingOuterClass.RequestArchiveChat request) {
      return blockingUnaryCall(
          getChannel(), getArchiveChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseReactionsResponse messageSetReaction(dialog.MessagingOuterClass.RequestMessageSetReaction request) {
      return blockingUnaryCall(
          getChannel(), getMessageSetReactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseReactionsResponse messageRemoveReaction(dialog.MessagingOuterClass.RequestMessageRemoveReaction request) {
      return blockingUnaryCall(
          getChannel(), getMessageRemoveReactionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseLoadHistory loadHistory(dialog.MessagingOuterClass.RequestLoadHistory request) {
      return blockingUnaryCall(
          getChannel(), getLoadHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseLoadDialogs loadDialogs(dialog.MessagingOuterClass.RequestLoadDialogs request) {
      return blockingUnaryCall(
          getChannel(), getLoadDialogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseFetchDialogIndex fetchDialogIndex(dialog.MessagingOuterClass.RequestFetchDialogIndex request) {
      return blockingUnaryCall(
          getChannel(), getFetchDialogIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseLoadArchived loadArchived(dialog.MessagingOuterClass.RequestLoadArchived request) {
      return blockingUnaryCall(
          getChannel(), getLoadArchivedMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseLoadGroupedDialogs loadGroupedDialogs(dialog.MessagingOuterClass.RequestLoadGroupedDialogs request) {
      return blockingUnaryCall(
          getChannel(), getLoadGroupedDialogsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseDialogsOrder hideDialog(dialog.MessagingOuterClass.RequestHideDialog request) {
      return blockingUnaryCall(
          getChannel(), getHideDialogMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseDialogsOrder showDialog(dialog.MessagingOuterClass.RequestShowDialog request) {
      return blockingUnaryCall(
          getChannel(), getShowDialogMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseDialogsOrder favouriteDialog(dialog.MessagingOuterClass.RequestFavouriteDialog request) {
      return blockingUnaryCall(
          getChannel(), getFavouriteDialogMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MessagingOuterClass.ResponseDialogsOrder unfavouriteDialog(dialog.MessagingOuterClass.RequestUnfavouriteDialog request) {
      return blockingUnaryCall(
          getChannel(), getUnfavouriteDialogMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid notifyDialogOpened(dialog.MessagingOuterClass.RequestNotifyDialogOpened request) {
      return blockingUnaryCall(
          getChannel(), getNotifyDialogOpenedMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate pinMessage(dialog.MessagingOuterClass.RequestPinMessage request) {
      return blockingUnaryCall(
          getChannel(), getPinMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeqDate unpinMessage(dialog.MessagingOuterClass.RequestUnpinMessage request) {
      return blockingUnaryCall(
          getChannel(), getUnpinMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessagingFutureStub extends io.grpc.stub.AbstractStub<MessagingFutureStub> {
    private MessagingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MessagingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MessagingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> doInteractiveMediaAction(
        dialog.MessagingOuterClass.RequestDoInteractiveMediaAction request) {
      return futureUnaryCall(
          getChannel().newCall(getDoInteractiveMediaActionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> sendMessage(
        dialog.MessagingOuterClass.RequestSendMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> updateMessage(
        dialog.MessagingOuterClass.RequestUpdateMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> messageReceived(
        dialog.MessagingOuterClass.RequestMessageReceived request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageReceivedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> messageRead(
        dialog.MessagingOuterClass.RequestMessageRead request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> deleteMessageObsolete(
        dialog.MessagingOuterClass.RequestDeleteMessageObsolete request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMessageObsoleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> clearChat(
        dialog.MessagingOuterClass.RequestClearChat request) {
      return futureUnaryCall(
          getChannel().newCall(getClearChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> deleteChat(
        dialog.MessagingOuterClass.RequestDeleteChat request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> archiveChat(
        dialog.MessagingOuterClass.RequestArchiveChat request) {
      return futureUnaryCall(
          getChannel().newCall(getArchiveChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseReactionsResponse> messageSetReaction(
        dialog.MessagingOuterClass.RequestMessageSetReaction request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageSetReactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseReactionsResponse> messageRemoveReaction(
        dialog.MessagingOuterClass.RequestMessageRemoveReaction request) {
      return futureUnaryCall(
          getChannel().newCall(getMessageRemoveReactionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseLoadHistory> loadHistory(
        dialog.MessagingOuterClass.RequestLoadHistory request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadHistoryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseLoadDialogs> loadDialogs(
        dialog.MessagingOuterClass.RequestLoadDialogs request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadDialogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseFetchDialogIndex> fetchDialogIndex(
        dialog.MessagingOuterClass.RequestFetchDialogIndex request) {
      return futureUnaryCall(
          getChannel().newCall(getFetchDialogIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseLoadArchived> loadArchived(
        dialog.MessagingOuterClass.RequestLoadArchived request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadArchivedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseLoadGroupedDialogs> loadGroupedDialogs(
        dialog.MessagingOuterClass.RequestLoadGroupedDialogs request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadGroupedDialogsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseDialogsOrder> hideDialog(
        dialog.MessagingOuterClass.RequestHideDialog request) {
      return futureUnaryCall(
          getChannel().newCall(getHideDialogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseDialogsOrder> showDialog(
        dialog.MessagingOuterClass.RequestShowDialog request) {
      return futureUnaryCall(
          getChannel().newCall(getShowDialogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseDialogsOrder> favouriteDialog(
        dialog.MessagingOuterClass.RequestFavouriteDialog request) {
      return futureUnaryCall(
          getChannel().newCall(getFavouriteDialogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MessagingOuterClass.ResponseDialogsOrder> unfavouriteDialog(
        dialog.MessagingOuterClass.RequestUnfavouriteDialog request) {
      return futureUnaryCall(
          getChannel().newCall(getUnfavouriteDialogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> notifyDialogOpened(
        dialog.MessagingOuterClass.RequestNotifyDialogOpened request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyDialogOpenedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> pinMessage(
        dialog.MessagingOuterClass.RequestPinMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getPinMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeqDate> unpinMessage(
        dialog.MessagingOuterClass.RequestUnpinMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUnpinMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_INTERACTIVE_MEDIA_ACTION = 0;
  private static final int METHODID_SEND_MESSAGE = 1;
  private static final int METHODID_UPDATE_MESSAGE = 2;
  private static final int METHODID_MESSAGE_RECEIVED = 3;
  private static final int METHODID_MESSAGE_READ = 4;
  private static final int METHODID_DELETE_MESSAGE_OBSOLETE = 5;
  private static final int METHODID_CLEAR_CHAT = 6;
  private static final int METHODID_DELETE_CHAT = 7;
  private static final int METHODID_ARCHIVE_CHAT = 8;
  private static final int METHODID_MESSAGE_SET_REACTION = 9;
  private static final int METHODID_MESSAGE_REMOVE_REACTION = 10;
  private static final int METHODID_LOAD_HISTORY = 11;
  private static final int METHODID_LOAD_DIALOGS = 12;
  private static final int METHODID_FETCH_DIALOG_INDEX = 13;
  private static final int METHODID_LOAD_ARCHIVED = 14;
  private static final int METHODID_LOAD_GROUPED_DIALOGS = 15;
  private static final int METHODID_HIDE_DIALOG = 16;
  private static final int METHODID_SHOW_DIALOG = 17;
  private static final int METHODID_FAVOURITE_DIALOG = 18;
  private static final int METHODID_UNFAVOURITE_DIALOG = 19;
  private static final int METHODID_NOTIFY_DIALOG_OPENED = 20;
  private static final int METHODID_PIN_MESSAGE = 21;
  private static final int METHODID_UNPIN_MESSAGE = 22;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_INTERACTIVE_MEDIA_ACTION:
          serviceImpl.doInteractiveMediaAction((dialog.MessagingOuterClass.RequestDoInteractiveMediaAction) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((dialog.MessagingOuterClass.RequestSendMessage) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
          break;
        case METHODID_UPDATE_MESSAGE:
          serviceImpl.updateMessage((dialog.MessagingOuterClass.RequestUpdateMessage) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
          break;
        case METHODID_MESSAGE_RECEIVED:
          serviceImpl.messageReceived((dialog.MessagingOuterClass.RequestMessageReceived) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_MESSAGE_READ:
          serviceImpl.messageRead((dialog.MessagingOuterClass.RequestMessageRead) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE_OBSOLETE:
          serviceImpl.deleteMessageObsolete((dialog.MessagingOuterClass.RequestDeleteMessageObsolete) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_CLEAR_CHAT:
          serviceImpl.clearChat((dialog.MessagingOuterClass.RequestClearChat) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_DELETE_CHAT:
          serviceImpl.deleteChat((dialog.MessagingOuterClass.RequestDeleteChat) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_ARCHIVE_CHAT:
          serviceImpl.archiveChat((dialog.MessagingOuterClass.RequestArchiveChat) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_MESSAGE_SET_REACTION:
          serviceImpl.messageSetReaction((dialog.MessagingOuterClass.RequestMessageSetReaction) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseReactionsResponse>) responseObserver);
          break;
        case METHODID_MESSAGE_REMOVE_REACTION:
          serviceImpl.messageRemoveReaction((dialog.MessagingOuterClass.RequestMessageRemoveReaction) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseReactionsResponse>) responseObserver);
          break;
        case METHODID_LOAD_HISTORY:
          serviceImpl.loadHistory((dialog.MessagingOuterClass.RequestLoadHistory) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadHistory>) responseObserver);
          break;
        case METHODID_LOAD_DIALOGS:
          serviceImpl.loadDialogs((dialog.MessagingOuterClass.RequestLoadDialogs) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadDialogs>) responseObserver);
          break;
        case METHODID_FETCH_DIALOG_INDEX:
          serviceImpl.fetchDialogIndex((dialog.MessagingOuterClass.RequestFetchDialogIndex) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseFetchDialogIndex>) responseObserver);
          break;
        case METHODID_LOAD_ARCHIVED:
          serviceImpl.loadArchived((dialog.MessagingOuterClass.RequestLoadArchived) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadArchived>) responseObserver);
          break;
        case METHODID_LOAD_GROUPED_DIALOGS:
          serviceImpl.loadGroupedDialogs((dialog.MessagingOuterClass.RequestLoadGroupedDialogs) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseLoadGroupedDialogs>) responseObserver);
          break;
        case METHODID_HIDE_DIALOG:
          serviceImpl.hideDialog((dialog.MessagingOuterClass.RequestHideDialog) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder>) responseObserver);
          break;
        case METHODID_SHOW_DIALOG:
          serviceImpl.showDialog((dialog.MessagingOuterClass.RequestShowDialog) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder>) responseObserver);
          break;
        case METHODID_FAVOURITE_DIALOG:
          serviceImpl.favouriteDialog((dialog.MessagingOuterClass.RequestFavouriteDialog) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder>) responseObserver);
          break;
        case METHODID_UNFAVOURITE_DIALOG:
          serviceImpl.unfavouriteDialog((dialog.MessagingOuterClass.RequestUnfavouriteDialog) request,
              (io.grpc.stub.StreamObserver<dialog.MessagingOuterClass.ResponseDialogsOrder>) responseObserver);
          break;
        case METHODID_NOTIFY_DIALOG_OPENED:
          serviceImpl.notifyDialogOpened((dialog.MessagingOuterClass.RequestNotifyDialogOpened) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_PIN_MESSAGE:
          serviceImpl.pinMessage((dialog.MessagingOuterClass.RequestPinMessage) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
          break;
        case METHODID_UNPIN_MESSAGE:
          serviceImpl.unpinMessage((dialog.MessagingOuterClass.RequestUnpinMessage) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeqDate>) responseObserver);
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

  private static abstract class MessagingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.MessagingOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Messaging");
    }
  }

  private static final class MessagingFileDescriptorSupplier
      extends MessagingBaseDescriptorSupplier {
    MessagingFileDescriptorSupplier() {}
  }

  private static final class MessagingMethodDescriptorSupplier
      extends MessagingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagingMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessagingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagingFileDescriptorSupplier())
              .addMethod(getDoInteractiveMediaActionMethod())
              .addMethod(getSendMessageMethod())
              .addMethod(getUpdateMessageMethod())
              .addMethod(getMessageReceivedMethod())
              .addMethod(getMessageReadMethod())
              .addMethod(getDeleteMessageObsoleteMethod())
              .addMethod(getClearChatMethod())
              .addMethod(getDeleteChatMethod())
              .addMethod(getArchiveChatMethod())
              .addMethod(getMessageSetReactionMethod())
              .addMethod(getMessageRemoveReactionMethod())
              .addMethod(getLoadHistoryMethod())
              .addMethod(getLoadDialogsMethod())
              .addMethod(getFetchDialogIndexMethod())
              .addMethod(getLoadArchivedMethod())
              .addMethod(getLoadGroupedDialogsMethod())
              .addMethod(getHideDialogMethod())
              .addMethod(getShowDialogMethod())
              .addMethod(getFavouriteDialogMethod())
              .addMethod(getUnfavouriteDialogMethod())
              .addMethod(getNotifyDialogOpenedMethod())
              .addMethod(getPinMessageMethod())
              .addMethod(getUnpinMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
