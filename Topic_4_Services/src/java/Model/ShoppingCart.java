/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Frederic
 */
public class ShoppingCart {
    private  ArrayList<Product> LineItem;
    private Date dateCreate;

    public ArrayList getLineItem() {
        return LineItem;
    }

    public void setLineItem(ArrayList LineItem) {
        this.LineItem = LineItem;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public ShoppingCart() {
    }

    public ShoppingCart(ArrayList LineItem, Date dateCreate) {
        this.LineItem = LineItem;
        this.dateCreate = dateCreate;
    }
    
    
    
}
