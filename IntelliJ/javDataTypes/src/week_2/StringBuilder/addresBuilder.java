package week_2.StringBuilder;

import java.util.Scanner;
import java.util.regex.Pattern;

public class addresBuilder {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        System.out.println("Please enter your full name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Please enter your billing address:\n1. Street\n2. City\n3. State\n4. Zip");

        sb.append("Billing Address:\n");
        sb.append(getUserInput("Billing Street: " ) + "\n");
        sb.append(getUserInput("Billing City: ") + ", ");
        sb.append(getUserInput("Billing State: ") + " ");
        sb.append(getUserInput("Billing Zip Code: ") + "\n");




        System.out.println("Does your billing address billing is the same as shipping?");
        String askQuestion = scanner.nextLine().trim().toLowerCase();
        sb.insert(0,name + "\n\n");
        String billingAddress = sb.toString();
        if (askQuestion.equals("yes")){
            System.out.println(billingAddress);
            System.out.println("Shipping Address: \n" + billingAddress);
        } else {

            sb.append("Shipping Address:\n");
            sb.append(getUserInput("Shipping Street: " ) + "\n");
            sb.append(getUserInput("Shipping City: ") + ", ");
            sb.append(getUserInput("Shipping State: ") + " ");
            sb.append(getUserInput("Shipping Zip Code: "));

            System.out.println(billingAddress);
        }



    }

    public static String getUserInput (String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
