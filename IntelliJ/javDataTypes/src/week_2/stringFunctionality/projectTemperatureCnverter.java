package week_2.stringFunctionality;

import java.util.Scanner;

public class projectTemperatureCnverter {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-------------------Welcome to Temperature Converter--------------");

        boolean running = true;

        while (running){
            System.out.println("What convertor you want to use?");
            System.out.println("1. Convert Celsius to Fahrenheits.\n2. Convert Fahrenheits to Celsius.\n3. Exit.");
            String userChoice = scanner.nextLine().trim();
            switch (userChoice){
                case "1" -> System.out.printf("%.1f°F\n",celsiusToFahrenheits());
                case "2" -> System.out.printf("%.1f°C\n", fahrenheitsToCelsius());
                case "3" -> {
                    running = false;
                    System.out.println("Thank you for using Temperature Converter");
                }
                default -> System.out.println("Invalid enter. Please enter 1 - 3.");
            }
            if (!userChoice.equals("3")){
                System.out.println("Would you like to try another? (yes | no)");
                String continueCalc = scanner.nextLine().trim();
                switch (continueCalc.toLowerCase()){
                    case "yes" -> {
                    }
                    case "no" -> {
                        running = false;
                        System.out.println("Thank you for using Temperature Converter");
                    }
                    default -> System.out.println("Invalid enter. Please enter 1 - 3.");
                }
            }
        }
    }

    public static double celsiusToFahrenheits (){
        System.out.println("Celsius to Fahrenheits");

        System.out.print("Enter the Celsius temperature: ");
        int celsiusValue = scanner.nextInt();
        scanner.nextLine();

        return (celsiusValue * (double) 9/5) + 32;
    }

    public static double fahrenheitsToCelsius (){
        System.out.println("Fahrenheits to Celsius");

        System.out.print("Enter the Fahrenheits temperature: ");
        int fahrenheitsValue = scanner.nextInt();
        scanner.nextLine();

        return (double) (fahrenheitsValue -32) * 5 / 9;
    }
}
