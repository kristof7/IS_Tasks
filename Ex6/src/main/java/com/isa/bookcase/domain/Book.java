package com.isa.bookcase.domain;

public class Book {

    private String author;
    private String title;
    private Category category;
    private int pages;
    private boolean forKids;

    public Book(String author, String title, Category category, int pages, boolean forKids) {
        this.author = author;
        this.title = title;
        this.category = category;
        this.pages = pages;
        this.forKids = forKids;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Category getCategory() {
        return category;
    }

    public int getPages() {
        return pages;
    }

    public boolean isForKids() {
        return forKids;
    }

    @Override
    public String toString() {
        return "{" + author + ", " + title + ", " + category.getCategoryDescription() + ", (" + pages + "str.)}";
    }
}
