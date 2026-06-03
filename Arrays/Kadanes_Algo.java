public class Kadanes_Algo {

    public static void kadane(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<=arr.length-1; i++){

            currSum += arr[i];
        
            maxSum = Math.max(currSum , maxSum);

             if(currSum < 0){
                currSum = 0;
            }

        }
        System.out.println("Max Subarray sum is:"+maxSum);

    }

    public static void main(String[]args){
        int arr[] = {-3,7,-4,-2,-7,6,8-2};
        kadane(arr);
    }
    
}
