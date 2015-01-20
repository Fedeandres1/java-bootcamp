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
public class IConvertStrategyTest {
    
    public IConvertStrategyTest() {
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
     * Test of convert method, of class IConvertStrategy.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        String a = "";
        IConvertStrategy instance = new IConvertStrategyImpl();
        String expResult = "";
        String result = instance.convert(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    public class IConvertStrategyImpl implements IConvertStrategy {

        public String convert(String a) {
            return "";
        }
    }
    
}
