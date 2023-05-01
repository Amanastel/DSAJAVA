package SumExistsOrNot;

import java.util.Scanner;

public class SumExistsOrNot {
    public static boolean Exists(int[] arr, int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (arr[n-1] > sum) {
            return Exists(arr, n-1, sum);
        }
        return Exists(arr, n-1, sum-arr[n-1]) || Exists(arr, n-1, sum);
    }

    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        if (Exists(arr, n, sum)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
