package week_2.stringFunctionality;

import java.util.Scanner;

public class reverseString {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter your word: ");
        String userInput = scanner.nextLine();
        StringBuilder sb = new StringBuilder(userInput);

        String wordBackward = sb.reverse().append(4).toString();

        System.out.println(wordBackward);
    }
}
