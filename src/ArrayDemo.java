import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("enter the elements of array");

        for (int i = 1; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();

            System.out.println(i);
        }
    }
}
