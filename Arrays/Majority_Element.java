// pair sum
//(Return pair in sorted array with target sum)

public class Majority_Element {
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
        int arr[] = {1,2,7,9};
        int target = 9;
        Pair_Sum(arr, target);
    }
}
