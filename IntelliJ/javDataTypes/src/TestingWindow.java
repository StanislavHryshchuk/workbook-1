import java.util.Scanner;

public class TestingWindow {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);




        int secretNum = (int) Math.floor(Math.random() * 10) + 1;
        System.out.println("Guess the number between 1-10.");
        int userNum1 = userInput.nextInt();
        while (userNum1 != secretNum) {
            System.out.println("Try again!");
            userNum1 = userInput.nextInt();

        }
        System.out.println("Awesome guess!!");


    }
}
