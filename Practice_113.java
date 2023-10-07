public class Practice_113 {
    public static void main(String[] args){
        int a[]={4,5,6,7,0,1,2};
        System.out.println(sA(a,0,0,a.length-1));
    }
    public static int sA(int a[],int target, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(a[mid]==target){
            return mid;
        }
        if(a[si]<=a[mid]){
            if(a[si]<=target&&target<=a[mid]){
                return sA(a,target,si,mid-1);
            }else{
                return sA(a,target,mid+1,ei);
            }
        }else{
            if(a[mid]<=target&&target<=a[ei]){
                return sA(a,target,mid+1,ei);
            }else{
                return sA(a,target,si,mid-1);
            }
        }
    }
}
