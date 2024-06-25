// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: book_message.proto
// Protobuf Java Version: 4.27.1

package com.github.traceable.crudbook.pb;

/**
 * Protobuf type {@code traceable.crudbook.Book}
 */
public final class Book extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:traceable.crudbook.Book)
    BookOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 1,
      /* suffix= */ "",
      Book.class.getName());
  }
  // Use Book.newBuilder() to construct.
  private Book(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Book() {
    isbn_ = "";
    title_ = "";
    authors_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.traceable.crudbook.pb.BookMessage.internal_static_traceable_crudbook_Book_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.traceable.crudbook.pb.BookMessage.internal_static_traceable_crudbook_Book_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.traceable.crudbook.pb.Book.class, com.github.traceable.crudbook.pb.Book.Builder.class);
  }

  public static final int ISBN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object isbn_ = "";
  /**
   * <code>string isbn = 1;</code>
   * @return The isbn.
   */
  @java.lang.Override
  public java.lang.String getIsbn() {
    java.lang.Object ref = isbn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      isbn_ = s;
      return s;
    }
  }
  /**
   * <code>string isbn = 1;</code>
   * @return The bytes for isbn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIsbnBytes() {
    java.lang.Object ref = isbn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      isbn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHORS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList authors_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string authors = 3;</code>
   * @return A list containing the authors.
   */
  public com.google.protobuf.ProtocolStringList
      getAuthorsList() {
    return authors_;
  }
  /**
   * <code>repeated string authors = 3;</code>
   * @return The count of authors.
   */
  public int getAuthorsCount() {
    return authors_.size();
  }
  /**
   * <code>repeated string authors = 3;</code>
   * @param index The index of the element to return.
   * @return The authors at the given index.
   */
  public java.lang.String getAuthors(int index) {
    return authors_.get(index);
  }
  /**
   * <code>repeated string authors = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the authors at the given index.
   */
  public com.google.protobuf.ByteString
      getAuthorsBytes(int index) {
    return authors_.getByteString(index);
  }

  public static final int PAGE_COUNT_FIELD_NUMBER = 4;
  private int pageCount_ = 0;
  /**
   * <code>uint32 page_count = 4;</code>
   * @return The pageCount.
   */
  @java.lang.Override
  public int getPageCount() {
    return pageCount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(isbn_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, isbn_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, title_);
    }
    for (int i = 0; i < authors_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, authors_.getRaw(i));
    }
    if (pageCount_ != 0) {
      output.writeUInt32(4, pageCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(isbn_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, isbn_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, title_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < authors_.size(); i++) {
        dataSize += computeStringSizeNoTag(authors_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAuthorsList().size();
    }
    if (pageCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, pageCount_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.traceable.crudbook.pb.Book)) {
      return super.equals(obj);
    }
    com.github.traceable.crudbook.pb.Book other = (com.github.traceable.crudbook.pb.Book) obj;

    if (!getIsbn()
        .equals(other.getIsbn())) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getAuthorsList()
        .equals(other.getAuthorsList())) return false;
    if (getPageCount()
        != other.getPageCount()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ISBN_FIELD_NUMBER;
    hash = (53 * hash) + getIsbn().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    if (getAuthorsCount() > 0) {
      hash = (37 * hash) + AUTHORS_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorsList().hashCode();
    }
    hash = (37 * hash) + PAGE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPageCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.traceable.crudbook.pb.Book parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.traceable.crudbook.pb.Book parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.traceable.crudbook.pb.Book parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.github.traceable.crudbook.pb.Book parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.traceable.crudbook.pb.Book prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code traceable.crudbook.Book}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:traceable.crudbook.Book)
      com.github.traceable.crudbook.pb.BookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.traceable.crudbook.pb.BookMessage.internal_static_traceable_crudbook_Book_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.traceable.crudbook.pb.BookMessage.internal_static_traceable_crudbook_Book_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.traceable.crudbook.pb.Book.class, com.github.traceable.crudbook.pb.Book.Builder.class);
    }

    // Construct using com.github.traceable.crudbook.pb.Book.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      isbn_ = "";
      title_ = "";
      authors_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      pageCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.traceable.crudbook.pb.BookMessage.internal_static_traceable_crudbook_Book_descriptor;
    }

    @java.lang.Override
    public com.github.traceable.crudbook.pb.Book getDefaultInstanceForType() {
      return com.github.traceable.crudbook.pb.Book.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.traceable.crudbook.pb.Book build() {
      com.github.traceable.crudbook.pb.Book result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.traceable.crudbook.pb.Book buildPartial() {
      com.github.traceable.crudbook.pb.Book result = new com.github.traceable.crudbook.pb.Book(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.traceable.crudbook.pb.Book result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isbn_ = isbn_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        authors_.makeImmutable();
        result.authors_ = authors_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageCount_ = pageCount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.traceable.crudbook.pb.Book) {
        return mergeFrom((com.github.traceable.crudbook.pb.Book)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.traceable.crudbook.pb.Book other) {
      if (other == com.github.traceable.crudbook.pb.Book.getDefaultInstance()) return this;
      if (!other.getIsbn().isEmpty()) {
        isbn_ = other.isbn_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.authors_.isEmpty()) {
        if (authors_.isEmpty()) {
          authors_ = other.authors_;
          bitField0_ |= 0x00000004;
        } else {
          ensureAuthorsIsMutable();
          authors_.addAll(other.authors_);
        }
        onChanged();
      }
      if (other.getPageCount() != 0) {
        setPageCount(other.getPageCount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              isbn_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              title_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAuthorsIsMutable();
              authors_.add(s);
              break;
            } // case 26
            case 32: {
              pageCount_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object isbn_ = "";
    /**
     * <code>string isbn = 1;</code>
     * @return The isbn.
     */
    public java.lang.String getIsbn() {
      java.lang.Object ref = isbn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        isbn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string isbn = 1;</code>
     * @return The bytes for isbn.
     */
    public com.google.protobuf.ByteString
        getIsbnBytes() {
      java.lang.Object ref = isbn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        isbn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string isbn = 1;</code>
     * @param value The isbn to set.
     * @return This builder for chaining.
     */
    public Builder setIsbn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      isbn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string isbn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsbn() {
      isbn_ = getDefaultInstance().getIsbn();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string isbn = 1;</code>
     * @param value The bytes for isbn to set.
     * @return This builder for chaining.
     */
    public Builder setIsbnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      isbn_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList authors_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAuthorsIsMutable() {
      if (!authors_.isModifiable()) {
        authors_ = new com.google.protobuf.LazyStringArrayList(authors_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @return A list containing the authors.
     */
    public com.google.protobuf.ProtocolStringList
        getAuthorsList() {
      authors_.makeImmutable();
      return authors_;
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @return The count of authors.
     */
    public int getAuthorsCount() {
      return authors_.size();
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @param index The index of the element to return.
     * @return The authors at the given index.
     */
    public java.lang.String getAuthors(int index) {
      return authors_.get(index);
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the authors at the given index.
     */
    public com.google.protobuf.ByteString
        getAuthorsBytes(int index) {
      return authors_.getByteString(index);
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @param index The index to set the value at.
     * @param value The authors to set.
     * @return This builder for chaining.
     */
    public Builder setAuthors(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAuthorsIsMutable();
      authors_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @param value The authors to add.
     * @return This builder for chaining.
     */
    public Builder addAuthors(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAuthorsIsMutable();
      authors_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @param values The authors to add.
     * @return This builder for chaining.
     */
    public Builder addAllAuthors(
        java.lang.Iterable<java.lang.String> values) {
      ensureAuthorsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, authors_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthors() {
      authors_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string authors = 3;</code>
     * @param value The bytes of the authors to add.
     * @return This builder for chaining.
     */
    public Builder addAuthorsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAuthorsIsMutable();
      authors_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int pageCount_ ;
    /**
     * <code>uint32 page_count = 4;</code>
     * @return The pageCount.
     */
    @java.lang.Override
    public int getPageCount() {
      return pageCount_;
    }
    /**
     * <code>uint32 page_count = 4;</code>
     * @param value The pageCount to set.
     * @return This builder for chaining.
     */
    public Builder setPageCount(int value) {

      pageCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 page_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pageCount_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:traceable.crudbook.Book)
  }

  // @@protoc_insertion_point(class_scope:traceable.crudbook.Book)
  private static final com.github.traceable.crudbook.pb.Book DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.traceable.crudbook.pb.Book();
  }

  public static com.github.traceable.crudbook.pb.Book getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Book>
      PARSER = new com.google.protobuf.AbstractParser<Book>() {
    @java.lang.Override
    public Book parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Book> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Book> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.traceable.crudbook.pb.Book getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

