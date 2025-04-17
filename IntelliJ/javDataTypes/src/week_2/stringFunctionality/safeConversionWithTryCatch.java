package week_2.stringFunctionality;

import java.util.Scanner;

public class safeConversionWithTryCatch {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter...");
        String userInput = scanner.nextLine();

        try {
            int convert = Integer.parseInt(userInput);
            System.out.println(convert);
        }catch (NumberFormatException error){
            System.out.println("Invalid Number");
        }
    }
}
