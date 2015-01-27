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
    public void buyProduct() {
        implement.buyProduct();
    }

    @Override
    public void addItem() {
        implement.addItem();
    }

    @Override
    public void removeItem() {
        implement.removeItem();
    }

    @Override
    public double calculatePayment() {
        return implement.calculatePayment();
    }

    @Override
    public void saveCart() {
        implement.saveCart();
    }

    @Override
    public void getCartContent() {
        implement.getCartContent();
    }

    @Override
    public void createOrder() {
        implement.createOrder();
    }

}
