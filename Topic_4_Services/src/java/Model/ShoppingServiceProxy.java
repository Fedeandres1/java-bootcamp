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
public class ShoppingServiceProxy implements ShoppingCartService {

    ShoppingCartService implement;

    @Override
    public ShoppingCart createShoppingCart(WebUser u) {
        return implement.createShoppingCart(u);
    }
    protected ShoppingServiceProxy(ShoppingCartService implement) {
        this.implement = implement;
    }

    public ShoppingCartService getImplement() {
        return implement;
    }

    public void setImplement(ShoppingCartService implement) {
        this.implement = implement;
    }

    @Override
    public void buyProduct(WebUser user) {
        implement.buyProduct(user);
    }

    @Override
    public ShoppingCart  addLineItem(ShoppingCart cart,LineItem line,Product p,int quantity,double price) {
       return implement.addLineItem(cart,line,p,quantity,price);
    }

    @Override
    public ShoppingCart removeLineItem(ShoppingCart cart,LineItem line) {
    return    implement.removeLineItem(cart,line);
    }

    @Override
    public double calculatePayment(ShoppingCart cart) {
        return implement.calculatePayment(cart);
    }

    @Override
    public void saveCart(ShoppingCart cart) {
        implement.saveCart(cart);
    }

    @Override
    public String getCartContent(ShoppingCart cart) {
     return   implement.getCartContent(cart);
    }

    

}
