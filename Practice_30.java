//Write a Java program to check if a number is a palindrome in Java?
import java.util.Scanner;
public class Practice_30 {
    public static boolean isPalindrome(int num){
        int rev=0,tmp=num;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        return ((tmp==rev)?true:false);
    }
    public static void main(String[] args){
        do{     
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to check");
            int num=kb.nextInt();
            boolean result=isPalindrome(num);
            if(result){
                System.out.println("Number is Palindrome");
            }
            else{
                System.out.println("Number is not Palindrome");
            }
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
            kb.close();
            System.exit(0);
        }
    }while(true);
    }
}
