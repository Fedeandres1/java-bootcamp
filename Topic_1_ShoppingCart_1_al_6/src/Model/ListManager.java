/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Frederic
 */
public class ListManager {
    //this class contains the object how are change, the add of item/Offer, a orice change or a new transction made.
    // its save the object in cambio and the date of the changed.
    private Object cambio;
    private Date fecha;
    private Calendar fe = Calendar.getInstance();

    public Object getCambio() {
        return cambio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setCambio(Object cambio) {
        this.cambio = cambio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ListManager(Object cambio) {
        this.cambio = cambio;
        fecha=fe.getTime();
    }

    

    


}
