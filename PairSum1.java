import java.util.ArrayList;

public class PairSum1 {

    public static ArrayList<Integer> pairSum(ArrayList<Integer> arr, int target){

        int lp = 0;
        int rp = arr.size()-1;

        ArrayList<Integer> newArr = new ArrayList<>();

        while(lp < rp){

            if((arr.get(lp) + arr.get(rp)) == target){

                newArr.add(lp);
                newArr.add(rp);
                return newArr;
            }

            if(arr.get(rp) >= target){
                rp--;
            }
            else{
                lp++;
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