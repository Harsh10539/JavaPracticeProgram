import java.util.Scanner;
public class Practice_15 {
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number, Which you want to check");
            int num=kb.nextInt();
            int fact=1;
            for(int i=num;i>0;i--){
                fact=fact*i;
            }
            System.out.println("Factorial Number = "+fact);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
