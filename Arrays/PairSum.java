import java.util.Arrays;
// pair sum
//(Return pair in sorted array with target sum)

public class PairSum {

    // Optimized approach
     public static int[] pairSum(int arr[], int target){
        int i = 0; 
        int j = arr.length-1;
        while(i < j){
            int ps = arr[i] + arr[j];

            if(ps == target){
                return new int[]{i,j};
            }else if(ps > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {-1,-1};
    }



    // brute force method
    public static void Pair_Sum(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
        

    }
    public static void main (String[]args){
        int arr[] = {2,7,11,15};
        int target = 9;
        int result[] = pairSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
