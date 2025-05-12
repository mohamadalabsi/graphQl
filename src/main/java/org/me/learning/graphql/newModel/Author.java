package org.me.learning.graphql.newModel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(int id , String name ) {
    public static List<Author> authors = Arrays.asList(
            new Author(1, "Allah") ,
            new Author(2, "malek"),
            new Author(3, "mohammad"));


    public static Optional<Author> getById(int id) {
        return authors.stream().filter(b -> b.id()==id).findFirst();   // orl else , or else throw works like optional
    }
}
