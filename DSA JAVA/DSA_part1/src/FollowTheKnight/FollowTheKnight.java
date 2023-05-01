package FollowTheKnight;

import java.util.Scanner;

public class FollowTheKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int n = sc.nextInt();
        int[][] board = new int[10][10];
        for(int i=0; i<10; i++){
            int[] mat = new int[10];
            for(int j=0; j<10; j++){
                mat[j] = 0;
            }
            board[i] = mat;
        }
        knight(row-1, col-1, n, board);
        int ans = 0;
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(board[i][j]==1){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static void knight(int row, int col, int n, int[][] board){
        if(row<0 || row>=board.length || col<0 || col>=board.length){
            return;
        }
        if(n==0){
            board[row][col] = 1;
            return;
        }
        knight(row-2, col+1, n-1, board);
        knight(row-2, col-1, n-1, board);
        knight(row+2, col+1, n-1, board);
        knight(row+2, col-1, n-1, board);
        knight(row-1, col-2, n-1, board);
        knight(row+1, col-2, n-1, board);
        knight(row-1, col+2, n-1, board);
        knight(row+1, col+2, n-1, board);
    }
}
