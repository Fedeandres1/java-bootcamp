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
public class Address {

    private String calle;
    private int numero;
    private Provincia provincia;
    private int piso;
    private char nro;

    public Address(String calle, int numero, Provincia provincia, int piso, char nro) {
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
        this.piso = piso;
        this.nro = nro;
    }

    public Address() {
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public int getPiso() {
        return piso;
    }

    public char getNro() {
        return nro;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setNro(char nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Address{" + "calle=" + calle + ", numero=" + numero + ", provincia=" + provincia + ", piso=" + piso + ", nro=" + nro + '}';
    }

}
