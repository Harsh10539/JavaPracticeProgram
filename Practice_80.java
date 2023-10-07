import java.util.Scanner;
public class Practice_80 {
    public static boolean palindromeString(String str){
        int n=str.length();
        for(int i=0;i<=n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the String which you want to enter");
            String str=kb.next();
            boolean flag=palindromeString(str);
            System.out.println(flag);
            System.out.println("If you want to close the program then press 0 otherwise press any key");
            if(kb.nextInt()==0){
                kb.close();
            }
        }while(true);
    }
}
