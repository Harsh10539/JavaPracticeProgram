public class Practice_111 {
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int tmp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                tmp[k]=arr[i];
                i++; 
            }else{
                tmp[k]=arr[j];
                j++; 
            }
            k++;
        }
        while(i<=mid){
            tmp[k++]=arr[i++];
        }
        while(j<=ei){
            tmp[k++]=arr[j++];
        }
        for(k=0, i=si;k<tmp.length;k++,i++){
            arr[i]=tmp[k];
        }
    }
    public static void main(String[] args){
        int arr[]={6,3,9,5,2,8,-2};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
