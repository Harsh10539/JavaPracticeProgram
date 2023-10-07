import java.util.*;
public class Practice_136 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=10;i>=0;i--){
        list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
