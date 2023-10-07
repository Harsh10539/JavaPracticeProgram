public class Practice_99 {
    public static boolean sA(int[] n,int i){
        if(i==n.length-1){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return sA(n,i+1);
    }
    public static void main(String[] args){
        int n[]={'1','2','3','4','5'};
        System.out.println(sA(n,0));
    }    
}
