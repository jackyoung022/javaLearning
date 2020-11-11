package com.jackyoung.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("README.md");

            byte[] bytes = new byte[4];
//            while(true){
//                int readCount = fis.read(bytes);
//                if(readCount == -1) break;
//                System.out.print(new String(bytes,0,readCount));
//            }
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1){
                System.out.print(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
