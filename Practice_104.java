public class Practice_104 {
    public static void pA(int n[],int key,int i){
        if(i==n.length){
            return;
        }
        if(n[i]==key){
            System.out.print(i+" ");
        }
        pA(n,key,i+1);
    }
    public static void main(String[] args){
        int n[]={3,2,4,5,6,2,7,2,2,};
        pA(n,2,0);
    }
}
