public class Practice_102 {
    public static void main(String[] args){
        System.out.println(tP(4));
    }
    public static int tP(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fn1=tP(n-1);
        int fn2=tP(n-2);
        int fn=fn1+fn2;
        return fn;
    }
}
