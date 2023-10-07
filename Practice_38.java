//Linear Search for String
import java.util.Scanner;
public class Practice_38 {
    public static boolean linearSearch(String arr[],int size, String key){
        for(int i=0;i<size;i++){
            if(arr[i].equals(key)){
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
        String arr[]=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=kb.next();
        }
        System.out.println("Enter the String which you want to find");
        String key=kb.next();
        boolean flag=linearSearch(arr,size,key);
        if(flag){
            System.out.println("Name is found");
        }
        else{
            System.out.println("Name is not found");
        }
        kb.close();
    }
}
