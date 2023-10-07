public class Practice_122 {
    public static int cE(int a[]){
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>a.length/2){
                return count;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int a[]={1,3,3,1,1,1};
        System.out.println(cE(a));
    }
}
