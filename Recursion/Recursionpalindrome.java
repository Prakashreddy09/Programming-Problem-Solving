package Recursion;

import java.util.Scanner;

public class Recursionpalindrome {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(ispalindrome(str, 0, str.length())){
            System.out.print("The String " + "'" + str + "'" + " is palindrome.");
        }
        else{
            System.out.print("The String " + "'" + str + "'" + " is not palindrome.");
        }

        scan.close();
    }

    public static boolean ispalindrome(String str, int start, int len){

        if(start >= len/2){
            return true;
        }
        else{
            if(str.charAt(start) != str.charAt(len-start-1)){
                return false;
            }
        }
        return ispalindrome(str, start+1, len);
    }
}
