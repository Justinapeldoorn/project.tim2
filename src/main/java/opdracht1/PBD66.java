package opdracht1;

import java.util.Scanner;

public class PBD66 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Count to: ");
        int input = keyboard.nextInt();

        for (int x = 0; x <= input; x++) {
            System.out.println(x);
        }

    }


}
