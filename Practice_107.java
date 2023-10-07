public class Practice_107 {
    public static int tW(int arr[]){
        int result=0;
        int lA[]=new int[arr.length];
        lA[0]=arr[0];
        for(int i=1;i<lA.length;i++){
            lA[i]=Math.max(arr[i],lA[i-1]);
        }
        int rA[]=new int[arr.length];
        rA[arr.length-1]=arr[arr.length-1];
        for(int i=rA.length-2;i>=0;i--){
            rA[i]=Math.max(arr[i],rA[i+1]);
        }
        for(int i=0;i<arr.length;i++){
            int wL=Math.min(lA[i],rA[i]);
            result=result+wL-arr[i];
        }
        return result;
    }
    public static void main(String[] args){
        int arr[]={4,2,0,3,2,5};
        System.out.println(tW(arr));
    }
}
