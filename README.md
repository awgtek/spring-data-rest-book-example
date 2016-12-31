# spring-data-rest-book-example

This example shows how to query a collection of String using Spring Data.

To populate the data, run the `DataUtil` in the test folder. Then run the unit test `BookRepositoryTest` to show the output. 

Alternatively, import the project into Eclipse as a Maven project and run on a Tomcat server instance.

Then query the REST API.

Sample query: http://localhost:8088/spring.data.rest.bookexample/api/books/search/by-keyword?keyword=keyword

With output:
```
{
  "_embedded" : {
    "books" : [ {
      "keywords" : [ "keyWord2" ],
      "_links" : {
        "self" : {
          "href" : "http://localhost:8088/spring.data.rest.bookexample/api/books/2"
        }
      }
    }, {
      "keywords" : [ "keyWord1" ],
      "_links" : {
        "self" : {
          "href" : "http://localhost:8088/spring.data.rest.bookexample/api/books/1"
        }
      }
    } ]
  }
}
```
