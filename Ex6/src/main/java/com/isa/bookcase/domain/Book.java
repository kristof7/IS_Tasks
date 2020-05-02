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

    public String PlTranslateForKids(){
        if(isForKids()){
            return " Tak";
        }
        return " Nie";
    }

    @Override
    public String toString() {
        return "<br>Autor : " + author + ", Tytuł : " + title + ", Kategoria : " + category + ", (" + pages + "str.) " + ", dla dzieci : " + PlTranslateForKids() ;
    }
}
