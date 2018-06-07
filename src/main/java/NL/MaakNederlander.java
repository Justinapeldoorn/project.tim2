package NL;

public class MaakNederlander {

    public static void main(String[] args) {

        Nederlander PietjePrecies = new Nederlander("Pietje Precies", 44, 3444.88);
        Nederlander SjaakTrekhaak = new Nederlander("Sjaak Trekhaak", 51, 2914.88);
        Nederlander KeesKoolmees = new Nederlander("Kees Koolmees", 39, 2866.12);
        Nederlander Henkie = new Nederlander("Henkie", 12, 63);

//        System.out.println(PietjePrecies.toString());
//        System.out.println(SjaakTrekhaak.toString());
//        System.out.println(KeesKoolmees.toString());
//
//        //PietjePrecies.setSalaris(3000);
//
//        //System.out.println(PietjePrecies.toString());
//
//        String dezeString = "deze string";
//
//        boolean dezeBoolean = dezeString.contains("tring");
//        System.out.println(dezeBoolean);
//


        Nederlander[] ArrayNederlanders = new Nederlander[4];

        ArrayNederlanders[0] = PietjePrecies;
        ArrayNederlanders[1] = SjaakTrekhaak;
        ArrayNederlanders[2] = KeesKoolmees;
        ArrayNederlanders[3] = Henkie;

        for(int mijnInt = 0; mijnInt < ArrayNederlanders.length; mijnInt++){

            Nederlander huidigeNederlander = ArrayNederlanders[mijnInt];

            System.out.println(huidigeNederlander.toString());

            if (huidigeNederlander.getNaam().contains("e") && huidigeNederlander.getSalaris()> 2600){
                double nieuwSalaris = huidigeNederlander.getSalaris() /2;
                String nederlandernaam1 = huidigeNederlander.getNaam().toUpperCase();
                int hoeveelheidTekens = huidigeNederlander.getNaam().length();
                System.out.println("Helaas, " + nederlandernaam1 + " je salaris is gehalveerd." + "Het is nu: " + nieuwSalaris + "en je naam bestaat uit " + hoeveelheidTekens + "." );
            }
        }
    }


}
