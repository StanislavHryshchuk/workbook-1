package week_3.flashcardQuizApp;

import java.util.ArrayList;

public class Flashcard {
    private String question;
    private String answer;

    public  Flashcard(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    boolean checkAnswer(String userAnswer){
        return userAnswer.equalsIgnoreCase(answer);
    }
}
