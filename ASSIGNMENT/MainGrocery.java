package ASSIGNMENT;
/*
3. Grocery Store Price Calculator
You are working at a grocery store that offers 5 different fruits. Create a Java program that:
• Uses two arrays: one for storing the names of fruits and another for storing their prices per kilogram.
• Allows the user to input the fruit name and the number of kilograms they want to purchase,
  then calculates and prints the total price.
 */
public class MainGrocery {
    public static void main(String[] args) {

        String[] fruits = {"apple","banana","grapes","orange","cherry"}; //array of 5 fruits
        double[] prices = {10, 5.9, 7.4, 8.5, 6}; //array of price for fruits/kg

        Grocery grocery = new Grocery();
        grocery.displayfruits(fruits,prices);  //calling method to show fruits
        grocery.total(fruits,prices);

        System.out.println();
        System.out.println("Thank you !!");
    }
}
