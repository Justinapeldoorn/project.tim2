package May22nd;

import java.util.Scanner;

public class PBD22 {

    public static void main(String[] args) {

        Scanner invoergebruiker = new Scanner(System.in);

        String username;
        int leeftijd;

        System.out.println("Hey acrobaat, wat is je naam? ");
        username = invoergebruiker.nextLine();

        System.out.println("Oke " + username + ", hoe oud ben je? ");
        leeftijd = invoergebruiker.nextInt();

        if (leeftijd < 16) {
            System.out.println("Je mag nog geen autorijden, " + username + ".");
        } else if (leeftijd < 18) {
            System.out.println("Je mag nog niet stemmen, " + username + ".");
        } else if (leeftijd < 25) {
            System.out.println("Je mag nog geen auto huren, " + username + ".");
        }

        if (leeftijd > 25) {
            System.out.println("Alles wat legaal is, mag je doen " + username + ".");
        }

        /**
         * Let op, wat zou hier anders zijn wanneer het om een else gaat ipv meerdere if statements ?
         */

    }


}
