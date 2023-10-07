import java.util.*;
public class Practice_140 {
    public static boolean pairsum(ArrayList<Integer> al, int tar){
        int lp=0;
        int rp=al.size()-1;
        while(lp!=rp){
            if(al.get(lp)+al.get(rp)==tar){
                return true;
            }else if(al.get(lp)+al.get(rp)<tar){
                lp++;
            }else{
                rp++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        System.out.println(pairsum(height,10));
    }
}
