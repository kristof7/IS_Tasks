package com.isa.bookcase.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileUtilsTest {

    @Test
    public void createFileShouldLogException() {
        FileUtils.createFile("");
    }
    @Test
    public void ifcreatedFile()throws IOException {
        FileUtils.createFile("logs4j2.txt");
    }
}