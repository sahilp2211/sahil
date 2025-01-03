package ASSIGNMENT;
/*
5. Customer Feedback System: A restaurant collects feedback from customers.
 Create a Java program that stores customer reviews (up to 5) in an array. Write functions that:
• Displays all customer reviews.
• Allows the user to search for specific words in the reviews and returns reviews that match.
 */

import java.util.Scanner;

public class CustomerFeedback {
    public static void main(String[] args) {
        String[] feedback = {"Service is too slow","Food is ok", "Food and ambiance is average", "Taste is too good", "Must visit"};
        String[] rating = {"1", "2", "3", "4", "5"};

        CustomerFeedback review = new CustomerFeedback();
        review.showRatings();
        review.searchReview();
    }

    public void showRatings() {
        String[] feedback = {"Service is too slow","Food is ok", "Food and ambiance is average", "Taste is too good", "Must visit"};
        String[] rating = {"1", "2", "3", "4", "5"};
        System.out.println("Ratings and review for the Restaurant: ");
        for (int i = 0; i < rating.length; i++) {
            System.out.println(rating[i] + "-" + feedback[i]);  //display rating and review
        }
    }

    public void searchReview(){
        String[] feedback = {"Service is too slow","Food is ok", "Food and ambiance is average", "Taste is very good", "Must visit"};
        String[] rating = {"1", "2", "3", "4", "5"};
        System.out.println();
        System.out.println("Check review by key word");
        System.out.println("Enter keyword");
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.next();
        for (int i = 0; i < feedback.length; i++) {
            if(feedback[i].contains(keyword)){
                System.out.println(rating[i] +"-" +feedback[i]);
                return;
            }
        }
        System.out.println("choose different keyword");
    }
}
