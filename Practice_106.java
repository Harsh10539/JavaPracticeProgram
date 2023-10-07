public class Practice_106 {
    public static int lS(String str,int i){
        if(i==str.length()){
            return i;
        }
        return lS(str,i+1);
    }
    public static void main(String[] args){
        String str="Harsh Kumar";
        System.out.println(lS(str,0));  
    }
}
