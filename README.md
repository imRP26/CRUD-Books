## BookStore Services using gRPC

***********************************************************************************************************
This is a basic CRUD app demonstrating the utilities of an online BookStore made using gRPC. 4 functionalities have been implemented :-
- **CreateBook** -> This RPC basically creates and adds a book to the in-memory data store (ConcurrentHashMap) with the given parameters.
- **GetBooks** -> This RPC utilizes a filter parameter 'minPageCount' and returns only those books having a page count > minPageCount.
- **DeletBook** -> This RPC deletes a book from the bookstore.
- **UpdateBook** -> This RPC updates a book with some new parameter values(s).

***********************************************************************************************************
The required proto files can be found in :-
- CRUD-Books/src/main/proto/book_message.proto
- CRUD-Books/src/main/proto/filter_message.proto
- CRUD-Books/src/main/proto/book_service.proto

***********************************************************************************************************
The server and the client applications can be found in :-
- CRUD-Books/src/main/java/com/github/traceable/crudbook/services/BookServer.java
- CRUD-Books/src/main/java/com/github/traceable/crudbook/services/BookClient.java

***********************************************************************************************************
Unit Tests have been written and verified successfully for CreateBook and DeleteBook RPCs, using JUnit4. The Unit test files can be found in :-
- CRUD-Books/src/main/java/com/github/traceable/crudbook/serializer/SeralizerTest.java
- CRUD-Books/src/main/java/com/github/traceable/crudbook/services/BookServerTest.java

************************************************************************************************************
The versions of various dependencies used in the project have been mentioned in build.gradle (most of them being of the latest versions). The gradle version used in **8.5**

************************************************************************************************************
Remaining work to be done (as of now) :-
- Unit Tests for GetBooks and UpdateBook RPCs.
