package NumberOfWaysProblems;

import java.util.Scanner;

public class NumberOfWaysProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(waysProblems(n));
    }
    public static long waysProblems(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return waysProblems(n-1) + waysProblems(n-2) + waysProblems(n-3);
        }
    }
}
