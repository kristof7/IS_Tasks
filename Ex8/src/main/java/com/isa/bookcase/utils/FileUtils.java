package com.isa.bookcase.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.Objects;

public class FileUtils {

    private static final Logger LOGGER;
    static {
        String path = Objects.requireNonNull(FileUtils.class.getClassLoader()
                .getResource("log4j2.xml"))
                .getFile();
        System.setProperty("log4j.configurationFile",  path);
        LOGGER = LogManager.getLogger(FileUtils.class.getName());
    }

    public static void createFile(String pathName) {
        File file = new File(pathName);
        try {
            file.createNewFile();
            LOGGER.log(Level.getLevel("INFO"), "New file created");
        } catch (Exception e) {
            LOGGER.log(Level.getLevel("INFO"), "Something goes wrong!");
        }
    }
}
