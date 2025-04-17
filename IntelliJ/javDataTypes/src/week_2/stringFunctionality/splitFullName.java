package week_2.stringFunctionality;

import java.util.Scanner;
import java.util.regex.Pattern;

public class splitFullName {
    static public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter your full name: ");
        String userName = scanner.nextLine().trim();
        String [] splitName = userName.split(Pattern.quote(" "));
        System.out.println("First name: " + splitName[0] + "\nLast name: " + splitName[1]);
    }
}
