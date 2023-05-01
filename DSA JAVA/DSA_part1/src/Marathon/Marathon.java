package Marathon;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        marathon(n, arr);
    }

    static void marathon(int n, int[][] arr){
        int[][] array = new int[2*n][2];
        for(int i=0; i<n; i++){
            array[i][0] = arr[i][0];
            array[i][1] = arr[i][1];
            array[i+n][0] = arr[i][0];
            array[i+n][1] = arr[i][1];
        }
        int index= -1;
        int Edrink=0;
        for(int i=0; i<2*n; i++){
            if(Edrink+array[i][0]>=array[i][1]){
                Edrink+= array[i][0]- array[i][1];
                if(index==-1){
                    index=i;
                }
            }else{
                index=-1;
                Edrink=0;
            }
        }
        if(index<n && index!=-1){
            System.out.println(index);
        }else{
            System.out.println("No starting points");
        }
    }
}
