public class Practice_124 {
    public static void main(String[] args){
        int n=1001;
        int tmp=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==tmp){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Not");
        }
    }
}
