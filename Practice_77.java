public class Practice_77 {
    public static String eO(int n){
        return ((n&1)==1?"Odd":"Even");
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(eO(n));
    }
}
