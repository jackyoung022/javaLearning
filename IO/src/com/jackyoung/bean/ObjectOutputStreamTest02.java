package com.jackyoung.bean;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
一次序列化多个对象，使用集合
 */
public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<Student> list = new ArrayList<>();
        list.add(new Student("1243","zhangsan"));
        list.add(new Student("2121","wangwu"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        oos.writeObject(list);
        oos.flush();
        oos.close();
    }
}
