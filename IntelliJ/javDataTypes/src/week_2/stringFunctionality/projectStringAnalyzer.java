package week_2.stringFunctionality;

import java.util.Scanner;

public class projectStringAnalyzer {

    public static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("please enter your sentence");
            String userInput = scanner.nextLine();
            int charactersCount = 0;

            for (int i = 0; i < userInput.length(); i++){
                if (userInput.charAt(i) == ' '){
                    charactersCount--;
                }
                charactersCount++;
            }
            String [] sentence = userInput.split(" ");
            int numberOfWords = sentence.length;
            System.out.println(charactersCount);
            System.out.println(numberOfWords);
            System.out.println(userInput.charAt(0) + " " + userInput.charAt(userInput.length()-1));
        }

}
