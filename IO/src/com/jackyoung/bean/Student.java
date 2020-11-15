package com.jackyoung.bean;

import java.io.Serializable;

/*
要对该类进行序列化，需要实现Serializable接口
 */
public class Student implements Serializable {
    String no;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student() {
    }
}
