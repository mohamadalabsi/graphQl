package org.me.learning.graphql.newModel;

import java.util.Arrays;
import java.util.List;

public record Book(int id , String name , int pages) {


    public static List<Book> books = Arrays.asList(new Book(1, "Quran",604),
                                                   new Book(1, "Harry Potter",700),
                                                   new Book(1, "Foobar",100) );
}
