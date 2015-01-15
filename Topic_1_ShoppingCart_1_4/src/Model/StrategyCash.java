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
public class StrategyCash implements IStrategyPayment{

   

    @Override
    public double calDescountFormaPayment(double [] monto) {
    double montoTotal=0;
    double menor;
    menor=monto[0];
        for(int i=0;i<monto.length;i++){
           if(menor>monto[i]){
               menor=monto[i];
           } 
            
            
        } 
        return montoTotal-menor;
    }
    
}
