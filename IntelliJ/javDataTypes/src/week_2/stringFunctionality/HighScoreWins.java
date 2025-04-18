package week_2.stringFunctionality;

import java.util.Scanner;

public class HighScoreWins {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a game score in following order (Team1 : Team2 | Score1 : Score 2)");
        String userInput = scanner.nextLine().trim();

        //String[] teams = userInput.substring(0,userInput.indexOf("|")).split(Pattern.quote(":"));
        // (team1 : team2 | 59 : 65
        String[] teams = userInput.split("\\|")[0].split(":");

        //String[] score = userInput.substring(userInput.indexOf("|")).split(Pattern.quote(":"));
        String[] score = userInput.split("\\|")[1].split(":");

        if (Integer.parseInt(score[0]) > Integer.parseInt(score[1])){
            System.out.println("Winner: " + teams[0]);
        } else {
            System.out.println("Winner: " + teams[1]);
        }
    }

}
