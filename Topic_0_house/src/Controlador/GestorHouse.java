/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
/**
 *
 * @author Frederic
 */
public class GestorHouse {
   // El gestor es el que llamaria a un metodo de la casa para que sea creado y 
    //tendria todos los atributos para bajar el acoplamiento.
    //Los atributos vendrian de una pantalla donde los ingresaria el usuario por ejemplo.
private AbstractFactoryHouse factoriaCasa;
private AbstractHouse casaAbstracta;
    
    

public void crearHouse(){
factoriaCasa = new ConcretFactory();
factoriaCasa.crearHouse();


    
    


}
public static void main(String[] args) {
    // para probar 

       

    }
   
    
}
