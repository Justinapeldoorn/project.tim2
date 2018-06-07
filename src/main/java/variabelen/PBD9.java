package variabelen;

public class PBD9 {

    public static void main(String[] args) {

        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passengers = 90;
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passengers_per_car = passengers / cars_driven;

        System.out.println(" There are " + cars + " cars available.");
        System.out.println(" There are only " + drivers + " drivers available.");
        System.out.println(" There will be " + cars_not_driven + " empty cars today.");
        System.out.println(" We can transport " + carpool_capacity + " people today.");
        System.out.println(" We have " + passengers + " to carpool today.");
        System.out.println(" We need to put about " + average_passengers_per_car + " in each car.");


        //What You Should Do on Your Own
        //
        //Assignments turned in without these things will not receive any points.
        //
        //    I used 4.0 for space_in_a_car, but is that necessary? What happens if it's just 4?
        //    Lijkt me noodzakelijk omdat we een double gebruiken. Test met 4 wijst uit dat dit niet geval is. Maakt geen verschil ,0 dus niet noodzakelijk.

        //    Remember that 4.0 is a "floating point" number. Find out what that means.
        //    Is een getal met een tweede getal achter de komma.

        //    Write comments above each of the variable assignments.
        //    Make sure you know what = is called (equals) and that it's making names for things.
        //    = geeft waarde of naam/text

        //    Remember _ is an underscore character.
    }
}
