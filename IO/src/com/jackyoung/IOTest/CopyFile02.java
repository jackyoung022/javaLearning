package com.jackyoung.IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用FileReader和FileWriter只能拷贝普通文本文件
 */
public class CopyFile02 {
    public static void main(String[] args) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("myfile");
            writer = new FileWriter("copymyfile");
            char[] ch = new char[10 * 1024];
            int readCount = 0;
            while((readCount = reader.read(ch)) != -1){
                writer.write(ch,0,readCount);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
