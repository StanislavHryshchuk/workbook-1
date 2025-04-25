package week_3.randomQuoteGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class quoteGenerator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean running = true;
        while (running){
            System.out.println("\n----------- Welcome to Quote's Generator -------------------\n\nPlease select from the following:");
            System.out.println("""
                    1. Show all quotes
                    2. Show a random quote
                    3. Add a new quote
                    4. Exit\s""");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> readFile();
                case 2 -> randomQuote(getLineCount());
                case 3 -> addNewQuote();
                case 4 -> {
                    running = false;
                    System.out.println("Thank you for using Quote's Generator. Have a nice day!");
                } default -> System.out.println("Invalid enter. Please enter 1 - 4.");
            }
            if (choice != 4) {
                System.out.println("Would you like to try another? (yes | no)");
                String continueProgram = scanner.next();
                switch (continueProgram.toLowerCase().trim()){
                    case "yes" -> {
                    }
                    case "no" -> {
                        running = false;
                        System.out.println("Thank you for using Quote's Generator. Have a nice day!");
                    }
                    default -> System.out.println("Invalid choice. Please enter yes or no.");
                }
            }
        }

    }

    public static void readFile() {
        try (BufferedReader bf = new BufferedReader(new FileReader("IntelliJ/javDataTypes/src/week_3/randomQuoteGenerator/quote.txt"))) {
            String line;
            while ((line = bf.readLine())!= null){
                System.out.println(line);
            }


        } catch (IOException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int getLineCount(){
        int lineCount = 1;
        try (BufferedReader bf = new BufferedReader(new FileReader("IntelliJ/javDataTypes/src/week_3/randomQuoteGenerator/quote.txt"))) {
            String line;
            while ((line = bf.readLine())!= null){
                lineCount++;
            }
        } catch (IOException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return lineCount;
    }

    public static void randomQuote (int numbersOfQuotes){
        try (BufferedReader bf = new BufferedReader(new FileReader("IntelliJ/javDataTypes/src/week_3/randomQuoteGenerator/quote.txt"))) {
            int lineNumber = 0;
            int randomNumber = (int) (Math.random() * numbersOfQuotes);
            String line;
            while ((line = bf.readLine())!= null){
                if (lineNumber == randomNumber){
                    System.out.println(line);
                    System.out.println(lineNumber);
                    break;
                }
                lineNumber++;
            }

        } catch (IOException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addNewQuote() {

        try(FileWriter fr = new FileWriter("IntelliJ/javDataTypes/src/week_3/randomQuteGenerator/quote.txt", true)){
            System.out.print("Write your quote here: ");
            fr.write((scanner.nextLine() + "\n"));
            System.out.println("Quote been added to the list. Thanks.");

        } catch(IOException | InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }

}





