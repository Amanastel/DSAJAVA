package BinarySearch;

public class SmallestLetter {

    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {

        char[] arr2 = new char[]{'c','f','j'};
        char target = 'j';
        System.out.println(smallestLetter(arr2,target));
    }

    public static char smallestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length - 1;

        while(start  <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length] ;
    }
}

