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
public class ShoppingJmsClient implements ShoppingCartService{
ShoppingCartService jmsObject;
public ShoppingJmsClient(){
    //jmsObject=
}
    @Override
    public void buyProduct() {
       jmsObject.buyProduct();
    }

    @Override
    public void addItem() {
       jmsObject.addItem();
    }

    @Override
    public void removeItem() {
      jmsObject.removeItem();
    }

    @Override
    public double calculatePayment() {
      return jmsObject.calculatePayment();
    }

    @Override
    public void saveCart() {
       jmsObject.saveCart();
    }

    @Override
    public void getCartContent() {
      jmsObject.getCartContent();
    }

    @Override
    public void createOrder() {
      jmsObject.createOrder();
    }
    
}