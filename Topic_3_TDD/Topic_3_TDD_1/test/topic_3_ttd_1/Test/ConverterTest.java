/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_ttd_1.Test;

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
public class ConverterTest {
    
    public ConverterTest() {
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
     * Test of convertAmountToString method, of class Converter.
     */
    @Test
    public void testConvertAmountToString() {
        System.out.println("Testing convertAmountToString method");
        double cant = 125.89;
        String expResult = "one hundred twenty five and 89/100 dollars";
        String result = Converter.convertAmountToString(cant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of main method, of class Converter.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Converter.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of convert method, of class Converter.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        String make = "";
        String expResult = "";
        String result = Converter.convert(make);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
