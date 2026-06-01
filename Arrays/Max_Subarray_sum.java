public class Max_Subarray_sum {

    public static void MaxSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<=arr.length-1; i++){
            for(int j=i; j<=arr.length-1; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){

                    //Sum of SubArray
                    currSum += arr[k];
                }
                System.out.print(currSum+" ");
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
            
        }
         System.out.println("MaxSubArraySum: "+maxSum);

    }

    public static void main(String[]args){
        int arr[] = {2,4,6,8};
        MaxSum(arr);
    }
    
}
