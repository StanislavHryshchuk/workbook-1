package week_2.stringFunctionality;

import java.util.Scanner;

public class FullNameGenerator {

    public static Scanner scanner = new Scanner(System.in);

    //public static String userName = getUserName();

    //public static String parsedUserName = nameParser();

    public static void main(String[] args) {

        //getUserName();
        //nameParser();


    }

    public static String getUserName(){
        System.out.println("Please enter your name");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Do you have a middle name?");
        String questionAnswer = scanner.nextLine().trim().toLowerCase();

        String lastName = "";

        if (questionAnswer.equals("yes")){
            System.out.print("Enter your middle name: ");
            String middleName = scanner.nextLine().trim();

            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine().trim();

            System.out.print("Full name: " );

            return name + " " + middleName + " " + lastName;
        }else {
            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine().trim();

            System.out.print("Full name: " + name + " " + lastName);

            return name + " " + lastName;
        }
    }
    public static String nameParser(){
        System.out.print("Please enter your name:");
        String name = scanner.nextLine().trim();

        while (name.contains("  ")){
            name = name.replace("  "," ");
        }

        String[] userInput = name.split(" ");

        if (userInput.length == 2){
            System.out.println("First name: " + userInput[0]);
            System.out.println("Middle name: " + "(none)");
            System.out.println("Last name: " + userInput[1]);

            return userInput[0] + " " + userInput[1];
        } else if (userInput.length == 3) {
            System.out.println("First name: " + userInput[0]);
            System.out.println("Middle name: " + userInput[1]);
            System.out.println("Last name: " + userInput[2]);

            return userInput[0] + " " + userInput[1] + " " + userInput[2];
        } else {
            System.out.println("Wrong input. Please try again.");
            return nameParser();
        }

    }

}
