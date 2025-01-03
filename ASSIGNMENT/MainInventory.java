package ASSIGNMENT;
/*
1. Product Inventory Management
#You are managing an inventory system for an online store.
-Create a Java program that uses an array to store the names of 5 products and
 another array to store their corresponding prices.    Write a function that:
• Displays all products with their prices.
• Allows the user to search for a product by name and retrieve its price.
 */
import java.util.Scanner;

public class MainInventory {
    public static void main(String[] args) {

        String[] products = {"Bottle", "Box", "Charger", "Cable", "Table"}; //array of products
        double[] prices = {30, 5.9, 20, 9.99, 45};  //array of price for products

        MainInventory inventory = new MainInventory();
        inventory.displayproducts(products, prices);
        inventory.searchproduct(products, prices);
    }


    public void displayproducts(String[] products, double[] prices) {
        System.out.println("Available products to buy: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(products[i] + " - $" + prices[i]);
        }
    }

    public void searchproduct(String[] products, double[] prices) {
        System.out.println();
        System.out.println("choose product to get price: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(products[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice for item: ");
        String itemname = scanner.next();
        for (int i = 0; i < 5; i++) {
            if (products[i].equals(itemname)) {
                System.out.println("Price for " + itemname + " is: $" + prices[i]);
            }
        }
    }
}
