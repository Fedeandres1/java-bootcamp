/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Frederic
 */
public class ShoppingCart {

    private ArrayList<LineItem> lineItem = null;
    private Date dateCreate = null;

    public ArrayList getLineItem() {
        if (lineItem == null) {
            lineItem = new ArrayList();

        }
        return lineItem;
    }

    public void setLineItem(ArrayList lineItem) {
        this.lineItem = lineItem;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public ShoppingCart() {
        if (lineItem == null) {
            lineItem = new ArrayList();

        }
        Calendar cal = Calendar.getInstance();
        dateCreate = cal.getTime();
    }

    public ShoppingCart(ArrayList LineItem, Date dateCreate) {
        this.lineItem = LineItem;
        this.dateCreate = dateCreate;

    }

    public void addLineItem(LineItem i) {
        lineItem.add(i);

    }

    public void removeLineItem(LineItem i) {
        lineItem.remove(i);
    }
}
