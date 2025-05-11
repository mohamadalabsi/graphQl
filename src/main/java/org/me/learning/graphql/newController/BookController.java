package org.me.learning.graphql.newController;


import org.me.learning.graphql.newModel.Book;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {



        @QueryMapping
        public List<Book> books (){  // we should use the same name from shema.grapghQl in type Query
            return Book.books;
// now this return all books and you can take whatever u want like the ids or names but can not take specific id or name this i will do in the next request
        }


    @QueryMapping
    public Optional<Book> bookById (@Argument int id){
        return Book.getById(id);
    }
}
