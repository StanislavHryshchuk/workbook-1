package week_2.stringFunctionality;

import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;
import java.util.regex.Pattern;

public class isItPalindrome {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your word");
        String userInput = scanner.nextLine().trim().toLowerCase();
        //need to add more comparisons in "if" statement, for longer palindromes
        if (userInput.charAt(0) == userInput.charAt(userInput.length()-1) && userInput.charAt(1) == userInput.charAt(userInput.length()-2)){
            System.out.println("Word is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        reverseWay();
    }

    public static void reverseWay(){
        System.out.println("Please enter your word");
        String userInput = scanner.nextLine().trim().toLowerCase();
        StringBuilder sb = new StringBuilder(userInput);
        String reversedUserInput = String.valueOf(sb.reverse());
        if (userInput.equals(reversedUserInput)){
            System.out.println("word is palindrome");

        }else {
            System.out.println("word is not a palindrome");
        }
    }
}
