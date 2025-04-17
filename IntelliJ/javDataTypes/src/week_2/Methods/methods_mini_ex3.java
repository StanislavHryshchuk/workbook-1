package week_2.Methods;

import java.util.Scanner;

public class methods_mini_ex3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //2
       int xp = doubleXP();
       System.out.println("Your current XP been doubled " + xp);
       System.out.println(hasLeveledUp(100,100, "Stan"));



    }

    //2
    public static int doubleXP() {
        System.out.println("please enter your current XP");
        int userInput = scanner.nextInt();
        return userInput * 2;
    }



    //3
    public static boolean hasLeveledUp(int currentXP, int threshold, String name){
        if (currentXP >= threshold ){
            System.out.println(name);
            return true;
        } else {
            return false;
        }


    }

}
