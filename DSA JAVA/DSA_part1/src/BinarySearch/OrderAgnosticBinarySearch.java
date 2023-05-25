package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr2 = {-1,1,2,3,4,5,22,33,34,56,94,789};
        int[] arr = {99,94,92,56,43,34,33,11,3,1};
        int target = 94;
        System.out.println(orderAgnosticBS(arr2,target));
    }

    public static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
//        System.out.println(isAsc);
        while(start  <= end){
//            int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
