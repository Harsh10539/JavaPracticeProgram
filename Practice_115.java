public class Practice_115 {
    public static int lA(int n[]){
        int key=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            key=Math.max(key, n[i]);
        }
        return key;
    }
    public static void main(String[] args){
        int n[]={2,6,8,3,7,4,1};
        System.out.println(lA(n));
    }
}
