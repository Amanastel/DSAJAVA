package DP.Koramangala;

import java.util.Scanner;

public class Koramangala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(koramangala(arr,n));
    }

    public static int koramangala(int[] arr, int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (j + arr[j] >= i) {
                    dp[i] = Math.min(dp[i], dp[j]+1);
                }
            }
        }
        if (dp[n-1] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dp[n-1];
        }
    }
}
