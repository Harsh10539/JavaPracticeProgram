import java.util.Scanner;
public class Practice_14 {
    public static void main(String[] args){
        int even=0,odd=0;
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to add");
            int num=kb.nextInt();
            if(num%2==0){
                even=even+num;
                System.out.println("Even Sum = "+ even);
            }
            else{
                odd=odd+num;
                System.out.println("Odd Sum = "+ odd);
            }
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }    
}
