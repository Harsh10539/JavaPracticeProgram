import java.util.Scanner;
public class Practice_11 {
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the year which you want to check");
            int year=kb.nextInt();
            System.out.println((year%4==0)?"leap Year":"Not leap Year");
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
