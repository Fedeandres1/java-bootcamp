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
public class Marca {
    private String nombre;

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public Marca() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + '}';
    }
    
}
