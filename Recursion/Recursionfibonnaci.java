package Recursion;

import java.util.Scanner;

public class Recursionfibonnaci {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fibonacci(n));

        scan.close();
    }

    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
