package com.jackyoung.bean;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
