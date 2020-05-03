package com.isa.bookcase.domain;

public enum Category {

    KRYMINAL_SENSACJA_THRILLER("kryminal/sensacja/thriller"),
    LITERATURA_PIEKNA("literatura piekna"),
    HISTORYCZNA("historyczna"),
    FANTASTYKA_SCIENCE_FICTION("fantastyka/science fiction"),
    PUBLICYSTYKA_BIOGRAFIA("publicystyka/biografia"),
    OBYCZAJOWA_ROMANS("obyczajowa/romans");

    private String categoryDescription;

    Category(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }
}

