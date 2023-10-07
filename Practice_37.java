//Linear Search for int
import java.util.Scanner;
public class Practice_37 {
    public static boolean linearSearch(int arr[],int size, int key){
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=kb.nextInt();
        System.out.println("Enter the elements of the Array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=kb.nextInt();
        }
        System.out.println("Enter the key which you want to find");
        int key=kb.nextInt();
        boolean flag=linearSearch(arr,size,key);
        if(flag){
            System.out.println("Number is found");
        }
        else{
            System.out.println("Number is not found");
        }
        kb.close();
    }
}
