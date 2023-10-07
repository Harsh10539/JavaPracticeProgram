import java.util.Scanner;
public class Practice_3 {
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
            System.out.println("Enter the number which you want to check");
            int num = kb.nextInt();
            boolean result = isPrime(num);
            if(result){
                System.out.println("Number is Prime");
            }
            else{
                System.out.println("Number is Not Prime");
            }
            kb.close();
        }while(true);
    }
}
