/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import Controlador.*;

/**
 *
 * @author Frederic
 */
public class Archivo {

    public static void cargar_canciones(Reproductor reproductor, File ruta[]) throws MalformedURLException {

        URI r;
        URL ru = null;
        int i = 0;

        while (i < ruta.length) {
            r = ruta[i].toURI();

            ru = r.toURL();
            Cancion cancion = new Cancion();
            cancion.setNombre(ruta[i].getName());
            cancion.setUrl(ru);
            reproductor.agregar_a_playlist(cancion);
            i++;

        }
    }

    public static void cargar_canciones(Reproductor reproductor, URI ruta[]) throws MalformedURLException {

        URL ru;
        int i = 0;

        while (i < ruta.length) {

            ru = ruta[i].toURL();
            Cancion cancion = new Cancion();
            cancion.setNombre(ru.getFile());
            cancion.setUrl(ru);
            reproductor.agregar_a_playlist(cancion);
            i++;

        }
    }

}
