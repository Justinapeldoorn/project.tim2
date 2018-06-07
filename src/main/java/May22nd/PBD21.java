package May22nd;

public class PBD21 {

    public static void main(String[] args) {
        int mensen = 20, katten = 30, honden = 15;

        if (mensen < katten) {
            System.out.println("Er zijn te veel katten, we zijn gedoemd!");
        }

        if (mensen > katten) {
            System.out.println("Er zijn precies genoeg katten, de wereld is veilig!");
        }

        if (mensen < honden) {
            System.out.println("De wereld wordt onder gekwijld!");
        }

        if (mensen > honden) {
            System.out.println("De wereld is een beetje te droog!");
        }

        honden += 5;

        if (mensen >= honden) {
            System.out.println("Er zijn evenveel of meer mensen dan honden.");
        }

        if (mensen <= honden) {
            System.out.println("Er zijn evenveel of minder mensen dan honden.");
        }

        if (mensen == honden) {
            System.out.println("Mensen zijn honden.");
        }


    }
// Vragen:
    //  1:  What do you think the if does to the code under it?
    // Je geeft een voorwaarde op, als daar aan wordt voldaan, keert een true terug. Deze vertelt de sout, dat hij zijn booschap mag printen.
    //  2: What is the purpose of the curly braces in the if statement?
    // Zo scherm je af en geef je aan dat alles binnen de brackets alleen voor deze if statement geldt.
    //  3: Change the values of the variables so that neither message about cats is printed.
    //  Geef in dit geval een gelijkwaardige waarde op voor mensen en katten.

}
