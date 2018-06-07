package May22nd;

import java.util.Scanner;

public class PBD48 {
    public static void main(String[] args) {

        Scanner numpad = new Scanner(System.in);
        int pincode = 1287;

        System.out.println("Welkom bij de Clownsbank.");
        System.out.print("Voer uw pincode in: ");

        int invoercode = numpad.nextInt();

        while (invoercode != pincode)
        {
            System.out.println("\nPincode is onjuist. Probeer opnieuw.");
            System.out.print("Voer uw pincode in: ");
            invoercode = numpad.nextInt();
        }
        System.out.println("\nPincode geaccepteerd, u heeft nu toegang tot uw rekening.");


    }


}
// Vragen
//  1: How is a while loop similar to an if statement?
//  Je geeft op dezelfde manier bepaalde voorwaarden aan, waar een object of invoer aan moet voldoen en wat er in dat geval moet gebeuren.

//  2: How is a while loop different from an if statement?
//  Een while loop blijft loopen, zolang de invoer/object niet voldoet aan de gestelde parameters.

//  3: Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
//  We hebben eerder al aangegeven wat entry/invoercode is.

//  4: Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
//  De while blijft nu eeuwig door loopen omdat het systeem geen nieuwe input verwacht en dus de boodschap blijft versturen.
