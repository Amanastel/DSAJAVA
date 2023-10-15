package org.example.MergeSort;

public class MergeSort {
    // time complexity: O(nlogn)
    public static void conquer(int [] arr, int si, int mid, int ei ){
        int mergedArr[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergedArr[x++] = arr[idx1++];
            } else {
                mergedArr[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            mergedArr[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            mergedArr[x++] = arr[idx2++];
        }

        for (int i=0, j=si; i<mergedArr.length; i++, j++) {
            arr[j] = mergedArr[i];
        }

        }


    public static void divide(int [] arr, int si, int ei) {
        // Time complexity: O(nlogn)
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {

        int [] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        int [] temp = new int[n];
        divide(arr,  0, n - 1);

        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
