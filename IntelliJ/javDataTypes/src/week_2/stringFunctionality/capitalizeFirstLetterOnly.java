package week_2.stringFunctionality;


import java.util.Arrays;
import java.util.Scanner;


public class capitalizeFirstLetterOnly {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter your text:");
        String userInput = scanner.nextLine().trim();
        // this is the owner of this code
        // This Is The Owner Of This Code
        String [] words = userInput.split(" ");

        for (int i = 0; i < words.length; i++){
            String oneWord = words[i];
            String firstCharacter = String.valueOf(oneWord.charAt(0));
            String toUpperCase = firstCharacter.toUpperCase();
            String fullWord = toUpperCase + oneWord.substring(1);
            words[i] = fullWord;
        }
        String result = String.join(" ", words);
        System.out.println(result);
    }
}
