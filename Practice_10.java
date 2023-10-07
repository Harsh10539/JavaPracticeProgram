import java.util.Scanner;
public class Practice_10 {
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which you want to check Even or Odd");
            int number=kb.nextInt();
            String type=((number%2==0)?"Even":"Odd");
            System.out.println(type);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
