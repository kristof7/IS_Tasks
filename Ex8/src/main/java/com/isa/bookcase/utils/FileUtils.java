package com.isa.bookcase.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class FileUtils {

    private static Logger LOGGER;

    static {
        String path = FileUtils.class.getClassLoader()
                .getResource("log4j2_config.xml")
                .getFile();
        System.setProperty("log4j.configurationFile",  path);
        LOGGER = LogManager.getLogger(FileUtils.class.getName());
    }

    public static void createFile(String pathName) {
        File file = new File(pathName);
        try {
            file.createNewFile();
        } catch (Exception e) {
            LOGGER.error("Can't create file - error");
        }
    }
}
