class InsertionSort {
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {

            int current = arr[i];   // store value
            int pre = i - 1;

            while(pre >= 0 && arr[pre] > current) {
                arr[pre + 1] = arr[pre];
                pre--;
            }

            arr[pre + 1] = current; // insert value
        }
    }

    public static void main(String args[]) {
        int arr[] = {2,3,4,1,5};
        insertionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
