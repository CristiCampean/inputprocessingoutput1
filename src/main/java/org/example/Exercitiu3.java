package org.example;

import java.util.Scanner;

public class Exercitiu3 {
    public static void main(String[] args) {
        System.out.println("Introduceti un substantiv");
        Scanner s = new Scanner(System.in);
        String text = s.next();
        System.out.println("Introduceti un verb");
        String text2 = s.next();
        System.out.println("Introduceti un adjectiv");
        String text3 = s.next();
        System.out.println("Introduceti un adverb");
        String text4 = s.next();
        System.out.println("Tu  " + text2 +"" + text3 +"" +text +""+ text4);
    }
}