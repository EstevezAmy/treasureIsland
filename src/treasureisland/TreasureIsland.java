/*
* Main Class for Treasure Island Game
 */
package treasureisland;

import byui.cit260.treasureIsland.model.Player;

/**
 *
 * @author Amy, Indira
 */
public class TreasureIsland {

    /** Game setup according to class instructions
     * @param args
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Player One");
        playerOne.setCurrentScore(1500);
        playerOne.setBestScore(1550);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
