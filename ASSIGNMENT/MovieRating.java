package ASSIGNMENT;/*
6. Movie Rating System
You are managing a movie rating system where users rate movies. Write a Java program that:
• Stores the names of 5 movies in a string array and stores ratings (out of 5) in another array.
• Finds the movie with the highest rating and displays it to the user.
 */

import java.util.Arrays;

public class MovieRating {
    public static void main(String[] args) {

        String[] Movie = {"Spiderman", "Superman", "Antman", "Aqua man", "Batman"};
        double[] Ratings = {4.7, 4.5, 4, 3.5, 3.9};

        MovieRating rating = new MovieRating();
        System.out.println("Movies: " + Arrays.toString(Movie));
        rating.maxrating();
        rating.minrating();

    }


    String[] Movie = {"Spiderman", "Superman", "Antman", "Aqua man", "Batman"};
    double[] Ratings = {4.7, 4.5, 4, 3.5, 3.9};

    public void maxrating(){

        double max =Ratings[4];
        for (int i = 0; i < Ratings.length; i++) {
            if(Ratings[i]>max){
                max = Ratings[i];
                System.out.println();
                System.out.println("Max is "+ Movie[i]+" "+ max);
            }
        }
    }

    public void minrating() {

        double min = Ratings[4];
        for (int i = 0; i < Ratings.length; i++) {
            if (Ratings[i] < min) {
                min = Ratings[i];

                System.out.println();
                System.out.println("Min is " + Movie[i] + " " + min);
            }
        }
    }
}
