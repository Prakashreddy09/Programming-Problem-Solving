package Recursion;

import java.util.Scanner;

public class RecursionBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        // recurname(n,count);
        // recur1_to_n(n,count);
        // recurn_to_1(n,n);
        // backtrack1_to_n(n,n);
        backtrackn_to_1(n,count);
        scan.close();
    }


    public static void recurname(int n, int count){
        if(count > n){
            return;
        }
        System.out.println("Prakash");
        recurname(n, count+1);
    }

    public static void recur1_to_n(int n, int count){
        if(count > n){
            return;
        }
        System.out.println(count);
        recur1_to_n(n, count+1);
    }

    public static void recurn_to_1(int n, int count){
        if(count < 1){
            return;
        }
        System.out.println(count);
        recurn_to_1(n, count-1);
    }

    public static void backtrack1_to_n(int n,int count){
        if(count<1){
            return ;
        }
        backtrack1_to_n(n, count-1);
        System.out.println(count);
    }

    public static void backtrackn_to_1(int n,int count){
        if(count>n){
            return;
        }
        backtrackn_to_1(n, count+1);
        System.out.println(count);
    }

}
