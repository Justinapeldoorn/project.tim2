package variabelen;

public class PBD10 {
    public static void main(String[] args)
    {
        String timhisName, timhisEyes, timhisTeeth, timhisHair;
        int timhisAge, timhisHeight, timhisWeight;

        timhisName = "Tim Wessels";
        timhisAge = 30;
        timhisHeight = 176;
        timhisWeight = 85;
        timhisEyes = "blue";
        timhisTeeth = "white";
        timhisHair = "what used to be dark brown";


        System.out.println( "Let's talk about " + timhisName + ".");
        System.out.println( "He's " + timhisHeight + " centimeters tall." + " That's the same as " + (timhisHeight * 0.393700787) + " inches." ) ;
        //System.out.println( "He's " + timhisHeight + " centimeters tall." + " That's the same as " + (timhisHeight * Math.round(0.393700787) + " inches." ));


        System.out.println( "He's " + timhisWeight + " kilo's heavy, or " + (Math.round(timhisWeight * (2.2046226)) + " pounds.") );


//        System.out.println( "He's " + timhisWeight + " kilo's heavy, or " + (timhisWeight * Math.round(2.2046226) + " pounds.") );
        // Krijg de afronding niet goed. Uitkomst van 170 pounds klopt niet.
        System.out.println( "Actually, that's not too heavy.");
        System.out.println( "He's got " + timhisEyes + " eyes and " + timhisHair + " hair.");
        System.out.println( "His teeth are usually " + timhisTeeth + " depending on the coffee.");

        System.out.println( "If I add " + timhisAge + ", " + timhisHeight + ", and " + timhisWeight + " I get " + (timhisAge + timhisHeight + timhisWeight) + "." );



    }




















}
