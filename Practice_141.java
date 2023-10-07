import java.util.*;
public class Practice_141 {
    public static boolean pairSum(ArrayList<Integer> al,int tar){
        int n=al.size();
        int bp=-1;
        for(int i=0;i<al.size();i++){
            if(al.get(i)>al.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            if(al.get(lp)+al.get(rp)==tar){
                return true;
            }else if(al.get(lp)+al.get(rp)<tar){
               lp=(lp+1)%n; 
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        System.out.println(pairSum(height,16));
    }
}
