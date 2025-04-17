package week_2.stringFunctionality;

import java.util.Scanner;
import java.util.regex.Pattern;

public class extractDayFromDate {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Plesase Enter the date(yyyy-MM-dd)");
        String userInput = scanner.nextLine();
        String dayFromDate = userInput.substring(userInput.lastIndexOf("-") + 1);
        System.out.println(dayFromDate);
    }
}
