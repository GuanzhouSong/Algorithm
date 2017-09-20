import java.util.Scanner;

public class QuickSort {
  public static void swap(int arr[], int i, int j){
    int tem = arr[i];
    arr[i] = arr[j];
    arr[j] = tem;
  }

  public static int partition(int arr[], int q, int r){
      int x = arr[r];
      int i = q-1;
      for(int j = q;j<r;j++){
        if(arr[j]<=x){
          i++;
          swap(arr,i,j);
        }
      }
      swap(arr,i+1,r);
    return (i+1);
  }

  public static int randomizedPartition(int arr[], int q, int r){
    int i = q + (int)((r-q)*Math.random());
    swap(arr,i,r);
    return partition(arr,q,r);
  }

  public static void quicksort(int arr[], int q, int r){
    if(q<r){
      int p = partition(arr, q,r);
      quicksort(arr,q,p-1);
      quicksort(arr,p+1,r);
    }
  }

  public static void randomizedQuicksort(int arr[], int q, int r){
    if(q<r){
      int p = randomizedPartition(arr, q,r);
      randomizedQuicksort(arr,q,p-1);
      randomizedQuicksort(arr,p+1,r);
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Sort Test\n");
    int n, i;

    /* Accept number of elements */
    System.out.println("Enter number of integer elements");
    n = scan.nextInt();

    /* Make array of n elements */
    int arr[] = new int[n];

    /* Accept elements */
    System.out.println("\nEnter " + n + " integer elements");
    for (i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    /* Call method sort */
    randomizedQuicksort(arr,0,n-1);

    /* Print sorted Array */
    System.out.println("\nElements after sorting ");
    for (i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
