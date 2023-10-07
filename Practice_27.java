//Decimal To Binary
import java.util.Scanner;
public class Practice_27 {
    public static int isDecimal(int dec){
        int bin=0,i=0;
        while(dec>0){
            bin=bin+(dec%2)*(int)Math.pow(10,i++);
            dec/=2;
        }
        return bin;
    }
    public static void main(String[] args){
         do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the decimal number which you want to convert to the binary number");
            int dec=kb.nextInt();
            int bin=isDecimal(dec);
            System.out.println("Binary Number = "+bin);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
         }while(true);
    }
}
