package week_1;

import java.util.Scanner;

public class Potions {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //6
        System.out.println("How many gold and silver coins do you have?");
        int goldCoins = userInput.nextInt();
        int silverCoins = userInput.nextInt();
        userInput.nextLine();
        int totalPoints = (goldCoins * 10) + silverCoins;
        System.out.println("Your total Score is: " + totalPoints);

        int potionCost = 15;
        System.out.println("Do you need a week_1.Potions?");
        String potions = userInput.nextLine();

        switch (potions) {
            case "yes":
                System.out.println("How many you need? Enter quantity: ");
                int potionsQuantity = userInput.nextInt();
                int totalCost = potionCost * potionsQuantity;

                if (goldCoins >= totalCost) {
                    double change = goldCoins - totalCost;
                    System.out.println("Great you purchase " + potionsQuantity + " potions\n" + "Your change is " + (int)change + " gold");
                } else {
                    System.out.println("Not enough gold");
                }
                break;
            case "no":
                System.out.println("Good luck surviving in the dungeons");
                break;
        }



    }
}
