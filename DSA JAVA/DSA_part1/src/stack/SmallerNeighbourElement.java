
// Smaller Neighbour Element Ended
// Description

// Given an array, find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.

// Mathematically,

// G[i] for an element A[i] is an element A[j] such that

// j is maximum possible AND

// j < i AND

// A[j] < A[i]

// Note: Elements for which no smaller element exist, consider next smaller element as -1.


// Input
// Input Format:

// First line contains an integer N denoting the number of elements in the array (not necessarily distinct).

// Second line contains N space separated integers denoting the elements of the array.

// Constraints:

// N <= 100000


// Output
// Print N space separated integers denoting the array G.


// Sample Input 1 

// 8
// 39 27 11 4 24 32 32 1
// Sample Output 1

// -1 -1 -1 -1 4 24 24 -1



package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SmallerNeighbourElement {
    public static void smallerNeighbourElement(int N, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[i] <= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        ans.stream().forEach(S -> System.out.print(S+" "));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 8;
        int[] arr = {39, 27, 11, 4, 24, 32, 32, 1};
        smallerNeighbourElement(N, arr);
    }
    
}
