package com.jackyoung.bean;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        Student s = new Student("123","zhangsan");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));
        //序列化对象
        oos.writeObject(s);

        oos.flush();
        oos.close();
    }
}
