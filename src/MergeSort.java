public class MergeSort {

  public static void merge(int[] arr, int lo, int mid, int hi) {
    int aux[] = new int[arr.length];
    for (int k = lo; k <= hi; k++) {
      aux[k] = arr[k];
    }

    // merge back to a[]
    int i = lo, j = mid + 1;
    for (int k = lo; k <= hi; k++) {
      if (i > mid) {
        arr[k] = aux[j++];
      } else if (j > hi) {
        arr[k] = aux[i++];
      } else if (aux[j] < aux[i]) {
        arr[k] = aux[j++];
      } else {
        arr[k] = aux[i++];
      }
    }

  }

  public static void sort(int[] arr, int lo, int hi) {
    if (hi <= lo) {
      return;
    }
    int mid = lo + (hi - lo) / 2;
    sort(arr, lo, mid);
    sort(arr, mid + 1, hi);
    merge(arr, lo, mid, hi);
    return;
  }

  public static void main(String args[]) {
    int arr[] = {34, 3, 7, 15, 9, 14, 11, 15, 45, 78};
    sort(arr, 0, 9);
    System.out.println("\nElements after sorting ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

  }
}
