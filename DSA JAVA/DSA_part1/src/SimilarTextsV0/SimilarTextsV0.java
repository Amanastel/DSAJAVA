package SimilarTextsV0;

import java.util.Scanner;

public class SimilarTextsV0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String virat = sc.nextLine();
        String rohit = sc.nextLine();
        int n = virat.length();
        int m = rohit.length();

        int res = Similar_texts(virat.toCharArray(),rohit.toCharArray(),n,m);
        System.out.println(res);

    }
    public static int Similar_texts(char[] str, char[] temp, int n, int m){
        if(n==0 || m==0){
            return 0;
        }
        if(str[n-1]== temp[m-1]){
            return 1+Similar_texts(str, temp, n-1, m-1);
        }
        return Math.max(Similar_texts(str, temp, n-1, m), Similar_texts(str, temp,n, m-1));
    }
}
