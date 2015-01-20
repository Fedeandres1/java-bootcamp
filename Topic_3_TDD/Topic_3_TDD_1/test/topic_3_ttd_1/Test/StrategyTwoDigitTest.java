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
public class StrategyTwoDigitTest {
    
    public StrategyTwoDigitTest() {
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
     * Test of convert method, of class StrategyTwoDigit.
     */
    @Test
    public void testConvert() {
        System.out.println("Testing convert method");
        String a = "25";
        StrategyTwoDigit instance = new StrategyTwoDigit();
        String expResult = "twenty five";
        String result = instance.convert(a);
        assertEquals(expResult, result);
       
      
    }
    
}
