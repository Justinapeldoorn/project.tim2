package May22nd;

import java.util.Scanner;


public class PBD49 {
    public static void main(String[] args) {

        Scanner gokje = new Scanner(System.in);
        int getal = 6;

        System.out.println("Ik heb een nummer gekozen, van 1 t/m 10. Probeer het eens te raden. ");

        int gokgetal = gokje.nextInt();

        while (gokgetal != getal) {
            System.out.println("Nee, helaas. Probeer het nog eens. ");
            gokgetal = gokje.nextInt();
        }

        System.out.println("Dat is correct, goed geraden!");
    }


}
