package week_1;

import java.util.Scanner;

public class JavaBeginerMiniProjects {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // 1
        System.out.println("Please Enter your name: ");
        String name = userInput.nextLine();
        System.out.println("Hello" + name);

        //2
        System.out.println("How old are you? ");
        int age = userInput.nextInt();
        int dogAge = age * 7;
        System.out.println("In dog years you would be " + dogAge + "years old!)");

        //3
        int randomNum = (int) Math.floor(Math.random() * 6) + 1;
        System.out.println("Your dice roll number is: " + randomNum);

        //4
        System.out.println(name + "please tell me your Strength and Agility in numbers: ");
        int sterngth = userInput.nextInt();
        int agility = userInput.nextInt();
        System.out.println("Your Sterngth is: " + sterngth + "\n" + "Your Agility is: " + agility);

        //5
        System.out.println("What is your current level?");
        int level = userInput.nextInt();
        int levelUp = level + 1;
        System.out.println("Congrats you just leveled up!!!\nYour current level is: " + levelUp);

        //6
        System.out.println("How many gold and silver coins do you have?");
        int goldCoins = userInput.nextInt();
        int silverCoins = userInput.nextInt();
        int totalPoints = (goldCoins * 10) + silverCoins;
        System.out.println("Your total Score is: " + totalPoints);

        //7
        if (randomNum % 2 == 0) {
            System.out.println("Number" + randomNum + "is Even");
        } else {
            System.out.println("Number" + randomNum + "is Odd");
        }

        //8
        System.out.println("What is your luck stat?");
        int luck = userInput.nextInt();
        userInput.nextLine();
        if (luck > 50) {
            System.out.println("Critical Hit");
        } else {
            System.out.println("Normal Hit");
        }

        //9
        System.out.println("What is your character type? Warrior or Mage?");
        String heroClass = userInput.nextLine();
        switch (heroClass){
            case "Warrior":
                System.out.println("Your weapon is a Sword!");
                break;
            case "Mage":
                System.out.println("Your weapon is Staff");
                break;
            default:
                System.out.println("Input incorrect!");
        }

        //10
        final int secretNumber = 15;
        System.out.println("Please guess the number and you can win 1 gold coin");
        int guessNum = userInput.nextInt();
        if (guessNum == secretNumber){
            System.out.println("You won a gold coin");
            goldCoins += goldCoins + 1;
        }else {
            System.out.println("Sorry, better luck next time!!!");
        }

        //11
        System.out.println("what is your current speed?");
        int playerSpeed = userInput.nextInt();
        if (playerSpeed > 100) {
            System.out.println(playerSpeed + "Too fast! Slow down");
        }else {
            System.out.println("Normal speed");
        }

        /*12

        String playerChoise = userInput.nextLine();
        System.out.println("Please select one from following: 'rock' 'paper' 'scissors'");
        int rock = (int) Math.floor(Math.random() * 3) + 1;
        int paper = (int) Math.floor(Math.random() * 3) + 1;
        int scissors = (int) Math.floor(Math.random() * 3) + 1;
        */

        //13
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

        //14
        System.out.println("What is your Attack power?");
        int attackPower = userInput.nextInt();
        System.out.println("what is Enemy defence?");
        int enemyDefence = userInput.nextInt();
        int damage = attackPower - enemyDefence;
        if (damage < 0) {
            damage = 0;
            System.out.println("Damage dealt " + damage);
        }else{
            System.out.println("Damage dealt " + damage);
        }

        //15
        System.out.println("What is your Current XP?");
        int currntXp = userInput.nextInt();
        System.out.println("How much XP needed for level up?");
        int levelUpXP = userInput.nextInt();
        int notEnough = levelUpXP - currntXp;
        System.out.println(notEnough + " XP needed to the next level");

        //16
        int randomNum2 = (int) Math.floor(Math.random() * 100) +1;
        System.out.println("Please guess the number from 0-100");
        int userNum = userInput.nextInt();

        if (Math.abs(randomNum2-userNum) <= 5){
            System.out.println("Door Opens!");
        } else {
            System.out.println("Try again");
        }

        //17
        System.out.println("what is monster HP?");
        int monsterHP = userInput.nextInt();
        int monsterHpAfterHit = monsterHP - attackPower;
        System.out.println("Monster HP: " + monsterHP + "\nCurrent HP: " + monsterHpAfterHit);

        //18
        System.out.println("Do you want to open chest?");
        String userAnswer = userInput.nextLine();
        switch (userAnswer){
            case "yes":
                int chance = (int) Math.floor(Math.random() * 2) + 1;
                if (chance == 1){
                    System.out.println("You received 100 gold coins");
                } else {
                    System.out.println("You received 100 damage.");
                }
            break;
            case "no":
                System.out.println("Good luck!");
            break;
        }

        //21
        int rollDice = 0;
        while (rollDice != 6){
            rollDice = (int) (Math.random() * 6) + 1;
            System.out.println("You rolled " + rollDice);

        }
        System.out.println("You finally rolled 6!");

        //23
        int secretNum = (int) Math.floor(Math.random() * 10) + 1;
        System.out.println("Guess the number between 1-10.");
        int userNum1 = userInput.nextInt();
        while (userNum1 != secretNum) {
            System.out.println("Try again!");
            userNum1 = userInput.nextInt();
        }
        System.out.println("Awesome guess!!");

        //30
        System.out.println("Please pick the number from 1 - 10");
        int userNum2 = userInput.nextInt();
        int roll = 0;
        int matchCount = 0;
        while (roll != 10){
            int randomNum4 = (int) Math.floor(Math.random() * 10) + 1;
            System.out.println(randomNum4);
            if (randomNum4 == userNum2){
                matchCount++;
            }
            roll++;
        }
        System.out.println("Your number appeared " + matchCount + " times");

        //24
        System.out.println("Please pick:\n1.Rock\n2.Paper\n3.Scissors");
        int computerWinCount = 0;
        int userWinCount = 0;
        int gamesPlayed = 1;

        while (computerWinCount != 2 && userWinCount != 2) {

            System.out.println("Game #" + gamesPlayed);
            int computerChoose = (int) Math.floor(Math.random() * 3) + 1;
            int userChoice = userInput.nextInt();
            System.out.println(computerChoose);

            if (userChoice == computerChoose){
                System.out.println("Draw. Play one more time!");
                gamesPlayed++;

            }else if (computerChoose > userChoice || computerChoose == 1 && userChoice == 3){
                System.out.println("Computer Win");
                computerWinCount++;
                gamesPlayed++;

            } else {
                System.out.println("User Win");
                userWinCount++;
                gamesPlayed++;
            }
        }
        System.out.println("---------------Games played " + gamesPlayed + "-------------------");

        if (userWinCount > computerWinCount) {
            System.out.println("User Won!!!");
        } else {
            System.out.println("Computer Won!!!");
        }

        //28
        System.out.println("Please make a choice:\n1.Punch\n2.Kick\n3.Fireball");
        int userChoice1 = userInput.nextInt();

        switch (userChoice1){
            case 1:
                System.out.println("You punched someone");
                break;
            case 2:
                System.out.println("You kicked someone");
                break;
            case 3:
                System.out.println("You fried someone");
                break;
        }
    }
}





