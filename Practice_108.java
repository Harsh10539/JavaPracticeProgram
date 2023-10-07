public class Practice_108 {
    public static boolean twice(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println(twice(arr));
    }
}
