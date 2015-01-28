/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 * the detail of the shopping cart
 *
 * @author Frederic
 */
public class LineItem {

    private int quantity;
    private double price;
    private double priceUnity;
    private Product product;

    public LineItem(int quantity, double price, double priceUnity, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.priceUnity = priceUnity;
        this.product = product;
    }

    public double getPriceUnity() {
        return priceUnity;
    }

    public void setPriceUnity(double priceUnity) {
        this.priceUnity = priceUnity;
    }

    public LineItem() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
