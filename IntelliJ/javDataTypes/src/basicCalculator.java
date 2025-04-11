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

        int multiply = firstNum * secondNum;
        System.out.println(multiply);




    }
}
