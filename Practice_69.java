public class Practice_69 {
    public static void iS(int a[]){
        for(int i=1;i<a.length;i++){
            int cur=i;
            int pre=i-1;
            while(pre >=0 && a[pre] > cur){
                a[pre+1]=a[pre];
                pre--;
            }
            a[pre+1]=cur;
        }
    }
    public static void main(String[] args){
        int a[]={5,4,1,3,2};
        iS(a);
        for(int i:a){
            System.out.println(i);
        }
    }
}
