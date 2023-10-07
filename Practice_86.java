public class Practice_86 {
    public static void main(String[] args){
        String str1="Iron Man";
        String str2="Iron Man";
        String str3=new String("Iron Man");
        if(str1==str2){
            System.out.println("true");
        }
        else{
            System.out.println("Not true");
        }
        if(str1==str3){
            System.out.println("true");
        }
        else{
            System.out.println("Not true");
        }
    }
}
