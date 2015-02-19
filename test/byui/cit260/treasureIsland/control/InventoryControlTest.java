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
        double height = 0.0;
        double diameter = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcVolumeOfBarrel(height, diameter);
        assertEquals(expResult, result, 0.0);
    }
    
}
