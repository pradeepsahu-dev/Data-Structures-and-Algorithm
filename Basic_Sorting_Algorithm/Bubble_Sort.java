public class Bubble_Sort {

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;  // to check if any swap happend in this pass

            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;    // means swapping happend
                }
            }
            if(swapped == false){
                break;
            }
        }
        
    }

    public static void Printarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[]args){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        Printarray(arr);
    }
    
}
