

public class DESCENDINGorder {
    public static void bubbleSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int swap=0;
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }

            }
            if(swap==0){
                break;
            }
        }
    }

     public static void selectionSort(int arr[]) {
    for(int i = 0; i < arr.length - 1; i++) {
        int maxPost = i;

        for(int j = i + 1; j < arr.length; j++) {
            if(arr[maxPost] < arr[j]) {
                maxPost = j;
            }
        }

        int temp = arr[maxPost];
        arr[maxPost] = arr[i];
        arr[i] = temp;
    }
}

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
        for(int i=count.length-1;i>0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
     public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }


        CountingSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        
    }
}
