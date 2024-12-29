import java.util.Scanner;

public class MainMaxminElement {
    public static void main(String[] args) {

        int[] arr= {10,20,30,40,50,15,26,35,65};

        MaxMinArray MaxMinArray = new MaxMinArray();
        int maxElement = MaxMinArray.findMaxElement(arr);
        int minElement = MaxMinArray.findMinElement(arr);

        System.out.println("Max is: " + maxElement);
        System.out.println("Min is: " + minElement);
    }
}
