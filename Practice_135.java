import java.util.*;
public class Practice_135 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++){
        list.add(i);
        }
int tmp=list.get(1);
list.set(1,list.get(5));
list.set(5, tmp);  
System.out.println(list);  
}
}
