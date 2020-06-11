package org.example;
import java.util.Scanner;
public class Exercitiu1 {
    public static void main (String [] args ){
        System.out.println("Scrieti un cuvant dupa care apasati enter");
        Scanner s = new Scanner(System.in);
        String nume = s.nextLine();
        System.out.println("Cuvantul introdus este format din " + nume.length() +  " caractere");
    }
}
