public class Practice_98 {
    public static int fB(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn1=fB(n-1);
        int fn2=fB(n-2);
        int fib=fn1+fn2;
        return fib;
    }
    public static void main(String[] args){
        int n=8;
        System.out.println(fB(n));
    }
}
