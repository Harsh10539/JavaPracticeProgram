public class Practice_110 {
    public static void tOH(int n,String src, String helper , String dest){
        if(n==1){
            System.out.println("transffer disk "+n+" from "+src+" to "+dest);
            return;
        }
        tOH(n-1, src,dest, helper);
        System.out.println("Transfer disk  "+n+" from "+src+" to "+dest);
        tOH(n-1, helper ,src,helper);
    }
    public static void main(String[] args){
        int n=3;
        tOH(n, "S","H","D");
    }
}
