import java.util.*;
public class Practice_143 {
    public static int mF(ArrayList<Integer> list,int key){
        int result[]=new int[1000];
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                result[list.get(i+1)-1]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<1000;i++){
            if(result[i]>max){
                max=result[i];
                ans=i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(100);
        height.add(200);
        height.add(1);
        height.add(100);
        System.out.println(mF(height,1));
    }
}
