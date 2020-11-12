package com.jackyoung.IOTest;

import java.io.FileWriter;
import java.io.IOException;

/*
文件字符输出流，只能输出普通文本
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
//            writer = new FileWriter("myfile"); // 不存在的文件会创建新文件
            writer = new FileWriter("myfile",true);//文件末尾追加
            //写，可以写入字符数组，也可以直接写String
            char[] ch = {'1','2','3'};
            writer.write(ch);
            writer.write("21123");
            writer.flush();
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
        }
    }
}
