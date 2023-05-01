import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Minimize number of pages

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
    public static int solve(int n) {
        int m1 = (n / 10) + 1;
        int m2 = (n / 12) + 1;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= m1; i++) {
            for (int j = 0; j <= m2; j++) {
                int sum = (i * 10) + (j * 12);
                if (sum == n) {
                    ans = Math.min(ans, i + j);
                }
            }
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }

    }
}