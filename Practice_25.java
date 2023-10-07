//Prime in range
import java.util.Scanner;
public class Practice_25 {
    public static void isPrimeRange(int start, int end){
        for(int i=start;i<=end;i++){
            boolean flag=isPrime(i);
            if(flag){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int num){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the range which you want to check");
            int start=kb.nextInt();
            int end=kb.nextInt();
            isPrimeRange(start, end);
            System.out.println("\nIf you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
