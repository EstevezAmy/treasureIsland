/*
 * Treasure Island - View Layer - Get Help
 */
package byui.cit260.treasureIsland.view;

import java.util.Scanner;

/**
 *
 * @author Amy/Indira
 */
public class GetHelp {
    
    //Help Welcome
    private final String HELP = "\n"
        + "\n---------------------"
        + "\n|     Help     |"
        + "\n---------------------"
        + "\nN - Read a letter"
        + "\nG - Give a hint"
        + "\nE - Exit"
        + "\n---------------------";
    public GetHelp(){
            
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
    public void getHelp(){
        
        //Display Placeholder
        this.displayHelp();
    }

    public void displayHelp() {
        
        //Display Help placeholder
        System.out.println(HELP); //Display the main menu
    }
}
