package org.me.learning.graphql.OldService;


import org.me.learning.graphql.OldModel.Player;
import org.me.learning.graphql.OldModel.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    ArrayList<Player> players = new ArrayList(Arrays.asList(new Player(1, "mohammad alabsi ", Team.BARCELONA)));
    //     this to generate ids
//    AtomicInteger id = new AtomicInteger(0);


    public List<Player> findAllPlayers() {
        System.out.println(players);
        return players;

    }

    public Optional<Player> findOne(Integer id) {
        return players.stream().filter(player -> player.getId() == id).findFirst();
//         .or else return neu player or null, but without optional
    }


    public Player createPlayer(Player player) {
//        Player newPlayer = new Player(player.getId(), player.getName(), player.getTeam());
//        players.add(newPlayer);  this works if you have the all player attributes desperately and not object player
        players.add(player);
        return player;
    }

    public Player deletePlayer(int id) {
        Player player1 = players.stream().filter(player -> player.getId() == id).findFirst().orElseThrow(() -> new IllegalArgumentException());
//       here optional or/and   throw exception
        players.remove(player1);
        return player1;

    }

    public Player updatePlayer(Player player) {
//       Player newPlayer = new Player( player.getId() , player.getName(), player.getTeam());
      Optional <Player> player1 = players.stream().filter(c ->  c.getId() ==player.getId()).findFirst();
      System.out.println(player1);
      if (player1.isPresent()){
          Player player2= player1.get(); // this is optional method , cuz we have optional<player> and not list or player

          System.out.println(player2);
          int index= players.indexOf(player2);
          return  players.set(index, player);
      }else{
           throw new IllegalArgumentException();
      }

//        int index = 0;
//        for (int i = 0; i < players.size(); i++) {
//            if (players.get(i).getId()== player.getId()) {
//                index = i;
//            }
//
//
//        }
//         players.set(index, player);
//        return  player;


    }

}
