package CoinSum;

import java.util.*;

public class CoinSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        for (int i = 0; i < n; i++) {
            Set<Integer> newSums = new HashSet<>();
            for (int sum : sums) {
                newSums.add(sum + coins[i]);
            }
            sums.addAll(newSums);
        }
        System.out.println(sums.size() - 1);
        List<Integer> sortedSums = new ArrayList<>(sums);
        Collections.sort(sortedSums);
        for (int i = 1; i < sortedSums.size(); i++) {
            System.out.print(sortedSums.get(i) + " ");
        }
    }
}
