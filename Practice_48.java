//Buy & Sell Stock
import java.util.Scanner;
public class Practice_48 {
    public static int sellStock(int arr[],int size){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<size;i++){
            if(buyPrice<arr[i]){
                int profit = arr[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice=arr[i];
            }
        }
        return maxProfit;
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
            int profit = sellStock(arr, size);
            System.out.println("profit = "+profit);
            System.out.println("If you want to close this Program then press 0 otherwise press any key");
            if(kb.nextInt ()==0){
                kb.close();
            }
        }while(true);
    }
}
