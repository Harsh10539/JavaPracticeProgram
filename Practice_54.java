//Decimal to Binary
import java.util.*;
public class Practice_54 {
    public static int binaryNum(int dn){
        int bn=0,i=0;
        while(dn>0){
            bn+=(dn%2)*(int)(Math.pow(10,i++));
            dn/=2;
        }
        return bn;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        do{
            System.out.println("Enter the Decimal Number which you want to convert to the Binary................");
            int decimalNum=kb.nextInt();
            int binaryNum=binaryNum(decimalNum);
            System.out.println("Binary Number = "+binaryNum);
            System.out.println("If you want to close the program then Press 0 otherwise press any key");
            if(kb.nextInt()==0){
                kb.close();
            }
        }while(true);
    }
}
