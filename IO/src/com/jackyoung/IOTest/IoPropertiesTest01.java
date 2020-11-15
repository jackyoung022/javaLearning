package com.jackyoung.IOTest;

import java.io.FileReader;
import java.util.Properties;

/*
使用IO和Properties从硬盘读取数据
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception{
        //输入流对象
        FileReader reader = new FileReader("IO/userinfo");
        //Map集合
        Properties pro = new Properties();
        //调用load方法将文件数据加载到Map中
        pro.load(reader);

        String username = pro.getProperty("username");
        System.out.println(username);
    }
}
