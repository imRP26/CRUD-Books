// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: book_message.proto
// Protobuf Java Version: 4.27.1

package com.github.traceable.crudbook.pb;

public interface BookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:traceable.crudbook.Book)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string isbn = 1;</code>
   * @return The isbn.
   */
  java.lang.String getIsbn();
  /**
   * <code>string isbn = 1;</code>
   * @return The bytes for isbn.
   */
  com.google.protobuf.ByteString
      getIsbnBytes();

  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>repeated string authors = 3;</code>
   * @return A list containing the authors.
   */
  java.util.List<java.lang.String>
      getAuthorsList();
  /**
   * <code>repeated string authors = 3;</code>
   * @return The count of authors.
   */
  int getAuthorsCount();
  /**
   * <code>repeated string authors = 3;</code>
   * @param index The index of the element to return.
   * @return The authors at the given index.
   */
  java.lang.String getAuthors(int index);
  /**
   * <code>repeated string authors = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the authors at the given index.
   */
  com.google.protobuf.ByteString
      getAuthorsBytes(int index);

  /**
   * <code>uint32 page_count = 4;</code>
   * @return The pageCount.
   */
  int getPageCount();
}
