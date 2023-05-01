package GenerateAllSubsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateAllSubsequence {
    public static void generateSubsequence(int n, String str, List<Character> sub, int position) {
        if (!sub.isEmpty()) {
            for (char ch : sub) {
                System.out.print(ch);
            }
            System.out.println();
        }
        if (str.length() == position) {
            return;
        }
        for (int i = position; i < str.length(); i++) {
            sub.add(str.charAt(i));
            generateSubsequence(n, str, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String str = sc.next();
        generateSubsequence(tc, str, new ArrayList<Character>(), 0);
    }
}
