import java.util.HashMap;

public class Majority_Element {

    //optimized 
    public static int MajorityElement(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);

            }else{
                map.put(num,1);
            }
        }
        // majority check

        for(int num : arr){
            if(map.get(num) > arr.length/2){
                return num;
            }
        }
        return -1;
   
    }
   



    // Brute force appoach
    public static int majorityElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            } 

            if(count > arr.length/2){
                return arr[i];

            }
            
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(MajorityElement(arr));
    }
    
}
