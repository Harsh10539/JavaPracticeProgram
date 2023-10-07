public class Practice_112 {
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quickSort(arr, si, pidx-1);
        quickSort(arr, pidx+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot =arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int tmp=arr[j];
                arr[j]=arr[i];
                arr[i]=tmp;
            }
        }
        i++;
        int tmp=pivot;
        arr[ei]=arr[i];
        arr[i]=tmp;
        return i;
    }
    public static void main(String[] args){
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
