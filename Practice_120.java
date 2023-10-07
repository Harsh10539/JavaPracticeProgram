public class Practice_120 {
    public static void main(String[] args){
        String[] str={"sun","earth","mars","mercury"};
        String[] str1=mergeSort(str, 0, str.length-1);
        for(int i=0;i<str1.length;i++){
            System.out.print(str1[i]+" ");
        }
    }
    public static String[] mergeSort(String[] arr,int lo, int hi){
        if(lo==hi){
            String[] A = {arr[lo]};
            return A;
        }
        int mid=lo+(hi-lo)/2;
        String[] arr1=mergeSort(arr, lo, mid);
        String[] arr2=mergeSort(arr, mid+1, hi);
        String[] arr3=merge(arr1,arr2);
        return arr3;
    }
    static String[] merge(String[] arr1,String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3=new String[m+n];
        int idx=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(isAlphabaticallySmaller(arr1[i],arr2[j])){
                arr3[idx]=arr1[i];
                i++;
                idx++;
            }else{
                arr3[idx]=arr2[j];
                j++;
                idx++;
            }
        }
        while(i<m){
            arr3[idx]=arr1[i];
            i++;
            idx++;
        }
        while(j<n){
            arr3[idx]=arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }
    static boolean isAlphabaticallySmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        else{
            return false;
        }
    }
}
