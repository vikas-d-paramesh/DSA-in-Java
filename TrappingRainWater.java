import java.math.*;

public class TrappingRainWater {
    public static int TrappedWater(int arr[]){
        int n=arr.length;

        int leftmax[]=new int[n];
        leftmax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(arr[i],leftmax[i-1]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }

        //To calculate the Trapped water 
        int TrappedH2o=0;

        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            TrappedH2o += waterlevel-arr[i];

            
        }
        return TrappedH2o;
    }
    
    public static void main(String args[]){
        int arr[]={2,3,4,5,2};

        int H2o=TrappedWater(arr);

        System.out.println("Trapped Water: "+H2o);

    }
}
