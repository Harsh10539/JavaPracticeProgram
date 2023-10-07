public class Practice_129 {
    public static void main(String[] args){
        int n=3,m=3;
        System.out.println(gW(0,0,n,m));
    }
    public static int gW(int i,int j,int n,int m){
        if(i==n-1&&j==m-1){
            return 1;
        }else if(i==n||j==n){
            return 0;
        }
        int w1=gW(i+1,j,n,m);
        int w2=gW(i,j+1,n,m);
        return w1+w2;
    }
}
