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
public class characterInteractionTest {
    
    public characterInteractionTest() {
    }

    /**
     * Test of main method, of class characterInteraction.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        characterInteraction.main();
    }

    /**
     * Test of substractTwoNumbers method, of class characterInteraction.
     */
    @Test
    public void testSubstractTwoNumbers() {
        System.out.println("substractTwoNumbers");
        int x = 0;
        int y = 0;
        characterInteraction instance = new characterInteraction();
        int expResult = 0;
        int result;
        result = x-y;
        assertEquals(expResult, result);
 
    }

    /**
     * Test of divideTwoNumbers method, of class characterInteraction.
     */
    @Test
    public void testDivideTwoNumbers() {
        System.out.println("divideTwoNumbers");
        int x = 0;
        int y = 0;
        characterInteraction instance = new characterInteraction();
        int expResult = 0;
        int result = x/y;
        assertEquals(expResult, result);
    }

    /**
     * Test of addTwoNumbers method, of class characterInteraction.
     */
    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        int x = 0;
        int y = 0;
        characterInteraction instance = new characterInteraction();
        int expResult = 0;
        int result = instance.addTwoNumbers(x, y);
        assertEquals(expResult, result);
    }
    
}
