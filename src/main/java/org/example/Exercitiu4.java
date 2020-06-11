package org.example;
import java.util.Scanner;
public class Exercitiu4 {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);

        System.out.println(" What is the frist number?");
        int nr1 = s.nextInt();
        System.out.println(" What is the frist number?");
        int nr2 = s.nextInt();
        int sum = 0;
        System.out.println(nr1+ "+"+ nr2+ "="+ (sum= nr1+nr2));
        System.out.println(nr1+ "-"+ nr2+ "="+ (sum= nr1-nr2));
        System.out.println(nr1+ "*"+ nr2+ "="+ (sum= nr1*nr2));
        System.out.println(nr1+ "/"+ nr2+ "="+ (sum= nr1/nr2));
    }
}
