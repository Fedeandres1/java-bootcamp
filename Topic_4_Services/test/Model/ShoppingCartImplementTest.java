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
     * Test of createShoppingCart method, of class ShoppingCartImplement.
     */
    @Test
    public void testCreateShoppingCart() {
        System.out.println("createShoppingCart");
        WebUser u = new WebUser();
        ShoppingCartImplement instance = new ShoppingCartImplement();

        ShoppingCart result = instance.createShoppingCart(u);
        ShoppingCart expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of buyProduct method, of class ShoppingCartImplement.
     */
    @Test
    public void testBuyProduct() {
        System.out.println("buyProduct");
        WebUser user = new WebUser();
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.buyProduct(user);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of addLineItem method, of class ShoppingCartImplement.
     */
    @Test
    public void testAddLineItem() {
        System.out.println("addLineItem");
        ShoppingCart cart = new ShoppingCart();
        LineItem line = new LineItem();
        Product p = new Product();
        int quantity = 1;
        double price = 5.0;
        ShoppingCartImplement instance = new ShoppingCartImplement();

        ShoppingCart result = instance.addLineItem(cart, line, p, quantity, price);
        ShoppingCart expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of removeLineItem method, of class ShoppingCartImplement.
     */
    @Test
    public void testRemoveLineItem() {
        System.out.println("removeLineItem");
        ShoppingCart cart = new ShoppingCart();
        LineItem line = new LineItem();
        ShoppingCartImplement instance = new ShoppingCartImplement();

        ShoppingCart result = instance.removeLineItem(cart, line);
        ShoppingCart expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of calculatePayment method, of class ShoppingCartImplement.
     */
    @Test
    public void testCalculatePayment() {
        System.out.println("calculatePayment");
        ShoppingCart cart = new ShoppingCart();
        ShoppingCartImplement instance = new ShoppingCartImplement();
        LineItem item = new LineItem(5, 100, 20, new Product());
        double expResult = 100.0;
        double result = instance.calculatePayment(cart);
        assertEquals(expResult, result, 100.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of saveCart method, of class ShoppingCartImplement.
     */
    @Test
    public void testSaveCart() {
        System.out.println("saveCart");
        ShoppingCart cart = null;
        ShoppingCartImplement instance = new ShoppingCartImplement();
        instance.saveCart(cart);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getCartContent method, of class ShoppingCartImplement.
     */
    @Test
    public void testGetCartContent() {
        System.out.println("getCartContent");
        ShoppingCart cart = new ShoppingCart();
        ShoppingCartImplement instance = new ShoppingCartImplement();
        String expResult = "Your Shopping cart    " + "    Date:" + cart.getDateCreate().toString() + "\n";
         expResult+= "Detail:\n";
         expResult += "TOTAL:" + instance.calculatePayment(cart);
        String result = instance.getCartContent(cart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
