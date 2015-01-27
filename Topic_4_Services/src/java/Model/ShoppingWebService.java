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
    public void buyProduct() {
        imp.buyProduct();
    }

    @Override
    public void addItem() {
      imp.addItem();
    }

    @Override
    public void removeItem() {
       imp.removeItem();
    }

    @Override
    public double calculatePayment() {
      return imp.calculatePayment();
    }

    @Override
    public void saveCart() {
       imp.saveCart();
    }

    @Override
    public void getCartContent() {
    imp.getCartContent();
    }

    @Override
    public void createOrder() {
    imp.createOrder();
    }
    
}
