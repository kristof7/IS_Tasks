package infoshareacademy.quiz;

import java.util.Scanner;

public class Quiz {

  public void askAQuestion(Question question, int iterator){
    System.out.println("Pytanie numer " + iterator + ": ");
    System.out.println("Kategoria: "+ translateQuestionType(question.getQuestionType()));
    System.out.println(question.getQuestionText());
    for (int i = 0; i < question.getAnswerList().size(); i++) {
      System.out.println(question.getAnswerList().get(i));
    }
  }

  public boolean expectAnAnswer(Question question){
    System.out.println("Która odpowiedź jest poprawna?");
    Scanner scanner = new Scanner(System.in);
    String givenAnswer = scanner.nextLine().toLowerCase();
    if (givenAnswer.contentEquals(question.getCorrectAnswer())) {
      System.out.println("Prawidłowa odpowiedź!");
      return true;
    }
    else {
      System.out.println("Niestety, prawidłowa odpowiedź to: "+question.getCorrectAnswer());

    }
    return false;
  }

  private String translateQuestionType(QuestionType questionType) {
    String result;
    switch (questionType){
      case FILM:
        result = "Film";
        break;
      case MUSIC:
        result = "Muzyka";
        break;
      case HISTORY:
        result = "Historia";
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + questionType);
    }
    return result;
  }

}
