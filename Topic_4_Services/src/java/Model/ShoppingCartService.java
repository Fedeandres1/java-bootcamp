/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Frederic
 */
public interface ShoppingCartService {

    public ShoppingCart createShoppingCart(WebUser u);

    public void buyProduct(WebUser user);

    public ShoppingCart addLineItem(ShoppingCart cart, LineItem line, Product p, int quantity, double price);

    public ShoppingCart removeLineItem(ShoppingCart cart, LineItem line);

    public double calculatePayment(ShoppingCart cart);

    public void saveCart(ShoppingCart cart);

    public String getCartContent(ShoppingCart cart);

}
