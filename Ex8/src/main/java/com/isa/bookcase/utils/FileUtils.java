package com.isa.bookcase.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileUtils {

    private static Logger LOGGER = LogManager.getLogger(FileUtils.class.getName());

    public static void createFile(String pathName) {
        File file = new File(pathName);
        try {
            file.createNewFile();
        } catch (Exception e) {
            LOGGER.error(e.getLocalizedMessage());
        }
    }
}
