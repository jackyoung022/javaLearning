package com.jackyoung.IOTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
//            fos = new FileOutputStream("myfile");//myfile如果不存在会自动新建,会将原文件清空再使用
            fos = new FileOutputStream("myfile",true);//追加写入
            byte[] bytes = {97,98,99,100};
            //fos.write(bytes);

            fos.write(bytes,0,2);

            fos.flush();//文件写入完成要刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
