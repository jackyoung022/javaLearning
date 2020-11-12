package com.jackyoung.IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
使用文件字符输入流
 */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("myfile");

            char[] ch = new char[4];
            int readCount = 0;
            while((readCount = reader.read()) != -1){
                System.out.println(new String(ch,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
