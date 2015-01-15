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
public class StrategyCreditCard  implements IStrategyPayment{
 private String nameUser;
 private int nunberCard;

    public String getNameUser() {
        return nameUser;
    }

    public int getNunberCard() {
        return nunberCard;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setNunberCard(int nunberCard) {
        this.nunberCard = nunberCard;
    }

    public StrategyCreditCard() {
    }

    public StrategyCreditCard(String nameUser, int nunberCard) {
        this.nameUser = nameUser;
        this.nunberCard = nunberCard;
    }
 
   

    @Override
    public double calDescountFormaPayment(double [] monto) {
        double montoTotal=0;
        for(int i=0;i<monto.length;i++){
            
         montoTotal=montoTotal+monto[i];   
            
        } 
        
        
       return (montoTotal*0.90);
    }
    
}
