/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Frederic
 */
public class Address {
    private String Street;
    private int number;
    private int piso;
    private char letraPiso;

    public Address(String Street, int number, int piso, char letraPiso) {
        this.Street = Street;
        this.number = number;
        this.piso = piso;
        this.letraPiso = letraPiso;
    }

    public Address() {
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public char getLetraPiso() {
        return letraPiso;
    }

    public void setLetraPiso(char letraPiso) {
        this.letraPiso = letraPiso;
    }
            
            
            
}
