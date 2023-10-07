import java.util.*;
public class Practice_50 {
    public static boolean twiceAppear(int arr[], int size){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<size;i++){
            if(set.contains(arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
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
