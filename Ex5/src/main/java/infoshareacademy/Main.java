package kasia74;

public class Main {

    public static void main(String[] args) {
        QuestionRandom questionRandom = new QuestionRandom();


        questionRandom.CategoryGenerator();
        String questRandSubject = questionRandom.CategoryGenerator();

        switch (questRandSubject) {
            case "Matematyka":
                Matematyka mat = new Matematyka();
                mat.initialise();
                mat.quizQuestions();
                mat.quizOptions();
                mat.quizAnswers();
                mat.play();
                mat.result();
                break;
            case "Biologia":
                Biologia biol = new Biologia();
                biol.initialise();
                biol.quizQuestions();
                biol.quizOptions();
                biol.quizAnswers();
                biol.play();
                biol.result();

                break;
            case "Chemia":
                Chemia chem = new Chemia();
                chem.initialise();
                chem.quizQuestions();
                chem.quizOptions();
                chem.quizAnswers();
                chem.play();
                chem.result();
                break;
            default:
                System.out.println("Nie ma takiego przedmiotu");


        }
    }
}