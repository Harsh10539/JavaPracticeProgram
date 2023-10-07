//Trapped water Program
import java.util.Scanner;
public class Practice_47 {
    public static int trappedWater(int arr[],int size){
        //Left Max Logic
        int leftMax[] = new int[size];
        leftMax[0]=arr[0];
        for(int i=1;i<size;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        //Right Max Logic
        int rightMax[] = new int[size];
        rightMax[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i=0;i<size;i++){
            // WaterLevel= min(leftmax bound, rightmax bound)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //trapped water = water level - height[i]
            trappedWater+=waterLevel-arr[i];
        }
        return trappedWater;
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
            int result=trappedWater(arr,size);
            System.out.println("Result = "+result);
            System.out.println("If you want to close to this program. Press 0 otherwise press any key");
            if(kb.nextInt()==0){
                kb.close();
            }
        }while(true);
    }
}
