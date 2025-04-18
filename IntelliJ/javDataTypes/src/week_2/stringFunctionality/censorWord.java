package week_2.stringFunctionality;

import java.util.Arrays;
import java.util.Scanner;

public class censorWord {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter your text");
        String userInput = scanner.nextLine();
        System.out.println("Enter a bad word: ");
        String badWord = scanner.nextLine();
        String [] words = userInput.split(" ");

        for (int i=0; i < words.length; i++){
            if (words[i].equals(badWord)){
                words[i] = words[i].replaceAll(".","*");
            }
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
