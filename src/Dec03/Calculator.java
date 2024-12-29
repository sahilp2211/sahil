package Dec03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char repeat;

        do {
            System.out.println("************************");
            System.out.println("Welcome to my calculator");
            System.out.println("************************");

            System.out.print("Enter the first number: "); //1st number selection
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: "); //2nd number selection
            int num2 = scanner.nextInt();

            System.out.print("Enter the operator (+, -, *, %): "); //operator selection
            String input = scanner.next();

            int result;

            switch (input) {

                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "%":
                    result = num1 % num2;
                    break;

                default:
                    System.out.println("Invalid input!");
                    return;
            }
            System.out.println("Result: " + result);

            System.out.println("want to repeat? press Y for yes, N for no");
            repeat = scanner.next().charAt(0);

        } while (repeat == 'Y' || repeat == 'y');
        System.out.println("thank you");
    }
}




