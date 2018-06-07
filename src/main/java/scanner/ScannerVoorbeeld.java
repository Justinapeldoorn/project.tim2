package scanner;

import java.util.Random;
import java.util.Scanner;

public class ScannerVoorbeeld {
    public static void main(String[] args) {

        // Hier maak je een scanner aan, let op dit is een object
        Scanner gebruikersInput = new Scanner(System.in);
        System.out.println("Hoi, wat is je naam?");

        // Hier vraag je de gebruiker om input, let op. wil je iets anders dan een String terug hebben, dan gebruik
        // je ook een andere methode dan nextLine (bijvoorbeeld, nextInt)
        String naam = gebruikersInput.nextLine();

        System.out.println(naam + ", wat een kut naam!");

        // Hier maak je weer een object aan, dit object genereert een random getal
        Random randomNummer = new Random();
        // met de methode nextInt kun je een random int laten genereren.
        // in dit voorbeeld heb je een random nummer van 1 t/m 10 (let op java begint met tellen bij 0, vandaar de +1 erachter)
        int randomInt = randomNummer.nextInt(10) + 1;
        int eenInt = 10;

        // Dit is een voorbeeld van het vergelijken van ints
        if (randomInt == eenInt){
            System.out.println("de twee integers zijn gelijk");
        }

        String eenString = "Justin";
        String andereString = "Henk";

        // Dit is een voorbeeld van het vergelijken met een String waarde (want dit is ook een object)
        // Wil je geen rekening hoeven te houden met hoofdletters, gebruik dan egualsIgnoreCase.
        if (eenString.equals(andereString)){

        }

    }



}
