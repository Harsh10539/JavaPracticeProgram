public class Practice_101 {
    public static int lastOccint (int n[],int i,int key){
        if(i==n.length){
            return -1;
        }
        int isF=lastOccint(n, i+1, key);
        if(isF==-1 && key == n[i]){
            return i;
        }
        return isF;
    }
    public static void main(String[] args){
        int arr[]={'1','2','3','4','5','6','7','8','6'};
        int key=6;
        System.out.println(lastOccint(arr,0,key));
    }
}
