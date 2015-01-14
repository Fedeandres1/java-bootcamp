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
public class Direccion {
    private String calle;
    private int numero;
    private char letra;
    private int piso;

    public Direccion(String calle, int numero, char letra, int piso) {
        this.calle = calle;
        this.numero = numero;
        this.letra = letra;
        this.piso = piso;
    }

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public int getPiso() {
        return piso;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", letra=" + letra + ", piso=" + piso + '}';
    }
    
}
