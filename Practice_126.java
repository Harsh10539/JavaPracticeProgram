public class Practice_126 {
    public static void mergeSort(int arr[], int size){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                int tmp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,1};
        mergeSort(arr, arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
