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
public class StrategyPayPal implements IStrategyPayment{
private String mail;
private String password;

    public StrategyPayPal(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public StrategyPayPal() {
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
   
    
    
    @Override
    public double calDescountFormaPayment(double [] monto) {
        double montoTotal=0;
    double mayor;
    mayor=monto[0];
        for(int i=0;i<monto.length;i++){
           if(mayor<monto[i]){
               mayor=monto[i];
           } 
            
            
        } 
        return montoTotal-(mayor*0.10);
        
    }

    
    }

   
    
    
    
    
    

