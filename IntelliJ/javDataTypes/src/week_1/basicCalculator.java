package week_1;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Please select the math operation you want to do: ");
        System.out.println("(A)dd, (S)ubtract, (M)ultiply, (D)ivide");
        String operationInput = scanner.nextLine();
        System.out.println("You chose: " + operationInput);
        
        if (operationInput.equals("M")){
            int multiply = firstNum * secondNum;
            System.out.println(multiply);
        } else if (operationInput.equals("A")) {
            int sum = firstNum + secondNum;
            System.out.println(sum);
        } else if (operationInput.equals("S")) {
            int subtract = firstNum - secondNum;
            System.out.println(subtract);
        } else if (operationInput.equals("D")) {
            int divide = firstNum / secondNum;
            System.out.println(divide);
        } else {
            System.out.println("No Operation Input");
        }
        //something

        // rewrite to switch

        switch(operationInput) {
            case "M":
                int multiply = firstNum * secondNum;
                System.out.println(multiply);
                break;
            case "A":
                int sum = firstNum + secondNum;
                System.out.println(sum);
                break;
            default:
                System.out.println("No Operation Input");

        }


    }
}
