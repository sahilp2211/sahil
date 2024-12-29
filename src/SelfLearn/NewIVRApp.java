package SelfLearn;

import java.util.Scanner;

public class NewIVRApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat;
        do {

            System.out.println("Welcome to Rogers IVR System.");
            System.out.println("1. English");
            System.out.println("2. French");
            System.out.println("Select your option");
            int choice = scanner.nextInt();
            {
                if (choice == 1) {
                    System.out.println("1. Customer Service");
                    System.out.println("2. Technical Support");
                    System.out.println("3. Sales");
                } else {
                    System.out.println("Invalid choice.");
                }
            }

            int mainchoice = scanner.nextInt();
            System.out.println("Please enter your choice:");
            switch (mainchoice) {

                case 1:
                    System.out.println(" 1. to change your current plan ");
                    System.out.println(" 2. billing issue ");
                    System.out.println(" 3. to update payment method ");

                    int customerservicechoice = scanner.nextInt();

                    if (customerservicechoice == 1) {  //handling payment set up
                        System.out.println("Please hold while transferring to an agent.");
                    } else if (customerservicechoice == 2) { // handling account changes
                        System.out.println("Please hold while transferring to an agent.");
                    } else {
                        System.out.println("Invalid choice.");
                        break;

          /*  case 2:
                System.out.println(" ");
                break;

            case 3:
                System.out.println(" ");
                break;*/
                    }

            }System.out.println("want to repeat? press Y for yes, N for no");
            repeat = scanner.next().charAt(0);
        }while ( repeat == 'Y' || repeat == 'y') ;
        System.out.println("thank you");
    }
}