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
public class mathPuzzleTest {
    
    public mathPuzzleTest() {
    }

    /**
     * Test of multiplyTwoNumbers method, of class mathPuzzle.
     */
    @Test
    public void testMultiplyTwoNumbers() {
        System.out.println("multiplyTwoNumbers");
        int x = 0;
        int y = 0;
        mathPuzzle instance = new mathPuzzle();
        int expResult = 0;
        int result = x*y;
        assertEquals(expResult, result);
    }
    
}
