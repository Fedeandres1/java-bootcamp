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
public interface IConstructorHospital {
   
    //se podrian hacer varios metodos para construir.
    public void construirHospital(String name,
     Direccion dire,
    int pisos,
     int [] telefono,
     Date fechaInicioActividad,
     int cdoPostal,
     Cuarto [] consultorios,
     Recepcion [] recepciones,
     Ascensor[] ascensor);
    
   
}
