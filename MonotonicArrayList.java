import java.util.ArrayList;

public class MonotonicArrayList {
    public static boolean monotonicArrayList(ArrayList <Integer> list){
        boolean istrue=true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                istrue= true;
            }
            else{
                istrue=false;
                break;
            }
        }
        if(!istrue){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<=list.get(i+1)){
                istrue= true;
            }
            else{
                istrue=false;
                break;
            }
        }
    }
        return istrue;
    }

    public static void main(String args[]){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        System.out.println(monotonicArrayList(list));
    }
}
