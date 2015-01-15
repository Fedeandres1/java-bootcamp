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
public interface ISujeto {
 //The interface who manager all subject 
   
     

    public void suscribe(IObserver o);

    public void removeSuscribe(IObserver o);

    public void notificar();
}
