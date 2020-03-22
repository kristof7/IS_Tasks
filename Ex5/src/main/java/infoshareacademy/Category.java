package infoshareacademy;

public enum Category {
    geography("Geografia"),
    biology("Biologia"),
    finance("Finanse"),
    history("Historia"),
    film("Film");

    private String categoryDescription;

    private Category(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }
}
