package SelfLearn;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        char repeat;

        do {
            System.out.println("****************************");     //Province menu
            System.out.println("Welcome to my Tax calculator");
            System.out.println("****************************");
            System.out.println("Select Province");
            System.out.println("1. Ontario");
            System.out.println("2. Alberta");
            System.out.println("3. New Brunswick");
            System.out.println("Select Your Province:");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();  // user input for province selection

                if (choice == 1) {
                    System.out.println("Enter Amount: ");
                    int num = scanner.nextInt();   // user input for Amount
                    System.out.println("amount after tax is: " + (num * 1.13));

                } else if (choice == 2) {
                    System.out.println("Enter Amount: ");
                    int num = scanner.nextInt();   // user input for Amount
                    System.out.println("amount after tax is: " + (num * 1.05));

                } else if (choice == 3) {
                    System.out.println("Enter Amount: ");
                    int num = scanner.nextInt();   // user input for Amount
                    System.out.println("amount after tax is: " + (num * 1.15));

                } else {
                    System.out.println("Invalid choice");
                }
                System.out.println("want to repeat? press Y for yes, N for no");
                repeat = scanner.next().charAt(0);

        }while (repeat == 'Y' || repeat == 'y') ;
        System.out.println("thank you");
    }
}



