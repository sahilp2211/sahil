import java.util.Arrays;

public class ReverseArray {
        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
            swap(arr,0,9);
            System.out.println("given array: " + Arrays.toString(arr));
        }

        public static void swap(int[] arr, int index1, int index2){
            System.out.println("Given array: " + Arrays.toString(arr));
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            System.out.println("reverse array: " + Arrays.toString(arr));
        }
    }

