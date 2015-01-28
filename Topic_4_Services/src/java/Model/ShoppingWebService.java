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
public class ShoppingWebService  implements ShoppingCartService{
ShoppingCartService imp=new ShoppingCartImplement();




@Override
public ShoppingCart createShoppingCart(WebUser u) {
       return imp.createShoppingCart(u);
    }


    @Override
    public void buyProduct(WebUser user) {
        imp.buyProduct(user);
    }

    @Override
    public ShoppingCart  addLineItem(ShoppingCart cart,LineItem line,Product p,int quantity,double price) {
     return imp.addLineItem(cart,line,p,quantity,price);
    }

    @Override
    public ShoppingCart removeLineItem(ShoppingCart cart,LineItem line) {
      return imp.removeLineItem(cart,line);
    }

    @Override
    public double calculatePayment(ShoppingCart cart) {
      return imp.calculatePayment(cart);
    }

    @Override
    public void saveCart(ShoppingCart cart) {
       imp.saveCart(cart);
    }

    @Override
    public String getCartContent(ShoppingCart cart) {
    return imp.getCartContent(cart);
    }

    
    
}
