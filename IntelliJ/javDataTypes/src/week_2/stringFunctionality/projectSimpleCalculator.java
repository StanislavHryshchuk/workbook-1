package week_2.stringFunctionality;

import java.util.Scanner;

public class projectSimpleCalculator {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter 2 numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please choose the  math operation you want to perform +,-,*,/:");
        String mathOperation = scanner.nextLine();

        if (mathOperation.equals("+")){
            int sum = firstNumber + secondNumber;
            System.out.println(sum);

        } else if (mathOperation.equals("*")) {
            int multiply = firstNumber * secondNumber;
            System.out.println(multiply);

        } else if (mathOperation.equals("/")){
            int division = firstNumber / secondNumber;
            System.out.println(division);

        } else if (mathOperation.equals("-")) {
            int minus = firstNumber - secondNumber;
            System.out.println(minus);

        } else {
            System.out.println("Wrong math operation entered.");
        }
    }
}
