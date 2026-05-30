import java.util.Scanner;

public class smallest_Number {

    public static int smallest_nums(int arr[]){
        int smallest = Integer.MAX_VALUE;         // show + Infinity
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];               // smallest number

            }
        }
        return smallest;
    }
    public static void main(String[]args){
        int arr[] = {3,6,8,1,4,0};
        System.out.println("Smallest number is :" + smallest_nums(arr));
    }
    
}
