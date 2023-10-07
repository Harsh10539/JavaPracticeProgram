import java.util.Scanner;
public class Practice_16 {
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the number which table you want to print");
            int num=kb.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(num+" * "+i+" = "+(num*i));
            }
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
