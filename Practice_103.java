public class Practice_103 {
    public static int fP(int n){
        if(n==1 || n==2){
            return n;
        }
        return fP(n-1)+(n-1)*fP(n-1);
    }
    public static void main(String [] args){
        System.out.println(fP(3));
    }
}
