package infoshareacademy;

public class Quiz {

    public static void startQuiz(){
    DatabaseOfQuestions base = new DatabaseOfQuestions();
    base.addingQuestionsToDatabase();
    base.readingQuestionsFromDatabase();
    }
}
