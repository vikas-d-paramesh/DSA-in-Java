import java.util.ArrayList;

public class PairSum {

    public static ArrayList<Integer> pairSum(ArrayList<Integer> arr, int target){

        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){

            for(int j = i+1; j < arr.size(); j++){

                if((arr.get(i) + arr.get(j)) == target){

                    newArr.add(arr.get(i));
                    newArr.add(arr.get(j));
                    return newArr;
                }
            }
        }

        return newArr;
    }

    public static void print(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        print(pairSum(arr,5));
    }
}