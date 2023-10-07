//Reverse Array
import java.util.Scanner;
public class Practice_64 {
    public static void reverseArray(int arr[],int n){
        int start = 0,end=n-1;
        while(start < end){
            int tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }

    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of the Array.......");
        int n=kb.nextInt();
        System.out.println("Enter rhe elemets of the Array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=kb.nextInt();
        }
        reverseArray(arr, n);
        for(int i:arr){
            System.out.println(i);
        }
        kb.close();
    }
}
