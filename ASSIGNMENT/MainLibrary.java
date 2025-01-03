package ASSIGNMENT;
/*
2. Library Book Management: A library stores a list of book titles.
 Create a Java program that uses a string array to store 6 book titles. Write functions that:
• Searches for a specific book title entered by the user.
• Replaces a specific book title in the array if a user wants to update the library records.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        String[] Book = {"Dracula", "Twilight", "Watchman", "Madeline", "Beloved", "Dune"};

        MainLibrary library = new MainLibrary();
        library.displayBooks();
        library.searchBook();
        library.updateName();
        System.out.println(Arrays.toString(library.updateName()));
    }
    public void displayBooks(){
        String[] Book = {"Dracula", "Twilight", "Watchman", "Madeline", "Beloved", "Dune"};
        for (int i = 0; i < Book.length; i++) {
            System.out.println(Book[i]);
        }
    }
    public void searchBook() {
        String[] Book = {"Dracula", "Twilight", "Watchman", "Madeline", "Beloved", "Dune"};
        System.out.println("Enter title of book for availability: ");
        Scanner scanner = new Scanner(System.in);
        String Title = scanner.next();
        for (int i = 0; i < 6; i++) {
            if (Book[i].equals(Title)) {
                System.out.println(Title + " is available.");
            }
        }
    }

    public String[] updateName(){
        String[] Book = {"Dracula", "Twilight", "Watchman", "Madeline", "Beloved", "Dune"};
        System.out.println();
        System.out.println("Enter the title you want to update: ");
        Scanner scanner = new Scanner(System.in);
        String Title = scanner.next();
        System.out.println("update new title");
        String newTitle = scanner.next();

        for (int i = 0; i < 6; i++) {
            if(Book[i].equals(Title)){
                Book[i]=newTitle;
            }
        }
        return Book;
    }
}
