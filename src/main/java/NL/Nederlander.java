package NL;

public class Nederlander {

    String naam;
    int leeftijd;
    double brutoMaandSalaris;


    public Nederlander(String naam, int leeftijd, double brutoMaandSalaris) {
// Constructor
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.brutoMaandSalaris = brutoMaandSalaris;
    }

    public String toString() {
        return naam + " " + leeftijd + " " + brutoMaandSalaris;
// Methode
    }

    public void setSalaris(double Salaris) {

        brutoMaandSalaris = Salaris;
        // Methode
    }

    public double getSalaris() {
        return brutoMaandSalaris;
    }

    public String getNaam() {
        return naam;
    }

}
