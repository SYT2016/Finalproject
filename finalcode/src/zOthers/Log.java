/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zOthers;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 *
 * @author liu
 */
public class Log {
    public static Logger log;
    public Log() throws IOException{
        log.setLevel(Level.ALL);
        FileHandler fileHandler=new FileHandler("records.log");
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new LogFormatter());
        log.addHandler(fileHandler);
    }
    public static void record(String meg){
        log.info(meg);
    }
}

