import java.util.*;
public class Practice_9 {
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the value of A,B & C");
            int A=kb.nextInt();
            int B=kb.nextInt();
            int C=kb.nextInt();
            if(A>=B&&A>=C){
                System.out.println("A is greater");
            }
            else if(B>=C){
                System.out.println("B is greater");
            }
            else{
                System.out.println("C is greater");
            }
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
