package Recursion;

import java.util.Scanner;

public class Recursionarray {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        revarr(0, n, arr);
        for(int i =0;i<=5; i++){
                System.out.print(arr[i]+" ");
            }
        scan.close();
    }

    public static void revarr(int start, int end, int[] arr){
        if(start > end/2){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end-start - 1];
        arr[end-start-1] = temp;
        revarr(start+1, end, arr);
    }
}
