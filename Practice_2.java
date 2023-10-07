import java.util.Scanner;
public class Practice_2{
    public static int fact(int num){
    int fact=1;
    for(int i=1;i<=num;i++){
            fact=fact*i;
    }
    return fact;
}
    public static void main(String[] args){
        do{
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number Which you want to check");
        int num = kb.nextInt();
        int fac = fact(num);
        System.out.println("Factorial Number = "+fac);
        kb.close();
        }while(true);
        
    }
}