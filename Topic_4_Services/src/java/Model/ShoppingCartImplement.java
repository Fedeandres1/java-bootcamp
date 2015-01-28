/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ShoppingCartService;

/**
 * This class implement all method to make the shopping cart usefull
 *
 * @author Frederic
 */
public class ShoppingCartImplement implements ShoppingCartService {

    WebUser user = null;

    protected ShoppingCartImplement() {

    }

    /**
     * Creating the shopping cart for the Web User and the list order
     *
     * @param u
     */
    @Override
    public ShoppingCart createShoppingCart(WebUser u) {
        user = u;
        user.setCart(new ShoppingCart());
        return user.getCart();
    }

    ;

    /**
     * I need the web user and extract all data from then
     *Finish the operation , buy all product in the cart and calculate de payment
     */
    @Override
    public void buyProduct(WebUser user) {
        WebUser u = user;
        ShoppingCart cart = user.getCart();
        Customer customer = new Customer();
        Account aco = new Account();
        Order order = new Order();
        order.setDetailOrder(cart.getLineItem());
        aco.setCart(cart);
        aco.addOrder(order);
        customer.setAccount(aco);
        user.setCustomer(customer);

    }

    /**
     * Add a new item on the Shopping cart
     *
     * @param cart
     * @param line the line product
     * @param p the product line
     * @param quantity
     * @param price unity
     * @return
     */
    @Override
    public ShoppingCart addLineItem(ShoppingCart cart, LineItem line, Product p, int quantity, double price) {
        line.setProduct(p);
        line.setPriceUnity(price);
        line.setQuantity(quantity);
        cart.addLineItem(line);
        return cart;
    }

    @Override
    public ShoppingCart removeLineItem(ShoppingCart cart, LineItem line) {
        cart.removeLineItem(line);
        return cart;
    }

    @Override
    public double calculatePayment(ShoppingCart cart) {
        double result = 0;
        ShoppingCart shop = cart;
        LineItem item = null;
        for (int i = 0; i < cart.getLineItem().size(); i++) {
            item = (LineItem) shop.getLineItem().get(i);
            result += item.getQuantity() * item.getQuantity();
        }

        return result;
    }

    /**
     * This method save the cart in the database for use other time in the
     * future
     *
     * @param cart
     */
    @Override
    public void saveCart(ShoppingCart cart) {

    }

    @Override
    public String getCartContent(ShoppingCart cart) {
        ShoppingCart c = cart;
        LineItem item = null;
        String result = "";
        result += "Your Shopping cart    " + "    Date:" + c.getDateCreate().toString() + "\n";
        result += "Detail:\n";
        for (int i = 0; i < c.getLineItem().size(); i++) {
            item = (LineItem) c.getLineItem().get(i);
            result += "Product:" + item.getProduct().getNombre()
                    + " PriceU:" + item.getPrice() + " Quantity:" + item.getQuantity()
                    + "Price:" + item.getPrice() * item.getQuantity() + "\n";

        }
        result += "TOTAL:" + calculatePayment(c);
        return result;
    }

}
