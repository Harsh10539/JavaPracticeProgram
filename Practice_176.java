import java.util.*;
public class Practice_176 {
    public static void main(String[] args){
        int A[]={1,2,3};
        int B[]={3,2,1};
        int ans=0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++){
            ans+=Math.abs(A[i]-B[i]);
        }
        System.out.println(ans);
    }
}
