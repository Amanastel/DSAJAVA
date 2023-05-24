package BinarySearch;

import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int target = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(binarySearch(arr,target));


        int[] arr2 = {-1,1,2,3,4,5,22,34,56,789};
        int target = 22;
        System.out.println(binarySearch(arr2,target));
    }

    // return the index of the element if found else return -1
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start  <= end){
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}


/*
    n = 5
    target = 1
    arr = 0 0 0 1 1
 */