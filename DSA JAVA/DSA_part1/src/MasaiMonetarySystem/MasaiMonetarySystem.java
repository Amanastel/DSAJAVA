package MasaiMonetarySystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MasaiMonetarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            System.out.println(masaiMonetary(n));
        }
    }
    public static Map<Long, Long> map = new HashMap<>();
    public static long masaiMonetary(long n) {
        if (n <= 0) {
            return 0;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        long maxRupees = Math.max(n, masaiMonetary(n / 2) + masaiMonetary(n / 3) + masaiMonetary(n / 4));
        map.put(n, maxRupees);
        return maxRupees;
    }
}
