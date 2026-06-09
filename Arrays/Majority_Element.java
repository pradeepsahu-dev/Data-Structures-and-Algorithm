public class Majority_Element {

    public static int majorityElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 1;
            int val = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            } 

            if(count > arr.length/2){
                return arr[val];

            }
            
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] = {2,1,1,1,1,2,5};
        System.out.println(majorityElement(arr));
    }
    
}
