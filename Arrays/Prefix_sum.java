public class Prefix_sum {

    public static void PrefixSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];
        
        //calculate Prefix sum
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];

        }
         
        for(int i=0; i<=arr.length-1; i++){
            int start = i;
            for(int j=i; j<=arr.length-1; j++){
                int end = j;
                    //calculate sum
                    currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        
        }
        System.out.println("Max Sum = "+ maxSum);
    
    }
    public static void main(String[]args){
        int arr[] = {2,4,6,8};
        PrefixSum(arr);

       
    
    }
    
}
