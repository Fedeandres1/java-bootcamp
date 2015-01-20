/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;



/**
 *
 * @author Frederic
 */
public class IntToRoman {

   

    public IntToRoman() {
        

    }

    public String convertIntToRoman(String number) {
        String res = "";
        int numb = 0;
        numb = number.length();
        String primero = "", segundo = "", tercero = "", cuarto = "";

        switch (numb) {
            case 1:
                res = oneDigit(number);
                break;
            case 2:
                primero = number.substring(0, 1);
                segundo = number.substring(1, 2);
                res = twoDigit(primero) + oneDigit(segundo);
                break;
            case 3:
                primero = number.substring(0, 1);
                segundo = number.substring(1, 2);
                tercero = number.substring(2, 3);
                res = threeDigit(primero) + twoDigit(segundo) + oneDigit(tercero);

                break;
            case 4:
                primero = number.substring(0, 1);
                segundo = number.substring(1, 2);
                tercero = number.substring(2, 3);
                cuarto = number.substring(3, 4);
                res = fourDigit(primero) + threeDigit(segundo) + twoDigit(tercero) + oneDigit(cuarto);

                break;
            default:
                return "";
        }
        return res;
    }

    public String oneDigit(String cadena) {
        String res = "";
        int numb = 0;
        numb = Integer.parseInt(cadena);
        switch (numb) {
            case 1:
                res = Roman.I.toString();
                break;
            case 2:
                res = Roman.I.toString() + Roman.I.toString();
                break;
            case 3:
                res = Roman.I.toString() + Roman.I.toString() + Roman.I.toString();
                break;
            case 4:
                res = Roman.I.toString() + Roman.V.toString();
                break;
            case 5:
                res = Roman.V.toString();
                break;
            case 6:
                res = Roman.V.toString() + Roman.I.toString();
                break;
            case 7:
                res = Roman.V.toString() + Roman.I.toString() + Roman.I.toString();
                break;
            case 8:
                res = Roman.V.toString() + Roman.I.toString() + Roman.I.toString() +Roman.I.toString();
                break;
            case 9:
                res = Roman.I.toString() + Roman.X.toString();
                break;
            default:
                return "";
        }
        return res;
    }

    public String twoDigit(String cadena) {
        String res = "";
        int numb = 0;
        numb = Integer.parseInt(cadena);
        switch (numb) {
            case 1:
                res = Roman.X.toString();
                break;
            case 2:
                res = Roman.X.toString() + Roman.X.toString();
                break;
            case 3:
                res = Roman.X.toString() + Roman.X.toString() + Roman.X.toString();
                break;
            case 4:
                res = Roman.X.toString() + Roman.L.toString();
                break;
            case 5:
                res = Roman.L.toString();
                break;
            case 6:
                res = Roman.L.toString() + Roman.X.toString();
                break;
            case 7:
                res = Roman.L.toString() + Roman.X.toString() + Roman.X.toString();
                break;
            case 8:
                res = Roman.L.toString() + Roman.X.toString() + Roman.X.toString() + Roman.X.toString();
                break;
            case 9:
                res = Roman.X.toString() + Roman.C.toString();
                break;
            default:
                return "";
        }
        return res;

    }

    public String threeDigit(String cadena) {
        String res = "";
        int numb = 0;
        numb = Integer.parseInt(cadena);
        switch (numb) {
            case 1:
                res = Roman.C.toString();
                break;
            case 2:
                res = Roman.C.toString() + Roman.C.toString();
                break;
            case 3:
                res = Roman.C.toString() + Roman.C.toString() + Roman.C.toString();
                break;
            case 4:
                res = Roman.C.toString() + Roman.D.toString();
                break;
            case 5:
                res = Roman.D.toString();
                break;
            case 6:
                res = Roman.D.toString() + Roman.C.toString();
                break;
            case 7:
                res = Roman.D.toString() + Roman.C.toString() +Roman.C.toString();
                break;
            case 8:
                res = Roman.D.toString() + Roman.C.toString() + Roman.C.toString() + Roman.C.toString();
                break;
            case 9:
                res = Roman.C.toString() + Roman.M.toString();
                break;
            default:
                return "";
        }
        return res;

    }

    public String fourDigit(String cadena) {
        String res = "";
        int numb = 0;
        numb = Integer.parseInt(cadena);
        switch (numb) {
            case 1:
                res = Roman.M.toString();
                break;
            case 2:
                res = Roman.M.toString() + Roman.M.toString();
                break;
            case 3:
                res = Roman.M.toString() + Roman.M.toString() + Roman.M.toString();
                break;
            /*  case 4:
             res = roman.getSymbol(4) + roman.getSymbol(5);
             break;
             case 5:
             res = roman.getSymbol(5);
             break;
             case 6:
             res = roman.getSymbol(5) + roman.getSymbol(4);
             break;
             case 7:
             res = roman.getSymbol(5) + roman.getSymbol(4) + roman.getSymbol(4);
             break;
             case 8:
             res = roman.getSymbol(5) + roman.getSymbol(4) + roman.getSymbol(4) + roman.getSymbol(4);
             break;
             case 9:
             res = roman.getSymbol(4) + roman.getSymbol(6);
             break;*/
            default:
                return "";
        }
        return res;
    }

    enum Roman {

        I, V, X, L, C, D, M
    }

}
