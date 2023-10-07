public class Practice_185 {
    public static void reverse(int a[]){
        int lp=0;
        int ep=a.length-1;
        while(lp<ep){
            int tmp=a[lp];
            a[lp]=a[ep];
            a[ep]=tmp;
            lp++;
            ep--;
        }
    }
    public static void circularReverse(int a[]){
        int tmp=a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=tmp;
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        reverse(a);
        circularReverse(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
