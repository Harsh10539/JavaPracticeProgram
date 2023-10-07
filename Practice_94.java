public class Practice_94 {
    public static int rec(int n){
        System.out.print(n+" ");
        if(n>0){
            return rec(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        int n=10;
        rec(n);
    }
}
