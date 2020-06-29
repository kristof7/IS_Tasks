package com.isa.bookcase.utils;

import org.junit.jupiter.api.Test;

public class FileUtilsTest {

    @Test
    public void createFileShouldLogException() {
        FileUtils.createFile("");
    }

    @Test
    public void shouldCreateFile(){
        FileUtils.createFile("logs/logs4j2.txt");
    }
}
