public class Practice_123 {
    private static int cIR(int[] nums,int num,int lo,int hi){
        int count=0;
        for(int i=lo;i<=hi;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }
    private static int mER(int[] nums,int lo,int hi){
        if(lo==hi){
            return nums[lo];
        }
        int mid=lo+(hi-lo)/2;
        int left=mER(nums,lo,mid);
        int right=mER(nums, mid+1, hi);
        if(left==right){
            return left;
        }
        int leftCount=cIR(nums, left, lo, hi);
        int rightCount=cIR(nums, right, lo, hi);
        return leftCount>rightCount?left:right;
    }
    public static void main(String[] args){
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(mER(nums, 0, nums.length-1));
    }
}
