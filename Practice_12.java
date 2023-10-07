import java.util.Scanner;
public class Practice_12 {
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to reverse");
            int num=kb.nextInt();
            int rev=0;
            while(num>0){
                rev=rev*10+(num%10);
                num/=10;
            }
            System.out.println("Reverse Number = "+rev);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
