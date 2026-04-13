import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSum2(ArrayList<Integer> arr, int target){

        int n = arr.size();

        int rp = 0, lp = 0;

        for(int i = 0; i < arr.size()-1; i++){

            if(arr.get(i) > arr.get(i+1)){

                rp = i;
                lp = i+1;

                System.out.println(rp + " " + lp);

                break;
            }
        }

        while(lp != rp){

            if((arr.get(rp) + arr.get(lp)) == target){
                return true;
            }

            if((arr.get(rp) + arr.get(lp)) > target){

                rp = (n + rp - 1) % n;

            }
            else{

                lp = (lp + 1) % n;
            }
        }

        return false;
    }

    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        System.out.println(pairSum2(arr, 15));
    }
}