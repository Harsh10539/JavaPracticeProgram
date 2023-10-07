public class Practice_118 {
    public static void main(String[] args){
        int a[]={2,4,6,8,10};
        pair(a);
    }
    public static void pair(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
}
