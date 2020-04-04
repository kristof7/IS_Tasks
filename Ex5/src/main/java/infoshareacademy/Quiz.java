package infoshareacademy;

import java.util.List;
import java.util.Scanner;

public class Quiz {
    //To jest obecny numer pytania
    private int questionNumber;
    //To sa juz wylosowane i pomieszane pytania
    private List<Question> questionList;
    private int punkty = 0;

    public Quiz(List<Question> questionList) {
        questionNumber = 1;
        this.questionList = questionList;
    }

    public void displayQuestion(){
        System.out.println("Numer pytania: " + questionNumber);
        questionList.get(questionNumber-1).showQuestion();
    }

    public void compareProvidedAnwserToRightOne(){
        Scanner providedAnwser = new Scanner(System.in);
        String resultAnwser = providedAnwser.nextLine();

        if (!questionList.get(questionNumber-1).isRightAnwserLetter(resultAnwser.charAt(0))){
            System.out.println("Poprawna odp to: ");
            questionList.get(questionNumber-1).showRightAnwser();
        } else {
            System.out.println("Dobrze");
            punkty ++;
        }
    }

    public boolean isOver(){
        return questionNumber-1 == questionList.size();
    }

    public void nextQuestion(){
        questionNumber++;
    }

    public void showResult(){
        System.out.println("Twoja suma punktow: " + punkty);
    }

}
