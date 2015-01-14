/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Frederic
 */
public class ConcretFactory implements AbstractFactoryHouse{
private House casa;
    @Override
    public void crearHouse() {
    casa = new House("Pedrito", 21.2, new Room(), new Garden(),new Address());
    
        
        
        
    }
    
}
