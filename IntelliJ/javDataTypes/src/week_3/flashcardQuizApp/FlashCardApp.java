package week_3.flashcardQuizApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlashCardApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n----------------Welcome to Flashcard Quiz Game-----------------\n");
        System.out.println("How many rounds you want to play? (max 5)");
        int userChoiceRound = scanner.nextInt();
        scanner.nextLine();
        int loopCount = 0;
        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;
        int totalQuestionsCount = 0;
        List<String> userAnswers = new ArrayList<>();
        while(loopCount != userChoiceRound){

            System.out.println("Round: " + (loopCount + 1));

            Flashcard flashcard = singleFlashCard();

            System.out.println("Question: " + (loopCount + 1) +"\n"+ flashcard.getQuestion());
            totalQuestionsCount++;
            userAnswers.add(scanner.nextLine());

            if (flashcard.checkAnswer(String.valueOf(userAnswers.get(loopCount)))){
            System.out.println("Correct");
            correctAnswerCount++;
            } else {
                System.out.println("Wrong");
                wrongAnswerCount++;
            }

            loopCount++;
        }

        double totalScore = ((double) correctAnswerCount / totalQuestionsCount) * 100;
        userAnswers.forEach(System.out::println);
        System.out.println("Total questions asked: "+totalQuestionsCount + "\nYou answered right to " + correctAnswerCount + " questions\nPrecentage of right answers is: " + totalScore + "%");


//        System.out.println(flashcard.getQuestion());
//
//        String userAnswer = scanner.nextLine();
//        if (flashcard.checkAnswer(userAnswer)){
//            System.out.println("Correct");
//        }

    }



    public static Flashcard singleFlashCard(){
        List<Flashcard> flashCards = new ArrayList<>();

        flashCards.add(new Flashcard("What color is the sky on a clear day?","Blue"));
        flashCards.add((new Flashcard("What do bees make?", "Honey")));
        flashCards.add((new Flashcard("What is the opposite of cold?", "Hot")));
        flashCards.add((new Flashcard("What animal barks?", "Dog")));
        flashCards.add((new Flashcard("What do you drink when you're thirsty?", "Water")));

        int randomNumber = (int) (Math.random() * flashCards.size());
        return flashCards.get(randomNumber);
    }

}
