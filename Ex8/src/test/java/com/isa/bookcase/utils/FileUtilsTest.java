package com.isa.bookcase.utils;

import org.junit.jupiter.api.Test;

public class FileUtilsTest {

    @Test
    public void createFileShouldLogException() {
        FileUtils.createFile("");
    }
}
