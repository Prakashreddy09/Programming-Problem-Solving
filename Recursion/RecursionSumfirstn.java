package Recursion;

import java.util.Scanner;

public class RecursionSumfirstn {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        sum_of_n_nums(n,sum);
        System.out.println(func_sum_of_n_nums(n)); 
        scan.close();
    }

    public static void sum_of_n_nums(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sum_of_n_nums(n - 1, sum + n);
    }

    public static int func_sum_of_n_nums(int n){
        if(n<1){
            return 0;
        }
        return n + func_sum_of_n_nums(n-1); 
    }
    
}