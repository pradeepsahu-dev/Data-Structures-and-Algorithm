public class binarySearch {

    public static int binary_Search(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;     // calculate  mid
            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
     return -1;
    }

    public static void main(String[]args){
        int arr[] = {2,4,6,8,10,12};
        int key = 10;

        System.out.println( "Key is index at:" + binary_Search(arr, key));
    }
    
}
