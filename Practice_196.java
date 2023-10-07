public class Practice_196 {
    public static void main(String[] args){
        String str="hi, harsh this side.";
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            ch=str.charAt(i);
            if(ch==' '&&i<str.length()-1){ 
                sb.append(ch);
                i++;
                ch=Character.toUpperCase(str.charAt(i));
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }    
}
