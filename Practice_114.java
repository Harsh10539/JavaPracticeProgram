public class Practice_114 {
    public static boolean sS(String str[],String key){
        for(int i=0;i<str.length;i++){
            if(str[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str[]={"mango","apple","banana","grapes","lichi"};
        System.out.println(sS(str,"apple"));
    }
}
