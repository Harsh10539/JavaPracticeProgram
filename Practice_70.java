import java.util.Scanner;
public class Practice_70 {
    public static boolean search(int arr[][], int key){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println("Enter the key");
        int key=kb.nextInt();
        System.out.println(search(arr, key));
        kb.close();
    }
}
