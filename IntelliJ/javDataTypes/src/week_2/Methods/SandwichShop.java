package week_2.Methods;

import java.util.Scanner;

public class SandwichShop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double basePrice = getPriceBySizeChoice();
        double total = basePrice * getDiscountByAge();
        System.out.printf("Your total would be: %.2f", total, "$");
    }

    public static double getPriceBySizeChoice(){
        System.out.println("Please choose size of the sandwich\n1.Regural\n2.Large\n3.Regular loaded\n4.Large loaded");
        String customerSizeChoice = scanner.nextLine();
        if (customerSizeChoice.equals(("regular"))) {
            return 5.45;
        } else if(customerSizeChoice.equals("large")) {
            return 8.95;
        } else if (customerSizeChoice.equals("regular loaded")){
            return 5.45 + 1;
        } else if (customerSizeChoice.equals("large loaded")) {
            return 8.95 + 1.75;
        } else {
            return 0;
        }

    }

    public static double
    getDiscountByAge(){
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age < 17){
            return 0.9;
        } else if(age > 65) {
            return 0.8;
        } else {
            return  1;
        }

    }
}
