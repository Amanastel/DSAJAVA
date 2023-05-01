package DP;

import java.util.Scanner;

public class DP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            dpNation(n,arr);
        }
    }
    public static void dpNation(int n, int[] arr){
        int max= 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }else if(arr[i] - min >= max) {
                max = arr[i] - min;
            }
        }

        System.out.println(max);
    }

}
