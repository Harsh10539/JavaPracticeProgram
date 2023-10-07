//Write a Java method to compute the sum of the digits in an integer
import java.util.Scanner;
public class Practice_31 {
    public static int isSum(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        do{     
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to check");
            int num=kb.nextInt();
            int result=isSum(num);
            System.out.println("Result = "+result);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
            kb.close();
            System.exit(0);
        }
    }while(true);
    }
}
