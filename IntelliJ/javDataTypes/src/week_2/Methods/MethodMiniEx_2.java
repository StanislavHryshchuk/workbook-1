package week_2.Methods;

import java.util.Scanner;

public class MethodMiniEx_2 {


    public static void main(String[] args) {
        //1
        System.out.println("Lord " + getPlayerTitle() + " it's an honor to see you!");
        //2
        int xp = doubleXp(100);
        System.out.println("Your current XP been doubled " + xp);
        //3
        if (hasLeveledUp(xp, 500)) {
            System.out.println("Congrats, you have leveled UP!!!");
        } else {
            System.out.println("Keep grinding...");
        }
        //4
        System.out.println("Roll #1 " + rollDice());
        System.out.println("Roll #2 " + rollDice());
        System.out.println("Roll #3 " + rollDice());
        //5
        calculateDamage(100, 201);
        //6
        System.out.println(canOpenChest());
        //7
        getplayerClass();
        //8
        System.out.println(addGold(100));
        //9
        System.out.println(isQuestComplete(4,4));


    }

    //1
    public static String getPlayerTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String playerTitle = scanner.nextLine();
        return playerTitle;
    }

    //2
    public static int doubleXp(int xp) {
        return xp * 2;

    }

    //3
    public static boolean hasLeveledUp(int xp, int threshold) {
        if (xp > threshold) {
            return true;
        } else {
            return false;
        }
    }

    //4
    public static int rollDice() {
        return (int) (Math.floor(Math.random() * 6) + 1);
    }

    //5
    public static int calculateDamage(int strength, int enemyDefence) {
        int damageDealt = (strength * 2) - enemyDefence;

        if (damageDealt < 0) {
            damageDealt = 0;
        }
        System.out.println("You dealt " + damageDealt + " damage");
        return damageDealt;
    }

    //6
    public static boolean canOpenChest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a key? Lock on the chest is broken?");
        String hasKey = scanner.nextLine();
        String lockIsBroken = scanner.nextLine();
        if (hasKey.equals("yes") && lockIsBroken.equals("no")) {
            return true;
        }
        return false;
    }

    //7
    public static void getplayerClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number from 1-3 to define your class!");
        int playerChoice = scanner.nextInt();
        switch (playerChoice) {
            case 1:
                System.out.println("Your class is Warrior");
                break;
            case 2:
                System.out.println("Your class is Mage");
                break;
            case 3:
                System.out.println("your class is Rogue");
                break;
        }


    }

    //8
    public static double addGold(int currentGold) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much gold you found on the way?");
        double goldFound = scanner.nextInt();
        if (goldFound > 100) {
            goldFound -= goldFound * 0.1;
        }
         return currentGold + goldFound;


    }
    //9
    public static boolean isQuestComplete(int tasksDone, int totalTasks){
        if (tasksDone != totalTasks) {
            System.out.println("You still have work to do! Go work, stop chilling!");
        }
        return true;
    }
}

