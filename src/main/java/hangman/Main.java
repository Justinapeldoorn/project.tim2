package hangman;

public class Main {
    public static void main(String[] args) {

        Utils util = new Utils();
        String woord = util.geefRandomWoord();
        Character[] characters = util.maakArrayVanWoord(woord);

        for (int i = 0; i <8 ; i++) {
            Character userGuess = util.methodePrint(characters);

            for (int x = 0; x < characters.length; x++) {
                if (woord.charAt(x) == userGuess) {
                    characters[x] = userGuess;
                }
            }
        }
    }
}
