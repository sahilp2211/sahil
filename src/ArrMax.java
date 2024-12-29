public class ArrMax {
    public static void main(String[] args) {

       /* int[] arr = { 100,120, 300, 40,50,160,370,180,190 }; //given numbers
        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);*/
        
        int[] arr = {10,20,30,40,532,365,236,268,157,964};
        int max = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]< max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
