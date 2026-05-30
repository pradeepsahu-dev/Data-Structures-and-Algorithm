import java.util.Scanner;

public class Largest_number {

    public static int largest_nums(int arr[]){
        int largest = Integer.MIN_VALUE;  // - Infinity
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];             // find Max number in given Array
            }

        }
        return largest;
    }

    public static void main(String[]args){
        int arr[] = {3,5,9,7,30,80};
        System.out.println("Lartest is :"+largest_nums(arr));
    }
    
}
