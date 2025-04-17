package week_2.stringFunctionality;

import java.util.Scanner;

public class countVowels {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        vowelCount();
    }
    //9
    public static void vowelCount(){
        //9
        System.out.println("please write the sentence");
        //hello my name is Stanislav Hryshchuk
        String usersSentence = scanner.nextLine().trim().toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < usersSentence.length(); i++){
            char letter = usersSentence.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    }

}
