package CountWithCondition;

import java.util.Scanner;

public class CountWithCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = countWithCondition(arr,n,m);
        System.out.println(ans);
    }
    public static int countWithCondition(int[] arr, int n, int bag){
        if(bag==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(arr[n-1]>bag){
            return countWithCondition(arr,n-1,bag);
        }else{
            return countWithCondition(arr,n-1,bag) + countWithCondition(arr,n-1,bag-arr[n-1]);
        }
    }
}
