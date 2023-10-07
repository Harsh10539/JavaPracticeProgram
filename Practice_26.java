//Binary to decimal
import java.util.Scanner;
public class Practice_26 {
    public static int isBinary(int bin){
        int dec=0,i=0;
        while(bin>0){
            dec=dec+(bin%10)*((int)Math.pow(2,i++));
            bin/=10;
        }
        return dec;
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the Binary number which you want to change to Decimal");
            int bin=kb.nextInt();
            int dec=isBinary(bin);
            System.out.println("Binary Number = "+dec);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
