import java.util.Arrays;

public class InbuiltFunctions {
    public static void main(String args[]){
        int arr[]={5,3,2,4,1};
        Arrays.sort(arr);
         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int arr_2[]={2,3,4,5,1};

        Arrays.sort(arr_2,1,4);

         for(int i = 0; i < arr_2.length; i++) {
            System.out.print(arr_2[i] + " ");
        }

        
    }
    
}
