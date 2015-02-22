/*
 * Treasure Island - View Layer - Main Menu
 */
package byui.cit260.treasureIsland.view;

// Import Directories
import byui.cit260.treasureIsland.control.GameControl;
import java.util.Scanner;
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
        + "\nN - Start New Game"
        + "\nG - Continue Existing Game"
        + "\nH - Get help on how to play the game"
        + "\nS - Save Game"
        + "\nE - Exit"
        + "\n---------------------";
    
    public void displayMenu() {

        
        char selection;
        do {
            System.out.println(MENU); //Display the main menu
            
            String input = this.getInput(); // Get user selection
            selection = input.charAt(0);
        
            this.doAction(selection);  //Do action selected
        
        } while (selection != 'E'); // A selection is not Exit
        
    }

    private String getInput() {
        boolean valid = false;// indicates whether name has been retrived.
        String choice = null;
        Scanner keyboard = new Scanner(System.in);// keyboard input stream
        
        //Ask for and recieve user name input Placeholder
        System.out.println("\n*** The user input is requested and stored. ***");
        
        while(!valid){
                
            //prompt user for input
            System.out.println("Enter the letter of your selection: \n");
            
            //get the name from the keyboard trim off blank spaces
            choice = keyboard.nextLine();
            choice = choice.trim();
                
            //if the input is invalid send out error message
            if(choice.length()>=2){
                System.out.println("Invalid entry - Please Select a letter.");
                continue; // and repeat again
                   
            }
            break; // out of the (exit) the repitition.
            
        }
      
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
            case 'S': // save game
                this.saveGame();
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

    
