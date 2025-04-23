package week_2.StringBuilder;

import java.util.Scanner;

public class addressBuilderMaaike {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Please provide the following information:");
        System.out.println("Does your billing address billing is the same as shipping?");
        String userChoice = scanner.nextLine().trim().toLowerCase();

        if (userChoice.equals("yes")){
            sb.append(getUserInput("Full name:")).append("\n");
            addAddressToStringBuilder(sb, "Billing");
        } else {
            sb.append(getUserInput("Full name:")).append("\n");
            addAddressToStringBuilder(sb, "Billing");
            addAddressToStringBuilder(sb, "Shipping");
        }

        String address = sb.toString();
        System.out.println(address);
    }

    public static void addAddressToStringBuilder(StringBuilder sb, String typeOfAddress) {
        sb.append(typeOfAddress).append(" Address:\n");
        sb.append(getUserInput(typeOfAddress + " street")).append("\n");
        sb.append(getUserInput(typeOfAddress + " state :")).append(", ");
        sb.append(getUserInput(typeOfAddress + " zip :")).append("\n\n");
    }

    public static String getUserInput(String promptMessage) {
        System.out.println(promptMessage);
        return scanner.nextLine();
    }
}
