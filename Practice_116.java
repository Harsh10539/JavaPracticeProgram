public class Practice_116 {
    public static Boolean bS(int a[],int key,int si,int ei){
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(a[mid]==key){
                return true;
            }
            else if(a[mid]>key){
                ei=mid-1;
            }else{
                si=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(bS(a,1,0,a.length-1));
    }
}
