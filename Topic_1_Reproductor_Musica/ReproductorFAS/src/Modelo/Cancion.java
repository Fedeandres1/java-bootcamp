/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.net.URL;

/**
 *
 * @author Frederic
 */
public class Cancion implements Comparable, Serializable {

    private URL url;
    private String nombre;

    /**
     * @return the url
     */
    public URL getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(URL url) {
        this.url = url;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {

        return nombre.replace(".mp3", "");

    }

    @Override
    public int compareTo(Object objeto) {

        Cancion cancion = (Cancion) objeto;
        String nombreObjeto = cancion.getNombre().toLowerCase();
        String nombreThis = this.getNombre().toLowerCase();

        return (nombreThis.compareTo(nombreObjeto));

    }

}
