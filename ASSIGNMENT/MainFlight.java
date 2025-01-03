package ASSIGNMENT;/*
4. Flight Booking System
You are building a system for an airline company. Write a Java program that stores the names of 5 destinations
 in a string array. Create methods to:
• Search for a destination and confirm whether it’s available.
• Allow a user to update the name of a destination.
 */

import java.util.Arrays;

public class MainFlight {
    public static void main(String[] args) {

        Flight flight = new Flight();
        flight.displayDestinations();
        flight.checkavailability();
        flight.updateDestination();
        System.out.println(Arrays.toString(flight.updateDestination()));

    }

}