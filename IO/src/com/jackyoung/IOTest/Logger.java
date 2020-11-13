package com.jackyoung.IOTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
日志文件工具类
 */
public class Logger {
    public static void log(String msg){
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("log.txt",true));
            System.setOut(ps);

            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String strTime = sdf.format(nowTime);
            System.out.println(strTime + ": " + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
