/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureIsland.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tikitaguilar
 */
public class characterInteractionTest {
    
    public characterInteractionTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multiplyTwoNumbers method, of class characterInteraction.
     */
    @Test
    public void testMultiplyTwoNumbers() {
        System.out.println("multiplyTwoNumbers");
        int x = 0;
        int y = 0;
        characterInteraction instance = new characterInteraction();
        int expResult = 0;
        int result = instance.multiplyTwoNumbers(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        int result = instance.substractTwoNumbers(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        int result = instance.divideTwoNumbers(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
