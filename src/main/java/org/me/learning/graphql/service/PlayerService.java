package org.me.learning.graphql.service;


import org.me.learning.graphql.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PlayerService {

    ArrayList <Player> players = new ArrayList<>();
//     this to generate ids
    AtomicInteger id = new AtomicInteger(0);


    public List<Player> findAllPlayers (){
        return  players;
    }
    public Optional<Player> findOne (Integer id ){
        return  players.stream().filter(player ->  player.getId() == id).findFirst();
    }


    public Player createPlayer(Player player){
        Player newPlayer = new Player( id.incrementAndGet() , player.getName(), player.getTeam());
        players.add(newPlayer);
        return  newPlayer;
    }
}
