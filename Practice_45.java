//Max Subarray Sum (Prefix Sum)
import java.util.Scanner;
public class Practice_45 {
    public static void isMaxSubArray(int arr[], int size){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[size];
        prefix[0]=arr[0];
        for(int i=1;i<size;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                currSum=(i==0?prefix[j]:prefix[j]-prefix[i]);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum Sum = "+maxSum);
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
