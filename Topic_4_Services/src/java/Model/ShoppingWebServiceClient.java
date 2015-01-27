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
public class ShoppingWebServiceClient implements ShoppingCartService {
ShoppingCartService webService;


public ShoppingWebServiceClient(){
    //webService=;
    
    
}
    @Override
    public void buyProduct() {
      webService.buyProduct();
    }

    @Override
    public void addItem() {
     webService.addItem();
    }

    @Override
    public void removeItem() {
      webService.removeItem();
    }

    @Override
    public double calculatePayment() {
       return webService.calculatePayment();
    }

    @Override
    public void saveCart() {
      webService.saveCart();
    }

    @Override
    public void getCartContent() {
 webService.getCartContent();
    }

    @Override
    public void createOrder() {
       webService.createOrder();
    }

}
