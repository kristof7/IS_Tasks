package infoshareacademy;

public class Question {
    private Integer id;
    private Category category;
    private String question;

    public Question(Integer id, Category category, String question) {
        this.id = id;
        this.category = category;
        this.question = question;

    }

    public Integer getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return category + " " + question;
    }
}
