import java.util.*
;public class Practice_142 {
    public static boolean mono(ArrayList<Integer> al){
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)<al.get(i+1)){
                inc = false;
            }
            if(al.get(i)>al.get(i+1)){
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(2);
        height.add(3);
        System.out.println(mono(height));
    }
}
