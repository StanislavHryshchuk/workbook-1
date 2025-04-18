package week_2.stringFunctionality;

import java.util.Objects;
import java.util.Scanner;

public class projectTipCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your bill amount?");
        double billAmount = Double.parseDouble(scanner.nextLine()) ;

        System.out.println("how much tip you would like to leave? (in %)");
        int tipPercent = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Between how many people you want to split the bill?");
        int numberOfPeopleToSplit = Integer.parseInt(scanner.nextLine());

        String [] names = new String[numberOfPeopleToSplit];
        int numberOfPeopleCount = 0;
        while (numberOfPeopleCount != numberOfPeopleToSplit){
            System.out.println("Enter the name of next Person");
            String name = scanner.nextLine();
            names[numberOfPeopleCount] = name;
            numberOfPeopleCount++;
        }

        double convertTipPercent = (double) tipPercent/ 100;
        double totalBillAmount = (billAmount * convertTipPercent) + billAmount;
        double splitTotalBill = totalBillAmount / numberOfPeopleToSplit;

        int printCount = 0;
        while (printCount != numberOfPeopleToSplit){
            System.out.printf("%s pay $%.2f%n", names[printCount], splitTotalBill);
            printCount++;
        }
        if (tipPercent < 10){
            System.out.println("Scrooge alert \uD83D\uDE05");
        }
    }
}
