//Inverted & Rotated Half Pyramid
public class Practice_56 {
    public static void pettern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        pettern(10);
    }
}
