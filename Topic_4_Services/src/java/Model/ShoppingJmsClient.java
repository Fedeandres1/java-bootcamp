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
public class ShoppingJmsClient implements ShoppingCartService {

    ShoppingCartService jmsObject;

    public ShoppingJmsClient() {
        //jmsObject=
    }

    public ShoppingCart createShoppingCart(WebUser u) {
     return   jmsObject.createShoppingCart(u);
    }

    @Override
    public void buyProduct(WebUser user) {
        jmsObject.buyProduct(user);
    }

    @Override
    public ShoppingCart addLineItem(ShoppingCart cart,LineItem line,Product p,int quantity,double price) {
      return  jmsObject.addLineItem(cart,line,p,quantity,price);
    }

    @Override
    public ShoppingCart removeLineItem(ShoppingCart cart,LineItem line) {
      return  jmsObject.removeLineItem(cart,line);
    }

    @Override
    public double calculatePayment(ShoppingCart cart) {
        return jmsObject.calculatePayment(cart);
    }

    @Override
    public void saveCart(ShoppingCart cart) {
        jmsObject.saveCart(cart);
    }

    @Override
    public String getCartContent(ShoppingCart cart) {
       return  jmsObject.getCartContent(cart);
    }

    

}
