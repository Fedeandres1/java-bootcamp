/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Frederic
 */
public class Payment {
    private String id,detail;
    private Date paid;
    private double total;

    public Payment(String id, String detail, Date paid, double total) {
        this.id = id;
        this.detail = detail;
        this.paid = paid;
        this.total = total;
    }

    public Payment() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getPaid() {
        return paid;
    }

    public void setPaid(Date paid) {
        this.paid = paid;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
