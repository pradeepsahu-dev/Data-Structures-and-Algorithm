import java.util.Arrays;


public class Trapped_Rainwater {

    public static void trappedWater(int height[]){
        int n = height.length;

        // calculate left max

        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);

        }
         System.out.println(Arrays.toString(leftMax));

        // calculate right max
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);

        }
         System.out.println(Arrays.toString(rightMax));
    }
    public static void main(String[]args){
        int height[] = {4,2,0,6,3,2,5}; 
        trappedWater(height);
    }
    
}
