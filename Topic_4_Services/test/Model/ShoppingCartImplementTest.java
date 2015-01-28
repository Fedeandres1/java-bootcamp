/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class ShoppingCartImplementTest {
    
    public ShoppingCartImplementTest() {
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
     * Test of buyProduct method, of class ShoppingCartImplement.
     */
    @Test
    public void testBuyProduct() {
        System.out.println("buyProduct");
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.buyProduct();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addItem method, of class ShoppingCartImplement.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.addItem();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of removeItem method, of class ShoppingCartImplement.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.removeItem();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of calculatePayment method, of class ShoppingCartImplement.
     */
    @Test
    public void testCalculatePayment() {
        System.out.println("calculatePayment");
        ShoppingCartImplement instance = new ShoppingCartImplement();
        double expResult = 0.0;
        double result = instance.calculatePayment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of saveCart method, of class ShoppingCartImplement.
     */
    @Test
    public void testSaveCart() {
        System.out.println("saveCart");
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.saveCart();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCartContent method, of class ShoppingCartImplement.
     */
    @Test
    public void testGetCartContent() {
        System.out.println("getCartContent");
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.getCartContent();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of createOrder method, of class ShoppingCartImplement.
     */
    @Test
    public void testCreateOrder() {
        System.out.println("createOrder");
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.createOrder();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
