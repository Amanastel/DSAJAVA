package HeightOfTrees;

import java.util.Scanner;

public class HeightOfTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(heightOfTrees(n,arr));
    }
    public static int heightOfTrees(int n, int[] arr){
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }
}
