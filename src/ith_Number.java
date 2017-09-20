public class ith_Number {
    public static int selectithNumber(int arr[], int p, int r,int i){
      if(p==r){
        return arr[p];
      }
      if(i>r+1){
        return -1;
      }
      int q = QuickSort.randomizedPartition(arr,p,r);
      int k = q-p+1;
      if(i == k){
        return arr[q];
      }else{
        if(i<k){
          return selectithNumber(arr,p,q-1,i);
        }else{
          return selectithNumber(arr,q+1,r,i-k);
        }
      }

    }

    public static void main(String args[]){
      int arr[] = {34,3,7,15,9,14,11,15,45,78};
      System.out.println(selectithNumber(arr,0,9,6));
    }
}
