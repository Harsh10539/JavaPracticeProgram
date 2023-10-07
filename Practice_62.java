//Largest in Array
import java.util.*;
public class Practice_62 {
    public static int isMaximum(int arr[],int size){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int isMinimum(int arr[],int size){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=kb.nextInt();
        System.out.println("Enter the elements of the Array");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=kb.nextInt();
        }
        int min=isMinimum(arr,size);
        int max=isMaximum(arr, size);
        System.out.println("Minimum Number of the Array = "+ min);
        System.out.println("Maximum Number of the Array = "+ max);
        kb.close();
    }
}
