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
public class Cuarto {
    private int nro;
    private Ubicacion ubicacion;
    private Equipamiento [] equipamiento;
    private double mCuadrados;
    private Estado estado;

    public Cuarto(int nro, Ubicacion ubicacion, Equipamiento[] equipamiento, double mCuadrados, Estado estado) {
        this.nro = nro;
        this.ubicacion = ubicacion;
        this.equipamiento = equipamiento;
        this.mCuadrados = mCuadrados;
        this.estado = estado;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setmCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    

    public Cuarto() {
    }

    public int getNro() {
        return nro;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Equipamiento[] getEquipamiento() {
        return equipamiento;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEquipamiento(Equipamiento[] equipamiento) {
        this.equipamiento = equipamiento;
    }

    @Override
    public String toString() {
        return "Cuarto{" + "nro=" + nro + ", ubicacion=" + ubicacion + ", equipamiento=" + equipamiento + ", mCuadrados=" + mCuadrados + ", estado=" + estado + '}';
    }

    
    
}
