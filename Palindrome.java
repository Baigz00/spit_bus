// Palindrome.java
// @baigz_gibson

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = input.nextLine();

            if(isPalindrome(s))
                System.out.print(s + " is a palindrome");
            else
                System.out.print(s + " is not a palindrome");
        }
    }
    public static boolean isPalindrome(String s){
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if(s.charAt(low) != s.charAt(high))
                return false; // not a palindrome
            low++;
            high--;
        }
        return true;
    }
}