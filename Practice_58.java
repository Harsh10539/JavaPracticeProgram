//Floyd's Triangle
public class Practice_58 {
    public static void pettern(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++,num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pettern(5);
    }
}
