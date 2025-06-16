package org.me.learning.graphql.OldController;


import org.me.learning.graphql.OldModel.Player;
import org.me.learning.graphql.OldService.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService ;

    @GetMapping("player")
    public List<Player> findAllPlayers(){
        return playerService.findAllPlayers();
    }

    @PutMapping("player")
    public Player updatePlayer (@RequestBody Player player){
      return  playerService.updatePlayer(player);

    }

    @PostMapping("player")
    public Player addPlayer (@RequestBody Player player){
        return  playerService.createPlayer(player);

//        Player player1 = playerService.createPlayer(player);
//          return player1.getId();
//         now if we have lets say a backend for a big project and this backend connected to android , apple and web application
//        like this example when i want to return players it will return player (all attributes ), and the filter it and display ,  what we want  what if i want for android just the name and image and not the id
//        i have to make other method for just android , cuz here it does not work in the same method and sometimes more than one method if i want to return specific thing or use the same method for all and then filter them in the frontend or send multiple request which is bad
//        so we use graph ql for this , with it we can return specific things for each client



//         i have to finish docker and then complete project
//        almost finished docker







    }












}
