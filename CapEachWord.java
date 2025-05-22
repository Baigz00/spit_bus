// CapEachWord.java
// This program capitalizes the first letter of each word
import java.util.Scanner;

public class CapEeachWord {
    public static void main(String[] args) {
        try(Scanner scnnr = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = scnnr.nextLine();
            if(isLower(s))
                System.out.print(s.toUpperCase());
        }
    }
    public static boolean isLower(String s) {
        // code missing
        
    }
}