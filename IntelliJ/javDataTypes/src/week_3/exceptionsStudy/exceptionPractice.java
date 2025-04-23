package week_3.exceptionsStudy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionPractice {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        task8();

    }

    //1
    public static void task1(){
        System.out.println("Please enter 2 numbers");

        boolean running = true;

        while (running){
            try {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int result = num1 / num2;
                System.out.println(result);
                running = false;
                scanner.nextLine();
            } catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println("Entered data not a number");
            }
        }
    }
    //2
    public static void task2(){
        System.out.println("please entre the number");
        boolean run = true;
        while (run){
            try {
                int number = Integer.parseInt(scanner.nextLine());
                run = false;
            } catch (Exception e) {
                System.out.println("You entered text instead of a number");
            }
        }
    }
    //4
    public static void task4(){
        boolean r = true;
        while (r){
            try {
                System.out.println("please guess the number");
                int userInput = scanner.nextInt();
                int hardcodedNumber = 6;
                if(userInput == hardcodedNumber){
                    System.out.println("you are right");
                } else {
                    scanner.nextLine();
                    continue;
                }
                r = false;
            }  catch (Exception e){
                scanner.nextLine();
                System.out.println("wrong input type");

            }
        }
    }
    //8
    public static void task8(){
        int count = 0;
        int total = 0;
        while (count < 3){
            System.out.println("Please enter number" + (count +1));
            try {
                int nr = scanner.nextInt();
                total += nr;
                count++;
            } catch (InputMismatchException e){
                System.out.println("wrong input");
                scanner.nextInt();
            }
        }
    }
}
