//Array - Linear Search
import java.util.*;
public class Practice_61 {
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter the key which you want to find");
        int key=kb.nextInt();
        int result=linearSearch(arr,key);
        System.out.println(result);
        kb.close();
    }
}
