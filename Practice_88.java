public class Practice_88 {
    public static void main(String[] args){
        String[] str={"Apple","Banana","Mango","Lichi"};
        String largest=str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
}
