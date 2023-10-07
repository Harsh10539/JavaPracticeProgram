//Write a Java method to compute the average of three numbers..
import java.util.Scanner;
public class Practice_28 {
    public static float isAverage(float a,float b,float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter the three numbers which you want to check average");
            float a=kb.nextFloat();
            float b=kb.nextFloat();
            float c=kb.nextFloat();
            float avg=isAverage(a,b,c);
            System.out.println("Average = "+avg);
            System.out.println("If you want to close the program. Press 0 otherwise Press any key");
            if(kb.nextInt()==0){
                kb.close();
                System.exit(0);
            }
         }while(true);
    }
}
