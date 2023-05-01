package QuicklySortIt;

import java.util.Scanner;

public class QuicklySortIt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        quickSort(arr, 0, n-1);

        for (int i = 0; i < n; i++) System.out.print(arr[i]+" ");

    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pr = prton(arr, left, right);
            quickSort(arr, left, pr-1);
            quickSort(arr, pr+1, right);
        }
    }

    public static int prton(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
