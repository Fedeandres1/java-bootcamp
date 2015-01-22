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
    
    
    public void buyProduct();
    public void addItem();
    public void removeItem();
    public double calculatePayment();
    public void saveCart();
    public void getCartContent();
    public void createOrder();
    
    
}
