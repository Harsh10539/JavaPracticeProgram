//Max Subarray Sum(Brute Force)
import java.util.Scanner;
public class Practice_44 {
    public static void isMaxSubArray(int arr[], int size){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(max<sum){
                        max=sum;
                    }
                }
            }
        }
        System.out.println("Maximum Sum of Sub Array = "+max);
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
            isMaxSubArray(arr, size);
            System.out.println("\nIf you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
