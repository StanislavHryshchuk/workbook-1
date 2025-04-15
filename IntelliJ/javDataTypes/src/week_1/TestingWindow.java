package week_1;

import java.util.Scanner;

public class TestingWindow {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please pick:\n1.Rock\n2.Paper\n3.Scissors");
        int computerWinCount = 0;
        int userWinCount = 0;
        int gamesPlayed = 1;

        while (computerWinCount != 2 && userWinCount != 2) {

            System.out.println("GAME #" + gamesPlayed);
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

    }
}
