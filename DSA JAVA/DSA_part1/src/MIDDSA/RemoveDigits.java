package MIDDSA;

import java.util.Scanner;

public class RemoveDigits {
    public static void removeDigits(int n){
        int steps = 0;
        while (n > 0) {
            int maxDigit = 0;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                maxDigit = Math.max(maxDigit, digit);
                temp /= 10;
            }
            n -= maxDigit;
            steps++;
        }

        System.out.println(steps);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        removeDigits(n);
        int steps = 0;
    }
}
