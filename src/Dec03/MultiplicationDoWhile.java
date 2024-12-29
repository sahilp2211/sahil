package Dec03;

import java.util.Scanner;

public class MultiplicationDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choice n:");
        int n = scanner.nextInt();

        int x = 1;
int result = n * x;
        do {
            System.out.println(n + " x " + x + " = " + result);
            x++;
        } while (x <= 10);

    }
}
