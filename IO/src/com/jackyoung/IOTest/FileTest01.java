package com.jackyoung.IOTest;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        File f = new File("myfile");
        System.out.println(f.exists()); // 判断文件存在与否

        if(!f.exists()){
            f.createNewFile();//以文件形式新建
            f.mkdir(); //以目录形式新建
        }
    }
}
