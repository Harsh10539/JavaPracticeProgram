import java.util.Scanner;
public class Practice_24 {
    public static void isPrime(int num){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to check");
            int num=kb.nextInt(); 
            isPrime(num);       
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
