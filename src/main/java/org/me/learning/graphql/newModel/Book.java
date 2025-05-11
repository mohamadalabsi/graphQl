package org.me.learning.graphql.newModel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(int id , String name , int pages) {


    public static List<Book> books = Arrays.asList(new Book(1, "Quran",604),
                                                   new Book(1, "Harry Potter",700),
                                                   new Book(1, "Foobar",100) );

    public static Optional<Book> getById(int id) {
        return books.stream().filter(b -> b.id()==id).findFirst();   // orl else , or else throw works like optional
    }
// add some data , after that we will be using DB
}
