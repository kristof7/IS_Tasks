package com.isa.bookcase.utils;

import java.io.File;
import java.util.logging.Logger;

public class FileUtils {
private static Logger logger =Logger.getLogger(FileUtils.class.getName());

public static void createFile(String pathName) {
        File file = new File(pathName);
        try {
            file.createNewFile();
            logger.info("created new file");
        } catch (Exception e) {
            logger.warning("file did not arise");
        }
    }

    public static void main(String[] args) {
        FileUtils.createFile("file");
    }
}
