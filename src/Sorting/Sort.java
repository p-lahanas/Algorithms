package Sorting;
import java.util.Arrays;

public class Sort {


    public static void merge(int[] array, int l, int m, int r) {

        int lsize = m - l + 1;
        int rsize = r - m;
        int[] L = Arrays.copyOfRange(array, l, m + 1); // endIndex is exclusive so m + 1
        int[] R = Arrays.copyOfRange(array, m + 1, r + 1); // endIndex is exclusive so r + 1

        /* Create variables to track left and right arrays*/
        int i = 0, j = 0, k = l;

        while (i < lsize && j < rsize) {
            if (L[i] > R[j]) {
                array[k++] = R[j++];
            } else {

                array[k++] = L[i++];
            }
        }

        /* Add the remaining elements*/
        while (i < lsize) {
            array[k++] = L[i++];
        }
        while (j < rsize) {
            array[k++] = R[j++];
        }
    }

    public static void mergeSort(int[] array, int l, int r) {

        if (l < r) {

            int m = Math.floorDiv(l + r, 2);

            mergeSort(array, l, m); // Left half
            mergeSort(array, m+1, r); // right half
            merge(array, l, m, r);
        }
    }


    public static void main(String[] args) {
        int[] test = {10, 9, 8,7,6,5,4,3,2,1};
        mergeSort(test, 0, 9);
        System.out.println(Arrays.toString(test));
    }
}
