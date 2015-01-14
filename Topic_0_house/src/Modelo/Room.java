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
public class Room {
    
    
    private String nombre;
    private Puerta puerta;
    private Ventana ventana;
    private String descripcion;
    private Furniture furniture;
    private Electrodomestico elec;

    public Room(String nombre, Puerta puerta, Ventana ventana, String descripcion, Furniture furniture, Electrodomestico elec) {
        this.nombre = nombre;
        this.puerta = puerta;
        this.ventana = ventana;
        this.descripcion = descripcion;
        this.furniture = furniture;
        this.elec = elec;
    }

    public Room() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFurniture(Furniture furniture) {
        this.furniture = furniture;
    }

    public void setElec(Electrodomestico elec) {
        this.elec = elec;
    }

    public String getNombre() {
        return nombre;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Electrodomestico getElec() {
        return elec;
    }

    @Override
    public String toString() {
        return "Room{" + "nombre=" + nombre + ", puerta=" + puerta + ", ventana=" + ventana + ", descripcion=" + descripcion + ", furniture=" + furniture + ", elec=" + elec + '}';
    }
    
    
    
    
    
    
    
    
}
