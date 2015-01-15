/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Frederic
 */
public class Manager  extends Person implements IObserver{
private int legajo;
private Log registro;

    public Manager(int legajo, String name, String lastName, int dni) {
        super(name, lastName, dni);
        this.legajo = legajo;
    }
    
    
    

    public Manager() {
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    

    @Override
    public void update() {
       sendMail();
    }

   private void sendMail(){
       //This method notify the adm. when a change make in the log
      
            JOptionPane.showMessageDialog(null, "Se ha modificado el registro");
       
   }

   
    
    
    
    
    
    
    
    
    
    
    
}
