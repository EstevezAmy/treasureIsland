/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureIsland.control;

/**
 *
 * @author Amy/Indira
 */
public class calculatePay {
    
    public static void main(){
        
        //Declare Variables
        double itemCost, pay, difference;
        
        //Placeholder values
        itemCost = 10.00;
        pay = 10.00;
        difference = itemCost - pay;
        
        if (difference == 0){
            System.out.println("Thank you! Is there anything else you want?");
        }
        else
            System.out.println("That ammount is not correct.");
    }
    
}
