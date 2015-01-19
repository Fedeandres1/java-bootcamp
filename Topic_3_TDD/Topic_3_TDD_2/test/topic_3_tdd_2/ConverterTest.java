/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_tdd_2;

import java.util.ArrayList;
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of convert method, of class Converter.
     */
    @Test
    public void testConvert() {
        System.out.println("Test convert method");
        String cadena = "HolaGlobant";
        int row = 2;
        Converter instance = new Converter();
        ArrayList<String> res=new ArrayList(); 
        res.add("'"+"Ho"+"' ");
        res.add("'"+"la"+"' ");
        res.add("'"+"Gl"+"' ");
        res.add("'"+"ob"+"' ");
        res.add("'"+"an"+"' ");
        res.add("'"+"t"+"' ");
        ArrayList expResult = res;
        ArrayList result = instance.convert(cadena, row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of toString method, of class Converter.
     */
    @Test
    public void testToString() {
        System.out.println("Test Method toString");
        Converter instance = new Converter();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
