package SelfLearn;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        char repeat;

        do {
            System.out.println("************************");
            System.out.println("Welcome to my calculator");
            System.out.println("************************");
            System.out.println("1. + ");
            System.out.println("2. - ");
            System.out.println("3. * ");
            System.out.println("4. % ");
            System.out.println("5. Exit");
            System.out.println("Choose Your Option: ");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();  //user input for option selection

            switch (option) {
                case 1:
                    SimpleCalculator cal = new SimpleCalculator();
                    cal.sum();
                    break;

                case 2:
                    SimpleCalculator cal0 = new SimpleCalculator();
                    cal0.sub();
                    break;

                case 3:
                    SimpleCalculator cal1 = new SimpleCalculator();
                    cal1.multiplication();
                    break;

                case 4:
                    SimpleCalculator cal2 = new SimpleCalculator();
                    cal2.mod();
                    break;

                case 5:
                    System.out.println("Exit. THANK YOU !!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input! Choose " );
            }
            System.out.println("want to repeat? press Y for yes, N for no");
            repeat = scanner.next().charAt(0);

        }while (repeat == 'Y' || repeat == 'y') ;
        System.out.println(" THANK YOU ");
    }
    public void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: "); //1st number selection
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: "); //2nd number selection
        int num2 = scanner.nextInt();
        System.out.println("your result is: " + (num1 + num2));
    }
    public void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: "); //1st number selection
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: "); //2nd number selection
        int num2 = scanner.nextInt();
        System.out.println("your result is: " + (num1 - num2));
    }
    public void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: "); //1st number selection
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: "); //2nd number selection
        int num2 = scanner.nextInt();
        System.out.println("your result is: " + (num1 * num2));
    }
    public void mod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: "); //1st number selection
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: "); //2nd number selection
        int num2 = scanner.nextInt();
        System.out.println("your result is: " + (num1 % num2));
    }
}
