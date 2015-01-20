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
public class IntToRomanTest {
    
    public IntToRomanTest() {
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
     * Test of convertIntToRoman method, of class IntToRoman.
     */
    @Test
    public void testConvertIntToRoman() {
        System.out.println("convertIntToRoman");
        String number = "1256";
        IntToRoman instance = new IntToRoman();
        String expResult = "MCCLVI";
        String result = instance.convertIntToRoman(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of oneDigit method, of class IntToRoman.
     */
    @Test
    public void testOneDigit() {
        System.out.println("oneDigit");
        String cadena = "9";
        IntToRoman instance = new IntToRoman();
        String expResult = "IX";
        String result = instance.oneDigit(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of twoDigit method, of class IntToRoman.
     */
    @Test
    public void testTwoDigit() {
        System.out.println("twoDigit");
        String cadena = "9";
        IntToRoman instance = new IntToRoman();
        String expResult = "XC";
        String result = instance.twoDigit(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of threeDigit method, of class IntToRoman.
     */
    @Test
    public void testThreeDigit() {
        System.out.println("threeDigit");
        String cadena = "4";
        IntToRoman instance = new IntToRoman();
        String expResult = "CD";
        String result = instance.threeDigit(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of fourDigit method, of class IntToRoman.
     */
    @Test
    public void testFourDigit() {
        System.out.println("fourDigit");
        String cadena = "2";
        IntToRoman instance = new IntToRoman();
        String expResult = "MM";
        String result = instance.fourDigit(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
