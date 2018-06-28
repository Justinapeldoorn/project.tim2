package hangman;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public String geefRandomWoord() {
        Random r = new Random();
        int randomGetal = r.nextInt(5);
        String[] woorden = {"taxie", "hondenlul", "computer", "zaadcel", "kinderprikker"};
        return woorden[randomGetal];
    }

    public Character[] maakArrayVanWoord(String gekozenWoord) {
        Character[] aantalLetters = new Character[gekozenWoord.length()];
        for (int i = 0; i < gekozenWoord.length(); i++) {
            aantalLetters[i] = '_';
        }
        return aantalLetters;
    }

    public String maakStringVanArray(Character[] aantalLetters) {
        String result = new String();
        for (int i = 0; i < aantalLetters.length; i++) {
            result = result + aantalLetters[i].toString() + " ";
        }
        return result;
    }

    public Character methodePrint(Character[] characters) {
        Scanner invoerGebruiker = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println("Word: " + maakStringVanArray(characters));
        System.out.println();
        System.out.println("Misses:");
        System.out.println();
        System.out.println("Guess:");
        char userGuess = invoerGebruiker.nextLine().charAt(0);
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        return userGuess;
    }
}
