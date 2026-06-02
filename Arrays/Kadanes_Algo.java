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
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(arr);
    }
    
}
