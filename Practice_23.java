public class Practice_23 {
    public static void main(String[] args){
        int n=5,a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(((a++)%2==0)?"0":"1");
            }
            System.out.println();
        }
    }
}
