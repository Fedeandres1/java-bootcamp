/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.Date;

/**
 *
 * @author Frederic
 */
public class ControladorHospital {

    private IConstructorHospital hospital;

    // Esta clase va a tener todos los datos para crear un hospital nuevo
    // Se lo pasaran por una interfaz gráfica.
    public void construirHospital() {
        hospital = new ConstructorHospital();
        DirectorConstruccionHospital dire = new DirectorConstruccionHospital(hospital);

        int i[] = new int[2];
        i[0] = 2;
        i[1] = 4;

        dire.construir(
                "name",
                (new Direccion()),
                2,
                i,
                (new Date()),
                5984,
                constrCuartos(),
                constRecepcion(),
                constAscensor()
        );//Aca le pasamos todos los parametros para construir el hospital

    }

    public static void main(String[] args) {
        //para probar

    }

    public Cuarto[] constrCuartos() {
        Cuarto[] c = new Cuarto[5];
        return c;
    } // estos metodos tendria que settear los cuartos,recepcion y ascensores
    // con un array que nos mande el usuario y le sacamos el lenght para poner el tamaño del vector

    public Recepcion[] constRecepcion() {
        Recepcion r[] = new Recepcion[2];
        return r;
    }

    public Ascensor[] constAscensor() {
        Ascensor a[] = new Ascensor[2];
        return a;
    }
}
