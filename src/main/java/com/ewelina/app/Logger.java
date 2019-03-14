package com.ewelina.app;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Logger {

    public java.util.logging.Logger logger;
    FileHandler fh;

    public Logger(String file_name) throws SecurityException, IOException{

        File f = new File(file_name);
        if(!f.exists()){
            f.createNewFile();
        }

        fh = new FileHandler("/Users/ewelina/Documents/CRM_CarWorksopProject/" + file_name);
        logger = java.util.logging.Logger.getLogger("test");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }
}
