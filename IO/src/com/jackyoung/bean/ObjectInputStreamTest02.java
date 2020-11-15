package com.jackyoung.bean;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
反序列化多个对象
 */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        List<Student> list = (List<Student>)ois.readObject();
        for(Student s : list){
            System.out.println(s);
        }
        ois.close();
    }

}
