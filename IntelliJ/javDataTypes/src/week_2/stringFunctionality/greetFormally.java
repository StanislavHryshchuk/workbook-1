package week_2.stringFunctionality;

import java.util.Scanner;

public class greetFormally {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(formalGreet());
    }

    public static String formalGreet(){
        System.out.println("please enter your name:");
        return "Hello, Ms. /Mr. " + scanner.nextLine().trim();
    }
}
