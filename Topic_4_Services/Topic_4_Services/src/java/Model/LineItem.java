/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Frederic
 */
public class LineItem {
    private int quantity;
    private double price;
    private ArrayList<Product> product;

    public LineItem(int quantity, double price, ArrayList<Product> product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public LineItem() {
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

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
    
}
