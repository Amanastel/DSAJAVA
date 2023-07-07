package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class firstNegativeIntegerInEveryWindowOfSizeK {
    public static void main(String[] args) {
//        int n = 8;
//        long[] arr = {12, -1, -7, 8, -15, 30, 16, 28};

//        int k = 3;
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        int n = arr.length;

        firstNegativeInteger(n,k,arr);
    }
    public static int[] firstNegativeInteger(int n, int k, int[] arr) {
//        List<Long> list = new ArrayList<>();
//        int i=0;
//        int j=0;
//        while(j < n){
//            if(arr[j] < 0){
//                list.add(arr[j]);
//            }
//            if(j-i+1 < k){
//                j++;
//            }
//            else if(j-i+1 == k){
//                if(list.size() == 0){
//                    list.add(0L);
//                }
//                System.out.print(list.get(0) + " ");
//                if(arr[i] < 0){
//                    list.remove(0);
//                }
//                i++;
//                j++;
//            }
//        }
//        long[] ans = new long[list.size()];
//        for(int l=0;l<list.size();l++){
//            ans[l] = list.get(l);
//        }
//        return ans;
//    }


//        List<Integer> ans = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//
//        while (j < n) {
//
//            if (arr[j] < 0) {
//                ans.add(arr[j]);
//            }
//
//            if (j - i + 1 < k) {
//                j++;
//            } else if (j - i + 1 == k) {
//                if (ans.isEmpty()) {
//                    System.out.print(0 + " ");
//                } else {
//                    System.out.print(ans.get(0) + " ");
//                    if (arr[i] == ans.get(0)) {
//                        ans.remove(0);
//                    }
//                }
//                i++;
//                j++;
//            }
//        }
//        return null;
//    }


        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (j < n) {

            if (arr[j] < 0) {
                ans.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (ans.isEmpty()) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(ans.get(0) + " ");
                    if (arr[i] == ans.get(0)) {
                        ans.remove(0);
                    }
                }
                i++;
                j++;
            }
        }
        return null;
    }

}


