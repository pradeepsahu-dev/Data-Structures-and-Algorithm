// Find linear Search 

public class linear_Search {

    public static int Linear_Search(int number[], int key){
        for(int i=0; i<=number.length; i++){
            if(number[i]==key){
                return i;
                
            }

        }
        return -1;
    }

   

    public static void main(String[]args){

      
        int number[] = {2,5,8,4,7,3,8,2};
        int key = 3;
        
        int index = Linear_Search(number, key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("key is at index:" + index);
        }
    }
    
}
