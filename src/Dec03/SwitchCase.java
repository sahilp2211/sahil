package Dec03;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your input ...");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;

            default:
                System.out.println("Wrong Input");

                return;



        }
    }
}
