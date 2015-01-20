/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import javax.swing.JOptionPane;

/**
 *
 * @author Frederic
 */
public class RomanToInt {

    public RomanToInt() {

    }

    public enum Roman {

        I, V, X, L, C, D, M

    }

    /**
     * this method is the most important, transforn the roman symbon into 
     * integer. take all number one to one digit and compare if one is big,equals o 
     * less than 
     * the other and then tranforn with the other method, and acu the result in the res variable 
     * @param number
     * @return
     */
    public int convertRomanToInt(String number) {
        int res = 0;
        int mediator = 0;
        int length = number.length();
        int i = 0;
        int increment = 1;
        try {
            if (increment < length) {
                while (increment < length) {

                    if (getInt(number.charAt(i)) > getInt(number.charAt(increment))) {
                        res += getInt(number.charAt(i)) + mediator;
                        mediator = 0;
                    } else if (getInt(number.charAt(i)) == getInt(number.charAt(increment))) {
                        mediator += getInt(number.charAt(i));
                    } else if (getInt(number.charAt(i)) < getInt(number.charAt(increment))) {
                        mediator = mediator - getInt(number.charAt(i));
                    }
                    i++;
                    increment++;
                }
            } 
               

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        res = res + mediator +getInt(number.charAt(length - 1));
           return res;
    }

    /**
     *this method is simple, return the valor of the roman symbol in number
     * @param romanChar
     * @return
     */
    public static int getInt(char romanChar) {
        if (romanChar == Roman.I.toString().charAt(0)) {
            return 1;
        } else if (romanChar == Roman.V.toString().charAt(0)) {
            return 5;
        } else if (romanChar == Roman.X.toString().charAt(0)) {
            return 10;
        } else if (romanChar == Roman.L.toString().charAt(0)) {
            return 50;
        } else if (romanChar == Roman.C.toString().charAt(0)) {
            return 100;
        } else if (romanChar == Roman.D.toString().charAt(0)) {
            return 500;
        } else if (romanChar == Roman.M.toString().charAt(0)) {
            return 1000;
        }
        return (Integer) null;
    }

}
