//Bubble Sort
import java.util.Scanner;
public class Practice_52 {
    public static void bubbleSort(int arr[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                int tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
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
            bubbleSort(arr, size);
            System.out.println("\nIf you want to close the program then press 0 otherwise press any key");
            if(kb.nextInt()==0){
                kb.close();
            }
        }while(true);
    }    
}
