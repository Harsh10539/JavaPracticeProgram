import java.util.*;
public class Practice_137 {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mL=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        ArrayList<Integer> l3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);
        }
        mL.add(l1);
        mL.add(l2);
        mL.add(l3);
        for(int i=0;i<mL.size();i++){
            ArrayList<Integer> currList=mL.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
    }
    System.out.println(mL);
    }
}
