package com.jackyoung.IOTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        //创建字节流
        FileInputStream in = new FileInputStream("myfile");

        //BufferedReader不能传入字节流，需要使用转换流对字节流转换
        InputStreamReader reader = new InputStreamReader(in);

        BufferedReader br = new BufferedReader(reader);
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
