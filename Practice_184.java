public class Practice_184 {
    public static boolean binary(int a[],int key){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==key){
                return true;
            }
            else if(a[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int a[]={1,7,4,8,5};
        int key=4;
        System.out.println(binary(a,key));
    }
}
