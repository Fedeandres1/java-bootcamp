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
public class Garden {
    private double mCuadrados;

    public Garden() {
    }

    public Garden(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    @Override
    public String toString() {
        return "Garden{" + "mCuadrados=" + mCuadrados + '}';
    }
    
}
