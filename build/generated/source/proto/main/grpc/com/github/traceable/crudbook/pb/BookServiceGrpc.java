package com.github.traceable.crudbook.pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.64.0)",
    comments = "Source: book_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookServiceGrpc {

  private BookServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "traceable.crudbook.BookService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.CreateBookRequest,
      com.github.traceable.crudbook.pb.CreateBookResponse> getCreateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBook",
      requestType = com.github.traceable.crudbook.pb.CreateBookRequest.class,
      responseType = com.github.traceable.crudbook.pb.CreateBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.CreateBookRequest,
      com.github.traceable.crudbook.pb.CreateBookResponse> getCreateBookMethod() {
    io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.CreateBookRequest, com.github.traceable.crudbook.pb.CreateBookResponse> getCreateBookMethod;
    if ((getCreateBookMethod = BookServiceGrpc.getCreateBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getCreateBookMethod = BookServiceGrpc.getCreateBookMethod) == null) {
          BookServiceGrpc.getCreateBookMethod = getCreateBookMethod =
              io.grpc.MethodDescriptor.<com.github.traceable.crudbook.pb.CreateBookRequest, com.github.traceable.crudbook.pb.CreateBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.CreateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.CreateBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("CreateBook"))
              .build();
        }
      }
    }
    return getCreateBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.SearchBookRequest,
      com.github.traceable.crudbook.pb.SearchBookResponse> getSearchBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchBook",
      requestType = com.github.traceable.crudbook.pb.SearchBookRequest.class,
      responseType = com.github.traceable.crudbook.pb.SearchBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.SearchBookRequest,
      com.github.traceable.crudbook.pb.SearchBookResponse> getSearchBookMethod() {
    io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.SearchBookRequest, com.github.traceable.crudbook.pb.SearchBookResponse> getSearchBookMethod;
    if ((getSearchBookMethod = BookServiceGrpc.getSearchBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getSearchBookMethod = BookServiceGrpc.getSearchBookMethod) == null) {
          BookServiceGrpc.getSearchBookMethod = getSearchBookMethod =
              io.grpc.MethodDescriptor.<com.github.traceable.crudbook.pb.SearchBookRequest, com.github.traceable.crudbook.pb.SearchBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.SearchBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.SearchBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("SearchBook"))
              .build();
        }
      }
    }
    return getSearchBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.DeleteBookRequest,
      com.github.traceable.crudbook.pb.DeleteBookResponse> getDeleteBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBook",
      requestType = com.github.traceable.crudbook.pb.DeleteBookRequest.class,
      responseType = com.github.traceable.crudbook.pb.DeleteBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.DeleteBookRequest,
      com.github.traceable.crudbook.pb.DeleteBookResponse> getDeleteBookMethod() {
    io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.DeleteBookRequest, com.github.traceable.crudbook.pb.DeleteBookResponse> getDeleteBookMethod;
    if ((getDeleteBookMethod = BookServiceGrpc.getDeleteBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getDeleteBookMethod = BookServiceGrpc.getDeleteBookMethod) == null) {
          BookServiceGrpc.getDeleteBookMethod = getDeleteBookMethod =
              io.grpc.MethodDescriptor.<com.github.traceable.crudbook.pb.DeleteBookRequest, com.github.traceable.crudbook.pb.DeleteBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.DeleteBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.DeleteBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("DeleteBook"))
              .build();
        }
      }
    }
    return getDeleteBookMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.UpdateBookRequest,
      com.github.traceable.crudbook.pb.UpdateBookResponse> getUpdateBookMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBook",
      requestType = com.github.traceable.crudbook.pb.UpdateBookRequest.class,
      responseType = com.github.traceable.crudbook.pb.UpdateBookResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.UpdateBookRequest,
      com.github.traceable.crudbook.pb.UpdateBookResponse> getUpdateBookMethod() {
    io.grpc.MethodDescriptor<com.github.traceable.crudbook.pb.UpdateBookRequest, com.github.traceable.crudbook.pb.UpdateBookResponse> getUpdateBookMethod;
    if ((getUpdateBookMethod = BookServiceGrpc.getUpdateBookMethod) == null) {
      synchronized (BookServiceGrpc.class) {
        if ((getUpdateBookMethod = BookServiceGrpc.getUpdateBookMethod) == null) {
          BookServiceGrpc.getUpdateBookMethod = getUpdateBookMethod =
              io.grpc.MethodDescriptor.<com.github.traceable.crudbook.pb.UpdateBookRequest, com.github.traceable.crudbook.pb.UpdateBookResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBook"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.UpdateBookRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.traceable.crudbook.pb.UpdateBookResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookServiceMethodDescriptorSupplier("UpdateBook"))
              .build();
        }
      }
    }
    return getUpdateBookMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceStub>() {
        @java.lang.Override
        public BookServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceStub(channel, callOptions);
        }
      };
    return BookServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceBlockingStub>() {
        @java.lang.Override
        public BookServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceBlockingStub(channel, callOptions);
        }
      };
    return BookServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookServiceFutureStub>() {
        @java.lang.Override
        public BookServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookServiceFutureStub(channel, callOptions);
        }
      };
    return BookServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    default void createBook(com.github.traceable.crudbook.pb.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.CreateBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * server-streaming RPC
     * </pre>
     */
    default void searchBook(com.github.traceable.crudbook.pb.SearchBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.SearchBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    default void deleteBook(com.github.traceable.crudbook.pb.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.DeleteBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBookMethod(), responseObserver);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    default void updateBook(com.github.traceable.crudbook.pb.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.UpdateBookResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBookMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookService.
   */
  public static abstract class BookServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookService.
   */
  public static final class BookServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookServiceStub> {
    private BookServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public void createBook(com.github.traceable.crudbook.pb.CreateBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.CreateBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * server-streaming RPC
     * </pre>
     */
    public void searchBook(com.github.traceable.crudbook.pb.SearchBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.SearchBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public void deleteBook(com.github.traceable.crudbook.pb.DeleteBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.DeleteBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBookMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public void updateBook(com.github.traceable.crudbook.pb.UpdateBookRequest request,
        io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.UpdateBookResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBookMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookService.
   */
  public static final class BookServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookServiceBlockingStub> {
    private BookServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public com.github.traceable.crudbook.pb.CreateBookResponse createBook(com.github.traceable.crudbook.pb.CreateBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * server-streaming RPC
     * </pre>
     */
    public java.util.Iterator<com.github.traceable.crudbook.pb.SearchBookResponse> searchBook(
        com.github.traceable.crudbook.pb.SearchBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public com.github.traceable.crudbook.pb.DeleteBookResponse deleteBook(com.github.traceable.crudbook.pb.DeleteBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBookMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public com.github.traceable.crudbook.pb.UpdateBookResponse updateBook(com.github.traceable.crudbook.pb.UpdateBookRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBookMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookService.
   */
  public static final class BookServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookServiceFutureStub> {
    private BookServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.traceable.crudbook.pb.CreateBookResponse> createBook(
        com.github.traceable.crudbook.pb.CreateBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.traceable.crudbook.pb.DeleteBookResponse> deleteBook(
        com.github.traceable.crudbook.pb.DeleteBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBookMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.traceable.crudbook.pb.UpdateBookResponse> updateBook(
        com.github.traceable.crudbook.pb.UpdateBookRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBookMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BOOK = 0;
  private static final int METHODID_SEARCH_BOOK = 1;
  private static final int METHODID_DELETE_BOOK = 2;
  private static final int METHODID_UPDATE_BOOK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BOOK:
          serviceImpl.createBook((com.github.traceable.crudbook.pb.CreateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.CreateBookResponse>) responseObserver);
          break;
        case METHODID_SEARCH_BOOK:
          serviceImpl.searchBook((com.github.traceable.crudbook.pb.SearchBookRequest) request,
              (io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.SearchBookResponse>) responseObserver);
          break;
        case METHODID_DELETE_BOOK:
          serviceImpl.deleteBook((com.github.traceable.crudbook.pb.DeleteBookRequest) request,
              (io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.DeleteBookResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOOK:
          serviceImpl.updateBook((com.github.traceable.crudbook.pb.UpdateBookRequest) request,
              (io.grpc.stub.StreamObserver<com.github.traceable.crudbook.pb.UpdateBookResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.traceable.crudbook.pb.CreateBookRequest,
              com.github.traceable.crudbook.pb.CreateBookResponse>(
                service, METHODID_CREATE_BOOK)))
        .addMethod(
          getSearchBookMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.github.traceable.crudbook.pb.SearchBookRequest,
              com.github.traceable.crudbook.pb.SearchBookResponse>(
                service, METHODID_SEARCH_BOOK)))
        .addMethod(
          getDeleteBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.traceable.crudbook.pb.DeleteBookRequest,
              com.github.traceable.crudbook.pb.DeleteBookResponse>(
                service, METHODID_DELETE_BOOK)))
        .addMethod(
          getUpdateBookMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.github.traceable.crudbook.pb.UpdateBookRequest,
              com.github.traceable.crudbook.pb.UpdateBookResponse>(
                service, METHODID_UPDATE_BOOK)))
        .build();
  }

  private static abstract class BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.traceable.crudbook.pb.BookServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookService");
    }
  }

  private static final class BookServiceFileDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier {
    BookServiceFileDescriptorSupplier() {}
  }

  private static final class BookServiceMethodDescriptorSupplier
      extends BookServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookServiceFileDescriptorSupplier())
              .addMethod(getCreateBookMethod())
              .addMethod(getSearchBookMethod())
              .addMethod(getDeleteBookMethod())
              .addMethod(getUpdateBookMethod())
              .build();
        }
      }
    }
    return result;
  }
}
