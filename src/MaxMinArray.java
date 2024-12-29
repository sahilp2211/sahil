public class MaxMinArray {

    public int findMaxElement(int[]arr){
        int max = arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max);{
                max = arr[i];
            }
        }
        return max;
    }

    public int findMinElement(int[]arr){
        int min = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}
