//Array -> Max Subarray Sum (Brute Force)
public class Practice_67 {
    public static void max(int a[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+a[k];
                    if(sum>max){
                        max=sum;
                    }
                }
            }
        }
        System.out.println("Max subarray = "+max);

    }
    public static void main(String[] args){
        int a[]={1,-2,6,-1,3};
        max(a); 
    }
}
