package com.isa.bookcase.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FileUtilsTest {

    @Test
    public void createFileShouldLogException() throws IOException {
        FileUtils.createFile("");
    }
}
