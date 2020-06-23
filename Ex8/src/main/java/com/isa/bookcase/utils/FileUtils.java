package com.isa.bookcase.utils;

import java.io.File;

public class FileUtils {

    public static void createFile(String pathName) {
        File file = new File(pathName);
        try {
            file.createNewFile();
        } catch (Exception e) {
            // TODO: log exception message
        }
    }
}
