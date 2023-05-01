package GenerateParenthesis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(n, 0, 0, "", result);
        Collections.sort(result);
        return result;
    }
    static void generateParenthesisHelper(int n, int open, int close, String current, List<String> result) {
        if (open == n && close == n) {
            result.add(current);
            return;
        }
        if (open < n) {
            generateParenthesisHelper(n, open+1, close, current+"(", result);
        }
        if (close < open) {
            generateParenthesisHelper(n, open, close+1, current+")", result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> result = generateParenthesis(n);
        for (String s : result) {
            System.out.print(s+" ");
        }
    }
}
