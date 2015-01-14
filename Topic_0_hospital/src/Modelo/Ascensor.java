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
public class Ascensor {
    private int nro;
    private Ubicacion ubicacion;

    public Ascensor(int nro, Ubicacion ubicacion) {
        this.nro = nro;
        this.ubicacion = ubicacion;
    }

    public Ascensor() {
    }

    public int getNro() {
        return nro;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Ascensor{" + "nro=" + nro + ", ubicacion=" + ubicacion + '}';
    }

  
    
}
