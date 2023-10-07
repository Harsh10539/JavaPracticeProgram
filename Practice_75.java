public class Practice_75 {
    public static void main(String[] args){
        String str[]={"Mango","Banana","Apple","Lichi"};
        String largest = str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareTo(str[1])<0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
}
