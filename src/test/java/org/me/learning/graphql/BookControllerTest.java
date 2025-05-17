package org.me.learning.graphql;

import org.junit.jupiter.api.Test;
import org.me.learning.graphql.newController.BookController;
import org.me.learning.graphql.newModel.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;


@GraphQlTest(BookController.class) // this for testing the graphQl Apis and this annotation used specially for graphQl
class BookControllerTest {

    @Autowired
    private GraphQlTester graphQlTester ;

    @Test
    void canGetBooks() {
        graphQlTester.document("books")
                .execute()
                .path("books.graphql")
                .entityList(Book.class)
                .hasSize(3);
    }
}