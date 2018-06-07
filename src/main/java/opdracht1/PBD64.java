package opdracht1;

import java.util.Random;
import java.util.Scanner;

public class PBD64 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /* System.out.println("Type in a message, and I'll display it five times.");
         System.out.print("Message: ");
        String message = keyboard.nextLine();

         for (int n = 1; n <= 5; n = n + 1) {
            System.out.println(n + ". " + message);

 System.out.println("Type in a message, and I'll display it ten times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();

        for (int n = 1; n <= 10; n = n + 1) {
            System.out.println(n + ". " + message);


  System.out.println("Type in a message, and I'll display it a random number of times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();

       Random r = new Random();

       for (int n = r.nextInt(20); n <= 20; n = n + 1) {
          System.out.println(n + ". " + message);

 */
        System.out.println("Type in a message, and I'll display it ten times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();

        for (int n = 2; n <= 10; n = n + 2) {
            System.out.println(n + ". " + message);


        }


    }


}

/*  What You Should Do on Your Own

1.  What does n = n+1 do?
Telt er 1 bij op, zolang het onder de 20 blijft. Als je deze weghaalt blijft hij loopen op het gekozen random getal.

2.  What does int n = 1 do?
Maakt de variable/int n aan, en geeft deze de waarde 1. Als je dit weghaald begrijpt Java niet meer wat n is, omdat je het nog niet gedefinieerd hebt.

 */

