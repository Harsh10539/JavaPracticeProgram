public class Practice_68 {
    public static void bS(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i:a){ 
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int a[]={5,4,1,3,2};
        bS(a);
    }
}
