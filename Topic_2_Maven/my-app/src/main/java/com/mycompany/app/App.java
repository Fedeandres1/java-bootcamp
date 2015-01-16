package com.mycompany.app;

import java.util.Scanner;
public class App 
{
private static String in;
private static Scanner s=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra por favor...");
        in =s.nextLine();
        System.out.println(in);
        // TODO code application logic here
    }
}
