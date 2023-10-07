//Binary to Decimal
import java.util.*;
public class Practice_53 {
    public static int decimalNum(int bn){
        int dn=0,i=0;
        while(bn>0){
            dn=dn+(bn%10)*(int)(Math.pow(2,i++));
            bn/=10;
        }
        return dn;
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the Binary Number which you want to check........");
            int binaryNum=kb.nextInt();
            int decimalNum=decimalNum(binaryNum);
            System.out.println("Decimal Number = "+decimalNum);
            System.out.println("If you want to close the Program press 0 otherwise press any key");
            if(kb.nextInt()==0){
                kb.close();
            }
        }while(true);
    }
}
