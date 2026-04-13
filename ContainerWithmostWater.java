import java.util.*;

public class ContainerWithmostWater {
    //  public int maxArea(int[] height) { timeXomplexity O(n)
    //     int lp=0;
    //     int rp=height.length-1;
    //     int max=0;
    //     while(lp<rp){
    //         int ht=Math.min(height[rp],height[lp]);
    //         int wt=rp-lp;
    //         int area=ht*wt;
    //         max=Math.max(max,area);
    //         if(height[lp]<height[rp]){
    //             lp++;
    //         }
    //         else{
    //             rp--;
    //         }

    //     }
    //     return max;
    // }
    public static int ocntainerWithmostWater(ArrayList<Integer> height){
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heigth=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int area=heigth*width;
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }

    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(ocntainerWithmostWater(height));
    }
    
}
