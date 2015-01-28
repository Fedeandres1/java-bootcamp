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

    public ShoppingCart  createShoppingCart(WebUser u) {
        return webService.createShoppingCart(u);
    }

    public ShoppingWebServiceClient() {
        //webService=;

    }

    @Override
    public void buyProduct(WebUser user) {
        webService.buyProduct(user);
        
    }

    @Override
    public ShoppingCart addLineItem(ShoppingCart cart,LineItem line,Product p,int quantity,double price) {
     return   webService.addLineItem(cart,line,p,quantity,price);
    }

    @Override
    public ShoppingCart  removeLineItem(ShoppingCart cart,LineItem line) {
      return  webService.removeLineItem(cart,line);
    }

    @Override
    public double calculatePayment(ShoppingCart cart) {
        return webService.calculatePayment(cart);
    }

    @Override
    public void saveCart(ShoppingCart cart) {
        webService.saveCart(cart);
    }

    @Override
    public String getCartContent(ShoppingCart cart) {
      return  webService.getCartContent(cart);
    }

   

}
