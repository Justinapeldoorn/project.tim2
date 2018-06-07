package opdracht1;

import java.util.Random;

public class PBD98 {
    public static void main(String[] args) throws InterruptedException {
        Random rng = new Random();
        int r;

        for (int i = 0; i<100; i++) {

            r = 1 + rng.nextInt(5);

            switch (r) {
                case 1:
                    first();
                    Thread.sleep(100);
                    break;
                case 2:
                    second();
                    Thread.sleep(100);
                    break;
                case 3:
                    third();
                    Thread.sleep(100);
                    break;
                case 4:
                    fourth();
                    Thread.sleep(100);
                    break;
                case 5:
                    fifth();
                    Thread.sleep(100);
                    break;
            }
        }
    }

    public static void first() {
        System.out.println("I                               \r");
    }

    public static void second() {
        System.out.println("  pledge                        \r");
    }

    public static void third() {
        System.out.println("         allegiance             \r");
    }

    public static void fourth() {
        System.out.println("                    to the      \r");
    }

    public static void fifth() {
        System.out.println("                           flag.\r");
    }
}
