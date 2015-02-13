/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureIsland.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amy
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcVolumeOfBarrel method, of class InventoryControl.
     */
    @Test
    public void testCalcVolumeOfBarrel() {
        
        System.out.println("calcVolumeOfBarrel");
        
        /**************************
         * Test case #1
         **************************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double height = 24.0;
        double diameter = 12.0;
        
        double expResult = 1.5708; // expected output returned value
        
        //create instance of InventoryControl Control() class
        InventoryControl instance = new InventoryControl();
        
        // call function to run test
        double result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
     
    
        /**************************
        * Test case #2
        **************************/
        System.out.println("\tTest case #2");
        
        //input values for test case 2
        height = -1.0;
        diameter = 12.0;
        
        expResult = -1; // expected output returned value
        
        // call function to run test
        result = instance.calcVolumeOfBarrel(height, diameter);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    }
    
}
