/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_tdd_2;

import java.util.ArrayList;

/**
 *
 * @author Frederic
 */
public class Converter {

    private ArrayList<String> result;

    /**
     * Constructor
     */
    public Converter() {
        result = new ArrayList() {
        };

    }

    /**
     * This method works as follows: first look if the string div the row have rest, if not 
     * the string enter on a Loop how div the String into a part.
     * If have rest the Last String is calculate with a ultimaCadena and the same loop with the other
     * String.
     *
     * @param cadena the String for transform
     * @param row the number of the row-Length
     * @return
     */
    public ArrayList convert(String cadena, int row) {
        int div = ((int) cadena.length() / row);
        int rest = (cadena.length() % row);
        if (rest != 0) {
               int falt=cadena.length()-(row*div);
            String ultimaCadena;
            ultimaCadena = cadena.substring(cadena.length()-falt, cadena.length());

            int i = 0;
            int increment = 0;
            while (i < div) {
                result.add("'" + cadena.substring(increment, increment + row) + "'" + " ");
                increment += row;
                i++;
            }
            result.add("'" +ultimaCadena+ "'" + " ");

        } else {
            int i = 0;
            int increment = 0;
            while (i < div) {
                result.add("'" + cadena.substring(increment, increment + row) + "'" + " ");
                increment += row;
                i++;
            }

        }

        return result;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < result.size(); i++) {

            res += result.get(i);

        }
        return res;
    }

}
