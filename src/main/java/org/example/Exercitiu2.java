package org.example;
import java.util.Scanner;
public class Exercitiu2 {
    public static void main(String [] args){
        System.out.println("Buna ziua! Cum va numiti?");
        Scanner s =new Scanner(System.in);
        String text = s.next();
        System.out.println("Bine ai venit,  " + text  + "!  Cati ani ai?");
        String text2 = s.next();
        System.out.println("Am inteles bine, ai " + text2 + " aniii?");


    }

}
