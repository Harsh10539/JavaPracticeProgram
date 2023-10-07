public class Practice_72 {
    public static void diagonalArray(int a[][]){
        int i=0,j=0,sum=0 ;
        while(i<a.length&&j<a[0].length){
            sum+=a[i++][j++];
        }
        System.out.println("Primary Sum="+sum);
        j=a[0].length-1;
        i=0;
        sum=0;
        while(i<a.length&&j>=0){
            sum+=a[i++][j--];
        }
        System.out.println("Secondry Sum="+sum);
    }
    public static void main(String[] args){
        int a[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        diagonalArray(a);
    }
}
