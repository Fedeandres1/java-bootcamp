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
public class DirectorConstruccionHospital {
    IConstructorHospital hospital;
    public void  construir(String name,
     Direccion dire,
    int pisos,
     int [] telefono,
     Date fechaInicioActividad,
     int cdoPostal,
     Cuarto [] consultorios,
     Recepcion [] recepciones,
     Ascensor[] ascensor){
       
        
        
        
    }

    public DirectorConstruccionHospital(IConstructorHospital hospital) {
       
        this.hospital = hospital;
    }
    
}
