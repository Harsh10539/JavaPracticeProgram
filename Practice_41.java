//Reverse the Array
import java.util.Scanner;
public class Practice_41 {
    public static int[] isReverse(int arr[], int size){
        int start=0,end=size-1;
        while(start<end){
            int tmp=arr[start];
            arr[start]=arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
        return arr;
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
            int result[]=new int[size];
            result=isReverse(arr,size);
            for(int i=0;i<size;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println("\nIf you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
