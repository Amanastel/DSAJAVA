package EtopowerX;

import java.util.Scanner;

public class EtopowerX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] arr = input.split(" ");
        int e = Integer.parseInt(arr[0]);
        int x = Integer.parseInt(arr[1]);
        EtopowerX(e,x);
    }
    public static void EtopowerX(int e, int x){
        double temp=0;
        for(int i=0; i<=x; i++){
            temp+= (Math.pow(e,i))/pow(i);
        }
        System.out.printf("%.4f", temp);
    }
    public static int pow(int x){
        if(x==0){
            return 1;
        }else{
            return x*pow(x-1);
        }
    }
}
