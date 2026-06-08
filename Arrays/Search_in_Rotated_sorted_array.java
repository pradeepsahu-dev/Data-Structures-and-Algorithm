public class Search_in_Rotated_sorted_array {

    public static int rotated_sorted_Array(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(arr[low] <= arr[mid]){ // left part sorted
                if(target >= arr[low] && target < arr[mid]){   // target in left side
                    high = mid - 1;
                }else{
                    low = mid + 1; // target in right side
                }
            }else{  // right half is sorted
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1; 
                }
            }
    
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("Target at index : "+ rotated_sorted_Array(arr, target));
    }
    
}
  