public class Practice_100 {
    public static int occ(int n[],int i,int count){
        if(i==n.length-1){
            return count;
        }
        if(n[0]==n[i+1]){
            count++;
        }
        return occ(n,i+1,count);
    }
    public static void main(String[] args){
        int n[]={'1','1','1','4','1'};
        System.out.println(occ(n,0,1));
    }
}
