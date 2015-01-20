/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class ListTest {
    
    public ListTest() {
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
     * Test of getList method, of class List.
     */
    @Test
    public void testGetList() {
        System.out.println("Test getList");
        List instance = new List();
        ArrayList expResult = instance.getList();
        ArrayList result = instance.getList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addList method, of class List.
     */
    @Test
    public void testAddList() {
        System.out.println("addList");
        Object o = null;
        List instance = new List();
        instance.addList(o);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    

    /**
     * Test of toString method, of class List.
     */
    @Test
    public void testToString() {
        System.out.println("Test toString");
        List instance = new List();
        instance.addList("Hola3");
        instance.addList("Hola2");
        instance.addList("Hola3");
        instance.addList("Hola3");
        instance.addList("Hola4");
        instance.addList("Hola3");
        instance.addList("Hola7");
        
        String expResult = "Hola2Hola4Hola3Hola7";
        String result = instance.toString();
        assertEquals(expResult, result);
        
       
    }
    
}
