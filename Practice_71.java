public class Practice_71 {
    public static void sM(int mat[][]){
        int startRow =0;
        int startCol =0;
        int endRow =mat.length-1;
        int endCol =mat[0].length-1;
        while((startRow <= endRow && startCol<=endCol)){
            for(int j=startCol;j<=endCol;j++){
                System.out.println(mat[startRow][j]);
            }
            break;
        }
    }
    public static void main(String[] args){
        int mat[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
            sM(mat);
    }
}
