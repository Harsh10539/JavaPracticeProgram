//Array - Binary Search
import java.util.*;
public class Practice_63 {
    public static int binarySearch(int arr[],int n, int key){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = kb.nextInt();
        System.out.println("Enter the elements of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }
        System.out.println("Enter the key which you want to found");
        int key=kb.nextInt();
        System.out.println(binarySearch(arr, n, key));
        kb.close();
    }
}
