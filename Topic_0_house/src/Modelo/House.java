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
public class House implements AbstractHouse {
    private String nombre;
    private double mCuadrados;
    private Room room;
    private Garden garden;
    private Address direccion;

    public House() {
    }

    public House(String nombre, double mCuadrados, Room room, Garden garden, Address direccion) {
        this.nombre = nombre;
        this.mCuadrados = mCuadrados;
        this.room = room;
        this.garden = garden;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public Room getRoom() {
        return room;
    }

    public Garden getGarden() {
        return garden;
    }

    public Address getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setmCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    public void setDireccion(Address direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "House{" + "nombre=" + nombre + ", mCuadrados=" + mCuadrados + ", room=" + room + ", garden=" + garden + ", direccion=" + direccion + '}';
    }

    @Override
    public void crearCasa() {
        
    }
    
}
