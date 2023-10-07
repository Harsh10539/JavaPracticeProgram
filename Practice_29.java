//Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
import java.util.Scanner;
public class Practice_29 {
    public static boolean isEven(int num){
        return ((num%2==0)?true:false);
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to check");
            int num=kb.nextInt();
            boolean result=isEven(num);
            if(result){
                System.out.println("Number is Even");
            }
            else{
                System.out.println("Number is Odd");
            }
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
