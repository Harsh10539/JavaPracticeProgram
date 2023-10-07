//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
import java.util.Scanner;
public class Practice_49 {
    public static boolean twiceAppear(int arr[], int size){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the size of the Array");
            int size = kb.nextInt();
            System.out.println("Enter the elements of the Array");
            int arr[] = new int[size];
            for(int i=0;i<size;i++){
                arr[i]=kb.nextInt();
            }
            boolean flag=twiceAppear(arr, size);
            System.out.println(flag);
            System.out.println("If you want to close the program then press 0 otherwise press any key");
            if(kb.nextInt()==0){
                kb.close();
            }
        }while(true);
    }
}
