package infoshareacademy.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {
  private String questionText;
  private String answerA;
  private String answerB;
  private String answerC;
  private String correctAnswer;
  private QuestionType questionType;
  private ArrayList<String> answerList = new ArrayList<>();


  public List<String> getAnswerList() {
    return answerList;
  }

  public void addAnswersToList(String... answers) {
    for (String answer: answers) {
      answerList.add(answer);
    }
   }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public void setAnswerA(String answerA) {
    this.answerA = answerA;
  }

  public void setAnswerB(String answerB) {
    this.answerB = answerB;
  }

  public void setAnswerC(String answerC) {
    this.answerC = answerC;
  }

  public String getQuestionText() {
    return questionText;
  }

  public String getCorrectAnswer() {
    return correctAnswer;
  }

  public String getAnswerA() {
    return answerA;
  }

  public String getAnswerB() {
    return answerB;
  }

  public String getAnswerC() {
    return answerC;
  }

  public QuestionType getQuestionType() {
    return questionType;
  }

  public void setCorrectAnswer(String correctAnswer) {
    this.correctAnswer = correctAnswer;
  }

  public void setQuestionType(QuestionType questionType) {
    this.questionType = questionType;
  }
}
