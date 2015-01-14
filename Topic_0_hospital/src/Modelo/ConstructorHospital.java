/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Frederic
 */
public class ConstructorHospital implements IConstructorHospital {
private Hospital hospi;
    public ConstructorHospital() {
        
    }

   
@Override
    public void construirHospital(String name,
     Direccion dire,
    int pisos,
     int [] telefono,
     Date fechaInicioActividad,
     int cdoPostal,
     Cuarto [] consultorios,
     Recepcion [] recepciones,
     Ascensor[] ascensor) {
        
      
     hospi = new Hospital(
             name,
             dire,
             pisos,
             telefono,
             fechaInicioActividad,
             cdoPostal,
             consultorios,
             recepciones,
             ascensor);  
        
    }
}
