package ASSIGNMENT;
/*
3. Grocery Store Price Calculator
You are working at a grocery store that offers 5 different fruits. Create a Java program that:
• Uses two arrays: one for storing the names of fruits and another for storing their prices per kilogram.
• Allows the user to input the fruit name and the number of kilograms they want to purchase,
  then calculates and prints the total price.
 */
import java.util.Scanner;

public class Grocery {
    public void displayfruits(String[] fruits, double[] prices) {
        System.out.println("available fruits to buy: ");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i] + "   $" + prices[i] + "/kg");
        }
    }

    public void total(String[] fruits, double[] prices) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choice of fruit: ");
        String fruitname = scanner.next();                //user input for fruit name

        System.out.println("enter qty/kg for chosen fruit: ");
        int qty = scanner.nextInt();        //user input for qty of chosen fruit

        for (int i = 0; i < 5; i++) {
            if (fruits[i].equals(fruitname)){
                double totalprice = prices[i] * qty ;
                System.out.println("Total price for "+ qty + "/kg " + fruitname + " is  $" + totalprice );
            }
        }
    }
}

