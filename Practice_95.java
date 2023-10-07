public class Practice_95 {
    public static void iO(int n){
        if(n==10){
            System.out.println(n);
        }else{
            System.out.print(n+" ");
            iO(n+1);
        }
    }
    public static void main(String[] args){
        int n=1;
        iO(n);
    }
}
