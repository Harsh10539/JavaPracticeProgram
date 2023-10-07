public class Practice_96 {
    public static int factNum(int n){
        if(n==0){
            return 1;
        }
        return n*factNum(n-1);
    
    }
    public static void main(String[] args){
        int num=5;
        System.out.println(factNum(num));
    }
}
