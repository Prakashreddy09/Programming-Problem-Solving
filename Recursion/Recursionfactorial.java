package Recursion;

import java.util.Scanner;

public class Recursionfactorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int value = 1; 
        factorial(n,value);
        System.out.println(func_factorial(n));
        scan.close();
    }

    public static void factorial(int n, int value){
        if(n < 1){
            System.out.println(value);
            return;
        }
        factorial(n-1, value*n);
    }

    public static int func_factorial(int n){
        if(n==1){
            return 1;
        }
        return n * func_factorial(n-1);
    } 

}
