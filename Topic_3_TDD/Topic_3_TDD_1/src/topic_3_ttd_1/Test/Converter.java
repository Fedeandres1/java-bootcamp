/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_ttd_1.Test;

import java.util.Scanner;

/**
 * this class contains all method to convert a amount Double number to a String
 *
 * @author Frederic
 */
public class Converter {

    private static final Scanner sc = new Scanner(System.in);
    private static double in;
    private static IConvertStrategy con;

    /**
     * mont the double input to introduce the person i separate the double in
     * two part, one part is the number after the point and the other is before
     * the point. This class funtion with a million number. i implements a
     * Strategy Pattern
     *
     * @param cant
     * @return
     */
    public static String convertAmountToString(double cant) {
        String mont = "";
        String beforePoint = "";
        String afterPoint = "";
        String result;
        int point = 0;
        try {
            mont = String.valueOf(cant);

            point = mont.indexOf(".");
            beforePoint = mont.substring(point + 1, mont.length()).trim();
            afterPoint = mont.substring(0, point).trim();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        return convert(afterPoint) + " and " + beforePoint + "/100 dollars";
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            System.out.println("Ingrese un numero, por favor...");
            in = sc.nextDouble();
            System.out.println(in);
            System.out.println("\n" + convertAmountToString(in));
        } catch (Exception e) {
            System.out.println("Introduce the number correctly, please, (Example: 3552,25) ");
        }
    }

    /**
     * This method is the most important, recibe a string who contain a Number
     * and converted to a other string with the number in to appropiate text. I
     * used the Strategy Pattern. I dont like very much use the swicth but i
     * dont thing in other form to make it :)
     *
     * @param make the string to convert
     * @return
     */
    public static String convert(String make) {
        String result = "";
        int size = make.length();
        switch (size) {
            case 1:
                con = new StrategyTwoDigit();
                result = con.convert(make);
                break;

            case 2:
                con = new StrategyTwoDigit();
                result = con.convert(make);
                break;

            case 3:
                con = new StrategyHundred();
                result = con.convert(make.substring(0, 1)) + " ";
                con = new StrategyTwoDigit();
                result += con.convert(make.substring(1, 3));
                break;
            case 4:
                con = new StrategyThousand();
                result = con.convert(make.substring(0, 1)) + " ";
                con = new StrategyHundred();
                result += con.convert(make.substring(1, 2)) + " ";
                con = new StrategyTwoDigit();
                result += con.convert(make.substring(2, 4));
                break;
            case 5:
                con = new StrategyTwoDigit();
                result = con.convert(make.substring(0, 2)) + " ";
                con = new StrategyThousand();
                result += con.convert("0") + " ";
                con = new StrategyHundred();
                result += con.convert(make.substring(2, 3)) + " ";
                con = new StrategyTwoDigit();
                result += con.convert(make.substring(3, 5)) + " ";
                break;
            case 6:
                con = new StrategyHundred();
                result = con.convert(make.substring(0, 1)) + " ";
                con = new StrategyTwoDigit();
                result += con.convert(make.substring(1, 3)) + " ";
                con = new StrategyThousand();
                result += con.convert("0") + " ";
                con = new StrategyHundred();
                result += con.convert(make.substring(3, 4)) + " ";
                con = new StrategyTwoDigit();
                result += con.convert(make.substring(4, 6));
                break;
            case 7:
                con = new StrategyMillion();
                result = con.convert(make.substring(0, 1))+" ";
                con = new StrategyHundred();
                result += con.convert(make.substring(1, 2)) + " ";
                con = new StrategyTwoDigit();
                result += con.convert(make.substring(2, 4)) + " ";
                con = new StrategyThousand();
                result += con.convert("0") + " ";
                con = new StrategyHundred();
                result += con.convert(make.substring(4, 5)) + " ";
                con = new StrategyTwoDigit();
                result += con.convert(make.substring(5, 7));

                break;

            default:
                result = "";
        }

        return result;
    }

}
