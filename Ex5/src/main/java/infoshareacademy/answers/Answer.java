package infoshareacademy.answers;

public class Answer {

    private String content;

    private boolean status;

    public Answer(String answersContent, boolean status) {
        this.content = answersContent;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return content;
    }
}
