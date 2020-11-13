package com.jackyoung.IOTest;

import java.io.File;

/*
listFiles:
    获取当前文件的所有子文件
 */
public class FileTest02 {
    public static void main(String[] args) {
        File f = new File("/Users/youngjack/");
        File[] files = f.listFiles();
        for(File file : files){
            System.out.println(file.getName());
        }
    }
}
