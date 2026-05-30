public class Pairs_of_Array {

    public static void pair_in_Array(int arr[]){
        int totalaPair = 0;
        for(int i=0; i<=arr.length-1; i++){
            int curr = arr[i];
            for(int j=i+1; j<=arr.length-1; j++){
                System.out.print("("+curr+","+arr[j]+")"+" ");
                totalaPair++;
            }
            System.out.println();
        }
          System.out.println("Total pairs is:"+totalaPair);

    }
    public static void main(String[]args){
        int arr[] = {2,4,6,8,12};
        pair_in_Array(arr);
    }
    
}
