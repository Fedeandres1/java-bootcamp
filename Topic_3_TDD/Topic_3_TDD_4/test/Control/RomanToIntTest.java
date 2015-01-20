/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frederic
 */
public class RomanToIntTest {
    
    public RomanToIntTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertRomanToInt method, of class RomanToInt.
     */
    @Test
    public void testConvertRomanToInt() {
        System.out.println("Test convertRomanToInt");
        String number = "CCCXXXIII";
        RomanToInt instance = new RomanToInt();
        int expResult = 333;
        int result = instance.convertRomanToInt(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getInt method, of class RomanToInt.
     */
    @Test
    public void testGetInt() {
        System.out.println("Test getInt");
        char romanChar = 'X';
        int expResult = 10;
        int result = RomanToInt.getInt(romanChar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
