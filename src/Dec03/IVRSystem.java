package Dec03;

import java.util.Scanner;

public class IVRSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
char repeat;
        do {
            System.out.println("Welcome to Rogers IVR System.");
            System.out.println("1. Customer Service");
            System.out.println("2. Technical Support");
            System.out.println("3. Sales");
            System.out.println("Please enter your choice:");
            int mainChoice = scanner.nextInt(); //choice the service

            switch (mainChoice) {

                case 1:    // Customer Service Menu
                    System.out.println("Customer Service Menu:");
                    System.out.println("1. Account Inquiry");
                    System.out.println("2. Billing Questions");

                    System.out.println("Please enter your choice:"); //customer choice for customer service
                    int customerServiceChoice = scanner.nextInt();

                    if (customerServiceChoice == 1) {  // Handle account inquiry
                        System.out.println("Please hold while transferring to an agent.");
                    } else if (customerServiceChoice == 2) {  // Handle billing questions
                        System.out.println("Please hold while transferring to an agent.");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:   // Technical Support Menu
                    System.out.println("Technical support Menu:");
                    System.out.println("1. To set up new payment details");
                    System.out.println("2. To make changes to current account");
                    int techsupportchoice = scanner.nextInt();

                    if (techsupportchoice == 1) {  //handling payment set up
                        System.out.println("Please hold while transferring to an agent.");
                    } else if (techsupportchoice == 2) { // handling account changes
                        System.out.println("Please hold while transferring to an agent.");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:    // Sales Menu
                    System.out.println("Please hold while transferring to an agent.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("want to repeat? press Y for yes, N for no");
            repeat = scanner.next().charAt(0);

        } while (repeat == 'Y' || repeat == 'y');
    }
}