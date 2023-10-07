public class Practice_105 {
    static String d[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void eng(int n){
        if(n==0){
            return;
        }
        int id=n%10;
        eng(n/10);
        System.out.print(d[id]+" ");
    }
    public static void main(String[] args){
        int n=1997;
        eng(n);
    }
}
