/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cancion;
import java.io.*;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.*;
import javax.media.format.AudioFormat;

/**
 *
 * @author ltemperoni
 */
public class Reproductor implements ControllerListener {

    private Player myPlayer;
    private SortedSet<Cancion> myPlaylist = new TreeSet<Cancion>();
    private Cancion actual;
    private int estado;
    private boolean repetir;

    public Reproductor() {

        estado = 0;
        actual = null;
        repetir = false;

    }

    public void agregar_a_playlist(Cancion cancion) {

        myPlaylist.add(cancion);

    }

    public void eliminar_cancion(Cancion c) {

        if (c != null) {
            myPlaylist.remove(c);

        }
    }

    public void borrar() {

        myPlaylist.clear();

    }

    public void reproducir(Cancion cancion) {

        String jffmpegAudioDecoder = "net.sourceforge.jffmpeg.AudioDecoder";
        Codec codecAudio = null;
        try {
            try {
                codecAudio = (Codec) Class.forName(jffmpegAudioDecoder).newInstance();
            } catch (InstantiationException ex) {
                Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        PlugInManager.addPlugIn(jffmpegAudioDecoder, codecAudio.getSupportedInputFormats(), new Format[]{new AudioFormat("LINEAR")}, PlugInManager.CODEC);
        try {
            myPlayer = Manager.createPlayer(cancion.getUrl());
        } catch (IOException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoPlayerException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        myPlayer.start();
        actual = cancion;
        myPlayer.addControllerListener(this);

    }

    public void parar() {

        if (myPlaylist != null) {

            myPlayer.stop();
            myPlayer.close();

        }

    }

    public void continuar() {

        myPlayer.start();

    }
 public void ir_a_posicion(int pos){
    
        myPlayer.setMediaTime(new Time(pos));
    
    }

    public void buscar_sig() {

        if (isRepetir() == false) {
            boolean encontro = false;
            Cancion aux;
            Iterator<Cancion> it = myPlaylist.iterator();
            aux = it.next();
            while (it.hasNext() && !encontro) {
                if (aux.equals(actual)) {

                    encontro = true;
                    aux = it.next();

                } else {
                    aux = it.next();
                }
            }
            if (aux != null) {
                parar();
                reproducir(aux);
            }
        } else {

            reproducir(actual);

        }
    }

    public void buscar_ant() {

        boolean encontro = false;
        Cancion aux, ant;
        Iterator<Cancion> it = myPlaylist.iterator();
        aux = it.next();
        if (!aux.equals(actual)) {

            ant = aux;
            aux = it.next();
            while (it.hasNext() && !encontro) {

                if (aux.equals(actual)) {

                    encontro = true;

                } else {
                    ant = aux;
                    aux = it.next();
                }
            }
            if (ant != null) {
                parar();
                reproducir(ant);
            }

        }
    }

    public void pausar() {

        myPlayer.stop();

    }

    public SortedSet<Cancion> get_playlist() {

        return myPlaylist;

    }

    public double get_duracionActual() {

        return myPlayer.getMediaTime().getSeconds();

    }

    public double get_duracionTotal() {

        return myPlayer.getDuration().getSeconds();

    }

    public Cancion getCancionActual() {

        return actual;

    }

    @Override
    public synchronized void controllerUpdate(ControllerEvent ce) {

        if (ce instanceof EndOfMediaEvent) {
            buscar_sig();

        }

    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the repetir
     */
    public boolean isRepetir() {
        return repetir;
    }

    /**
     * @param repetir the repetir to set
     */
    public void setRepetir(boolean repetir) {
        this.repetir = repetir;
    }

}
