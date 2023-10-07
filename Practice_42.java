//Pairs in Arrays
import java.util.Scanner;
public class Practice_42 { 
    public static void isPair(int arr[], int size){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
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
            isPair(arr, size);
            System.out.println("\nIf you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
