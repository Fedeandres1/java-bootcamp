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
public class Ubicacion {
    private int piso;
    private String zona;

    public Ubicacion(int piso, String zona) {
        this.piso = piso;
        this.zona = zona;
    }

    public int getPiso() {
        return piso;
    }

    public String getZona() {
        return zona;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "piso=" + piso + ", zona=" + zona + '}';
    }
    
}
