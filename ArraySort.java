import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args) {
        int[] A = {1, 7, 10, 19};
        int[] B = {3, 8, 15, 46};
        int[] C = mergeArrays(A, B);
        System.out.println("Merged array C: " + Arrays.toString(C));
    }

    public static int[] mergeArrays(int A[], int B[]) 
    {
        int C[] = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < A.length) {
            C[k++] = A[i++];
        }
        while (j < B.length) {
            C[k++] = B[j++];
        }
        return C;
    }
}
