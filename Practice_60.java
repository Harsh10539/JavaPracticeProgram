//Array
import java.util.*;
public class Practice_60 {
    public static void passingArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the Array limit");
        int n=kb.nextInt();
        System.out.println("Enter the Array limit");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }
        passingArray(arr);
        System.out.println("After method call");
        for(int i:arr){
            System.out.println(i);
        }
        kb.close();
    }
}
