/*
 * Treasure Island - View Layer - Main Menu
 */
package byui.cit260.treasureIsland.view;

// Import Directories
import byui.cit260.treasureIsland.control.GameControl;
import treasureisland.TreasureIsland;

/**
 *
 * @author Amy/Indira
 */


public class MainMenuView {
     
    //MENU - called in public void displayMenu()
    private final String MENU = "\n"
        + "\n---------------------"
        + "\n|     Main Menu     |"
        + "\n---------------------"
        + "\nG - Start Game"
        + "\nH - Get help on how to play the game"
        + "\nS - Save Game"
        + "\nE - Exit"
        + "\n---------------------";
    
    public void displayMenu() {
        
        //Placeholder function to show function call
        System.out.println("*** MainMenuView.displayMenu() function called ***");
        
        char selection = ' ';
        do {
            System.out.println(MENU); //Display the main menu
            
        String input = this.getInput(); // Get user selection
        selection = input.charAt(0);
        
        this.doAction(selection);  //Do action selected
        
        }
        while (selection != 'E'); // A selection is not Exit
        
    }

    private String getInput() {
        
        //Ask for and recieve user name input Placeholder
        System.out.println("\n*** The user input is requested and stored. ***");
      
        return null;
    }
    
    public void doAction(char choice) {
        switch (choice) {
            case 'N': // will create a new game
                this.startNewGame();
                break;
            case 'G': // will start an existing game
                this.startExistingGame();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'E': // Exit Program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
    }
    
    
    private void startNewGame() {
        
        //Placeholder Comment
        System.out.println("*** startNewGame function called ***");
        
        //Create New Game
        GameControl.createNewGame(TreasureIsland.getPlayer());
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    private void startExistingGame() {
        
        //Placeholder mark begining of function call
        System.out.println("*** StartExistingGame function called ***");
        
        //Create New Game
        GameControl.createNewGame(TreasureIsland.getPlayer());
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }
    
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    } 
}

    
