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
public class Person {
    private String name;
    private String lastName;
    private int dni;

    public Person(String name, String lastName, int dni) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
