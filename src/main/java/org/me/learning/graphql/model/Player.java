package org.me.learning.graphql.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name ;
    private int id ;
    private Team team ;
}
