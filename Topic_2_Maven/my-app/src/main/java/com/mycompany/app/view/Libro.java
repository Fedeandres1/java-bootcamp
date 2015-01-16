/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.view;

/**
 *
 * @author Frederic
 */
public class Libro {
   private String  isbn="978-950-547-164-5";
   private String name="El Señor de los Anillos: El Retorno del Rey";

    public Libro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Libro:\n" + "Isbn=" + isbn + "\nName=" + name ;
    }
   
    
    
    
}
