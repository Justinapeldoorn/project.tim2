package May22nd;

import java.util.Random;

public class PBD41 {

    public static void main(String[] args) {

        Random r = new Random();

        int x = 1 + r.nextInt(10);

        System.out.println("Mijn willekeurig getal is " + x);

        System.out.println("Hier zijn enkele willekeurige getallen van 1 t/m 5");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.print(1 + r.nextInt(5) + " ");
        System.out.println();

        System.out.println("Hier zijn enkele willekeurige getallen van 1 t/m 100");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.print(1 + r.nextInt(100) + "\t");
        System.out.println();

        int num1 = 1 + r.nextInt(4);
        int num2 = 1 + r.nextInt(4);

        if (num1 == num2) {
            System.out.println(num1 + " " + num2);
            System.out.println("Sommige willekeurige getallen waren toch hetzelfde. Wat toevallig!");
        }else{
            System.out.println(num1 + " " + num2);
            System.out.println("De willekeurige getallen zijn verschillend. Dat is geen grote verrassing.");
        }


//        if (num1 != num2) {
//            System.out.println(num1 + " " + num2);
//        }

    }


}
