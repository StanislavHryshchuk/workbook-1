package week_2.StringBuilder;

import java.util.Scanner;

public class SB {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int
        //double
        //String

        StringBuilder sb = new StringBuilder();

        System.out.println("Please provide the following information:");
        // String address = sb adds everthing into one variable
        sb.append(getUserInput("Full name:")).append("\n"); // sb.append(Stanislav Hryshchuk)
        addAddressToStringBuilder(sb, "Billing");
        addAddressToStringBuilder(sb, "Shipping");

        String address = sb.toString();
        System.out.println(address);
    }

    public static void addAddressToStringBuilder(StringBuilder sb, String typeOfAddress) {
        // ADD                      billing                                                            add     Address
        sb.append                  (typeOfAddress)                                                  .append(" Address:\n");
        // add                      get user input          billing         street
//output/  add                       123 main st
        sb.append                  (getUserInput         (typeOfAddress + " street"))               .append("\n");
        // add                      get user input          billing         street
//output/  add                       washington
        sb.append                  (getUserInput         (typeOfAddress + " state :"))              .append(", ");

        sb.append                  (getUserInput         (typeOfAddress + " zip :"))                .append("\n\n");
    }

    public static String getUserInput(String promptMessage) {
        System.out.println(promptMessage);
        return scanner.nextLine();
    }
}
