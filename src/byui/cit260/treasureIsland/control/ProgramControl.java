/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureIsland.control;

import byui.cit260.treasureIsland.model.Player;
import treasureisland.TreasureIsland;

/**
 *
 * @author Jenny
 */
public class ProgramControl {

    public static Player createPlayer(String name){
        
        // Placeholder
        System.out.println("\n*** createPlayer function called ***");
        
        // Function
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        TreasureIsland.setPlayer(player); // save the player
        
        return player;
    }
}
