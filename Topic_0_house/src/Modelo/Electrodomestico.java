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
public class Electrodomestico {
    private Marca marca;
    private String nombre;
    private String descripcion;

    public Electrodomestico(Marca marca, String nombre, String descripcion) {
        this.marca = marca;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Electrodomestico() {
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Marca getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" + "marca=" + marca + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
            
            
}
