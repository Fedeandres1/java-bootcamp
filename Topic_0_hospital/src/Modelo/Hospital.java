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
public class Hospital {
    private String name;
    private Direccion dire;
    private int pisos;
    private int [] telefono;
    private Date fechaInicioActividad;
    private int cdoPostal;
    private Cuarto [] consultorios;
    private Recepcion [] recepciones;
    private Ascensor[] ascensor;

    public Hospital() {
    }

    public Hospital(String name, Direccion dire, int pisos, int[] telefono, Date fechaInicioActividad, int cdoPostal, Cuarto[] consultorios, Recepcion[] recepciones, Ascensor[] ascensor) {
        this.name = name;
        this.dire = dire;
        this.pisos = pisos;
        this.telefono = telefono;
        this.fechaInicioActividad = fechaInicioActividad;
        this.cdoPostal = cdoPostal;
        this.consultorios = consultorios;
        this.recepciones = recepciones;
        this.ascensor = ascensor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDire(Direccion dire) {
        this.dire = dire;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setTelefono(int[] telefono) {
        this.telefono = telefono;
    }

    public void setFechaInicioActividad(Date fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public void setCdoPostal(int cdoPostal) {
        this.cdoPostal = cdoPostal;
    }

    public void setConsultorios(Cuarto[] consultorios) {
        this.consultorios = consultorios;
    }

    public void setRecepciones(Recepcion[] recepciones) {
        this.recepciones = recepciones;
    }

    public void setAscensor(Ascensor[] ascensor) {
        this.ascensor = ascensor;
    }

    public String getName() {
        return name;
    }

    public Direccion getDire() {
        return dire;
    }

    public int getPisos() {
        return pisos;
    }

    public int[] getTelefono() {
        return telefono;
    }

    public Date getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    public int getCdoPostal() {
        return cdoPostal;
    }

    public Cuarto[] getConsultorios() {
        return consultorios;
    }

    public Recepcion[] getRecepciones() {
        return recepciones;
    }

    public Ascensor[] getAscensor() {
        return ascensor;
    }

    @Override
    public String toString() {
        return "Hospital{" + "name=" + name + ", dire=" + dire + ", pisos=" + pisos + ", telefono=" + telefono + ", fechaInicioActividad=" + fechaInicioActividad + ", cdoPostal=" + cdoPostal + ", consultorios=" + consultorios + ", recepciones=" + recepciones + ", ascensor=" + ascensor + '}';
    }
    
    
    
}
