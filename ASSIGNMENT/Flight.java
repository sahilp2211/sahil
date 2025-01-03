package ASSIGNMENT;

import java.util.Scanner;

/*
4. Flight Booking System: You are building a system for an airline company.
 Write a Java program that stores the names of 5 destinations in a string array. Create methods to:
• Search for a destination and confirm whether it’s available.
• Allow a user to update the name of a destination.
 */
public class Flight {

    String[] destination = {"INDIA", "U.S", "CANADA", "MEXICO", "CHINA"};


    public void displayDestinations() {
        String[] destination = {"INDIA", "U.S", "CANADA", "MEXICO", "CHINA"};
        System.out.println();
        System.out.println("available locations: ");
        for (int i = 0; i < destination.length; i++) {
            System.out.println(destination[i]);
        }
    }

    public void checkavailability() {
        System.out.println("Enter destination to check availability: ");
        Scanner scanner = new Scanner(System.in);
        String destinationName = scanner.next();
        for (int i = 0; i < 5; i++) {
            if (destination[i].equals(destinationName)) {
                System.out.println(destinationName + " is available.");
                return;
            }
        }
        System.out.println(destinationName + " is not available.");
        System.out.println("Exit");
       System.exit(0);
    }

    public String[] updateDestination(){
        System.out.println();
        System.out.println("Enter location to update:");
        Scanner scanner = new Scanner(System.in);
        String Location = scanner.next();
        System.out.println("Enter new location: ");
        String newLocation = scanner.next();

        for (int i = 0; i < 5; i++) {
            if(destination[i].equals(Location)){
                destination[i] = newLocation;
            }
        }
        return destination;
    }
}





