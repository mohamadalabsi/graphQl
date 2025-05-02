package org.me.learning.graphql.OldModel;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player {
    private int id ;
    private String name ;
    private Team team ;
}
