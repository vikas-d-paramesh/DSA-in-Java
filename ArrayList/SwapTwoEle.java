import java.util.ArrayList;

public class SwapTwoEle{
    public static void swapEle(ArrayList<Integer> list,int i1,int i2){
        int ele1=list.get(i1);
        int ele2=list.get(i2);
        list.set(i1,ele2);
        list.set(i2,ele1);
    }
    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        swapEle(list, 1, 3);
        System.out.println(list);
    }
}