import java.util.Scanner;
public class Practice_4 {
    public static void isPrimeRange(int range){
        for(int i=2;i<=range;i++){
            boolean bool=isPrime(i);
            if(bool){
                System.out.println(i+" is Prime");
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
            System.out.println("enter the range limit which you want to check");
            int range=kb.nextInt();
            isPrimeRange(range);
            kb.close();   
        }while(true);
    }
}
