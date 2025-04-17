package week_2.stringFunctionality;

import java.util.Scanner;

public class stringToInteger {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("enter number from 1-100");
        String userInput = scanner.nextLine();
        int mathAction = Integer.parseInt(userInput) * 2;
        System.out.println(mathAction);

    }
}
