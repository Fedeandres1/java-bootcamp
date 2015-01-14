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
public class Furniture {
    private String nombre;
    private Marca marca;
    private String descripcion;

    public Furniture(String nombre, Marca marca, String descripcion) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public Furniture() {
    }

    public String getNombre() {
        return nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Furniture{" + "nombre=" + nombre + ", marca=" + marca + ", descripcion=" + descripcion + '}';
    }

    
    
}
