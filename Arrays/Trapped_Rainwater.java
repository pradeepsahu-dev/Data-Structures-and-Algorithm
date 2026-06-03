import java.util.Arrays;


public class Trapped_Rainwater {

    public static void trappedRain_Water(int height[], int bar_Width){
        
        int n = height.length;

        // calculate left max

        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);

        }

        // calculate right max
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);

        }

         int trappedWater = 0;
         for(int i=0; i<=height.length-1; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater =  trappedWater + (waterLevel - height[i])*bar_Width;

         }
         System.out.println("Total Trapped Rainwater:" + trappedWater);

    }
    public static void main(String[]args){
        int height[] = {4,2,0,6,3,2,5}; 
        int bar_Width = 1;
        trappedRain_Water(height, bar_Width);
    }
    
}
