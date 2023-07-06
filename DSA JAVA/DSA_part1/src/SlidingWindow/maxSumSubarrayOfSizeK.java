package SlidingWindow;

public class maxSumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }

    public static int maxSum(int[] arr, int n, int k) {
        int i=0;
        int j = 0;
        int sum =0;
        int max = Integer.MIN_VALUE;
        while(j < n){
            sum = sum + arr[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(sum,max);
                sum = sum - arr[i];
                i++;
                j++;
            }

        }
        return max;

    }


    /*
    public static int maxSum(int[] arr, int n, int k) {
        int start=0;
        int end = 0;
        int sum =0;
        int max = Integer.MIN_VALUE;
        while(end < n){
            sum = sum + arr[end];
            if(end-start+1 < k){
                end++;
            }
            else if(end-start+1 == k){
                max = Math.max(sum,max);
                sum = sum - arr[start];
                start++;
                end++;
            }

        }
        return max;

    }
     */
}
