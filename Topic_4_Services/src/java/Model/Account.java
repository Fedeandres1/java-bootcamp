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
public class  Account {
  private  String id;
   private Address billing_address;
  private Date open,closed;
  private ShoppingCart cart;
  private ArrayList<Payment> pay;
  ArrayList<Order> order;

    public Account(String id, Address billing_address, Date open, Date closed, ShoppingCart cart, ArrayList<Payment> pay, ArrayList<Order> order) {
        this.id = id;
        this.billing_address = billing_address;
        this.open = open;
        this.closed = closed;
        this.cart = cart;
        this.pay = pay;
        this.order = order;
    }

    public ArrayList<Payment> getPay() {
        return pay;
    }

    public void setPay(ArrayList<Payment> pay) {
        this.pay = pay;
    }

   

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(Address billing_address) {
        this.billing_address = billing_address;
    }

    public Date getOpen() {
        return open;
    }

    public void setOpen(Date open) {
        this.open = open;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

   

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }
  
    

   
    
}
