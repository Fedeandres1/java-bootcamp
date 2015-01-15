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
public class SingletonNumeroPedido {
    private int ultimoNumero;
 private  static SingletonNumeroPedido numeroPedido;
  
    public void actualizarNro(){
        ultimoNumero = ultimoNumero+1;
    };
    public  SingletonNumeroPedido(){
        
        
    }
    public static SingletonNumeroPedido getInstancia(){
        if(numeroPedido==null){
        numeroPedido=new SingletonNumeroPedido();    
        }
     return numeroPedido;   
    }

    public int getNumero() {
        return ultimoNumero;
    }
    
    
}
