import java.util.Scanner;
public class Practice_6 {
    public static void isBinary(int num){
        int tmp,i=0,rev=0;
        while(num>0){
            tmp=num%2;
            rev=rev+tmp*(int)(Math.pow(10,i++));
            num=num/2;
        }
        System.out.println("Decimal Number = "+rev);
    }
   public static void main(String[] args){
    do{
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the decimal number which you want ot convert");
        int decimalNum = kb.nextInt();
        isBinary(decimalNum);
        System.out.println("If you want to close the program. Press 0 otherwise Press any key");
        if(kb.nextInt()==0){
            kb.close();
            System.exit(0);
        }
    }while(true);
   } 
}
