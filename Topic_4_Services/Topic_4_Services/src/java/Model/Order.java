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
public class Order {
    private Payment pay;
    private OrderState state;
    private String number;
    private Date order;
    private Date shipped;
    private ArrayList<LineItem> detailOrder;
    private double total;
    private Address ship_destiny;

    public Order(Payment pay, OrderState state, String number, Date order, Date shipped, ArrayList<LineItem> detailOrder, double total, Address ship_destiny) {
        this.pay = pay;
        this.state = state;
        this.number = number;
        this.order = order;
        this.shipped = shipped;
        this.detailOrder = detailOrder;
        this.total = total;
        this.ship_destiny = ship_destiny;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Address getShip_destiny() {
        return ship_destiny;
    }

    public void setShip_destiny(Address ship_destiny) {
        this.ship_destiny = ship_destiny;
    }
    

    

    public Order() {
    }

    public Payment getPay() {
        return pay;
    }

    public void setPay(Payment pay) {
        this.pay = pay;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrder() {
        return order;
    }

    public void setOrder(Date order) {
        this.order = order;
    }

    public Date getShipped() {
        return shipped;
    }

    public void setShipped(Date shipped) {
        this.shipped = shipped;
    }

    public ArrayList<LineItem> getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(ArrayList<LineItem> detailOrder) {
        this.detailOrder = detailOrder;
    }
    
    
    
    
}
