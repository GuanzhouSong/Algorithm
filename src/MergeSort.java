public class MergeSort {
    public static void merge(int[] arr,int lo, int mid, int hi){
        int aux[] = new int[arr.length];
        int i = lo;
        int j = mid+1;
        for(int k=lo;k<=hi;k++){
          if(i>mid){
            aux[k] = arr[j++];
          }else{
            if(j>hi){
              aux[k] = arr[i++];
            }else{
              if(arr[i]<arr[j]){
                aux[k] = arr[i];
              }else{
                aux[k] = arr[j];
              }
            }
          }
        }
        arr = aux;
    }

    public static void sort(int[] arr, int lo, int hi){
      if(hi<=lo)
        return;
      int mid = lo + (hi+lo)/2;
      sort(arr,lo,mid);
      sort(arr,mid+1,hi);
      merge(arr,lo,mid,hi);
    }

    public static void main(String args[]){
      int arr[] = {34,3,7,15,9,14,11,15,45,78};
      System.out.println(sort(arr,0,9));
    }
}
