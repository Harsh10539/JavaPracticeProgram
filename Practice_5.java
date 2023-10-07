import java.util.Scanner;
public class Practice_5 {
    public static void isBinary(int num){
        int tmp=0,i=0,sum=0;
        while(num>0){
            tmp = num%10;
            sum = sum+tmp*(int)(Math.pow(2,i++));
            num=num/10;
        }
        System.out.println("Decimal Number = "+sum);
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to check");
            int num= kb.nextInt();
            isBinary(num);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
