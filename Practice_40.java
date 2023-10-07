//Binary Search
import java.util.Scanner;
public class Practice_40 {
    public static boolean isBinarySearch(int arr[], int size, int key){
        int start=0,end=(size-1);
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid]>key){
                end=mid-1;
                }
            else{
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the size of Array");
            int size=kb.nextInt();
            System.out.println("Enter the elements of the Array");
            int arr[] = new int[size];
            for(int i=0;i<size;i++){
                arr[i]=kb.nextInt();
            }
            System.out.println("Enter the number which you want to search");
            int key=kb.nextInt();
            boolean flag = isBinarySearch(arr,size,key);
            if(flag){
                System.out.println("Number is found");
            }
            else{
                System.out.println("Number is not found");
            }
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
