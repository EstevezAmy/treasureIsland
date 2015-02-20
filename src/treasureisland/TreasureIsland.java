/*
 *This is the main function of VikingQuest
 */
package treasureisland;

//Import class statements

import byui.cit260.treasureIsland.view.StartProgramView;
import byui.cit260.treasureIsland.model.Game;
import byui.cit260.treasureIsland.model.Player;



/**
 * @author Amy, Jennifer and Ivy
 */
public class TreasureIsland {

    /**
     * @param args the command line arguments
     */
    
    //Class instance Variables
    private static Game currentGame = null;
    private static Player player = null;
    
    //Getter and Setter functions
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        TreasureIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        TreasureIsland.player = player;
    }
    
    
    
    public static void main(String[] args) {
         
        // Start program view layer
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
    } 
    
}

