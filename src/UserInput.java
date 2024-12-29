import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name:");

        String name = scanner.next();
        System.out.println(name);
    }
}
