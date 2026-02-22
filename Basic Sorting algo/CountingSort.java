
public class CountingSort {

    public static void CountingSort(int arr[]){
        int n=arr.length;
        System.out.println(n);

        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {2,3,4,2,1,2,3,4,2,4,5};
        CountingSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }


    
}
