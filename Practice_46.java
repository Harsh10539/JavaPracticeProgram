//Max Subarray Kadane Algorithm
import java.util.Scanner;
public class Practice_46 {
    public static void isMaxSubArray(int arr[], int size){
        int ms = Integer.MIN_VALUE;
        int cs=0;
        int tmp=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            cs = cs + arr[i];
            if(cs<0){
                cs=0;
            }
            if(arr[i]<0){
                tmp++;
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            ms=Math.max(cs,ms);
        }
        if(tmp==size){
            System.out.println("Maximum Sum ="+max);
        }else{
        System.out.println("Maximum Sum = "+ms);
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
            isMaxSubArray(arr, size);
            System.out.println("\nIf you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
