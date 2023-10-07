public class Practice_117 {
    public static void rev(int a[],int si,int ei){
        while(si<ei){
            int tmp=a[ei];
            a[ei]=a[si];
            a[si]=tmp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        rev(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
