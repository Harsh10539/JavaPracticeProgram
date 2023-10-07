public class Practice_119 {
    public static void main(String[] args){
        int a[] ={2,4,6,8,10};
        sub(a);
    }
    public static void sub(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }
    }
}
