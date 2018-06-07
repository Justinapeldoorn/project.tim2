package May22nd;

import java.util.Scanner;

public class PBD14 {

    public static void main(String[] args) {

        Scanner toetsenbord = new Scanner(System.in);

        int leeftijd;
        int lengteMeters;
        int lengteCenti;
        double gewicht;

        System.out.print("Hoe oud ben je? ");
        leeftijd = toetsenbord.nextInt();

        //print, welke en waarom.

        System.out.print("Hoeveel meter lang ben je? ");
        lengteMeters = toetsenbord.nextInt();

        System.out.print("En hoeveel centimeter? ");
        lengteCenti = toetsenbord.nextInt();

        System.out.print("Wat is je gewicht? ");
        gewicht = toetsenbord.nextDouble();

        System.out.println("Dus je bent " + leeftijd + " jaar oud, " + lengteMeters + " meter en " + lengteCenti + " centimers lang en " + gewicht + " kilo zwaar.");
    }


}
