package week_2.Methods;

import java.util.Scanner;

public class MethodExplanation {
    public static void main(String[] args) {

        printWelcome();
        playerName();
        showLevel(29);
        attackTarget(1500, "Troll");


    }
        public static void printWelcome () {
            System.out.print("Welcome\n");
        }

        public static void playerName () {

            Scanner scanner = new Scanner(System.in);
            System.out.println("What is your name??");
            String name = scanner.nextLine();
            System.out.println("Hello " + name);

        }

        public static void showLevel(int level) {
            System.out.println("Your current level " + level);
        }

        public static void attackTarget(int attack, String monster){
            System.out.println("You attacked " + monster + " with " + attack + " damage!!");
        }






    }


