/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureIsland.view;

/**
 *
 * @author Amy/Indira
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }

    public void startProgram(){

        //Display Banner
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println("*                                        *"
                    + "\n* Welcome to Treasure Island!!!             *"
                    + "\n* Follow your Grandfather's treasure map as *"
                    + "\n* you travel with his pet Parrot and        *"
                    + "\n* together enjoy an adventure!              *");
    }
    
}

