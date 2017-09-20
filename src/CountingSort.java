import java.util.Scanner;

public class CountingSort {

  public static void countingSort(int A[], int B[], int k) {
    int C[] = new int[k];
    for (int i = 0; i < k; i++) {
      C[i] = 0;
    }
    int Alength = A.length;
    for (int i = 0; i < Alength; i++) {
      C[A[i]]++;
    }
    for (int i = 1; i < k; i++) {
      C[i] = C[i] + C[i - 1];
    }
    for(int i=Alength-1;i>=0;i--){
      B[C[A[i]]-1] = A[i];
      C[A[i]]--;
    }
  }

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Heap Sort Test\n");
    int n, i;

    /* Accept number of elements */
    System.out.println("Enter number of integer elements");
    n = scan.nextInt();

    /* Make array of n elements */
    int arrA[] = new int[n];
    int arrB[] = new int[n];

    /* Accept elements */
    int max = Integer.MIN_VALUE;
    System.out.println("\nEnter " + n + " integer elements");
    for (i = 0; i < n; i++) {
      arrA[i] = scan.nextInt();
      if(max<arrA[i]){
        max = arrA[i];
      }
    }

    /* Call method sort */
    countingSort(arrA,arrB,max+1);

    /* Print sorted Array */
    System.out.println("\nElements after sorting ");
    for (i = 0; i < n; i++) {
      System.out.print(arrB[i] + " ");
    }
    System.out.println();
  }
}