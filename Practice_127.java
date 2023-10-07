public class Practice_127 {
    public static void pN(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            str=str.substring(0,1)+str.substring(i+1);
            pN(str, ans+curr);
        }
    }
    public static void main(String[] args){
        pN("abc","");
    }
}
