package com.jackyoung.IOTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("myfile");
            //BufferedReader的构造方法需要传入一个Reader类
            // FileReader 节点流 ， BufferedReader 处理流
            BufferedReader br = new BufferedReader(reader);
            //读一行,但是不读换行符
            String firstLine = br.readLine();

            String s = null;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close(); // 这里只需要关闭外部处理流，源码对节点流有关闭处理
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
