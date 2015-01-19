/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_tdd_2;

import java.util.Scanner;

/**
 *
 * @author Frederic
 */
public class Main {

    private static Converter con;
    private static Scanner sc;

    public static void main(String[] args) {
        con = new Converter();
        sc = new Scanner(System.in);
        try {
            System.out.println("Insert the String please");
            String cadena = sc.nextLine();
            System.out.println("Insert the Row-Length please");
            int rowLength = sc.nextInt();

            con.convert(cadena, rowLength);
            System.out.println(con.toString());
        } catch (Exception e) {
            System.out.println("Please, insert the String and Row-Length correctly, Example(Hello world!,5 )");

        }

    }

}
