import java.util.Scanner;
public class Practice_36 {
    public static void isPettern(int rows,int col){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==rows||j==1||j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the total rows & total column");
            int rows=kb.nextInt();
            int col=kb.nextInt();
            isPettern(rows,col);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
        }while(true);
    }
}
