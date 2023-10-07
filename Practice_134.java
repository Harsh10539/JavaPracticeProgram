import java.util.*;
public class Practice_134 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++){
        list.add(i);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }
}
