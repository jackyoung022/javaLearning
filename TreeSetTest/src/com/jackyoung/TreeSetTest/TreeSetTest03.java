package com.jackyoung.TreeSetTest;

import java.util.Comparator;
import java.util.TreeSet;

/*
实现比较器接口t
 */
public class TreeSetTest03 {
    public static void main(String[] args) {
//        TreeSet<Turtle> t = new TreeSet<>(new TurtleComparator());//使用TreeSet的带比较器的构造方法
        TreeSet<Turtle> t = new TreeSet<>(new Comparator<Turtle>() { //使用匿名类的方法带入比较器
            @Override
            public int compare(Turtle o1, Turtle o2) {
                return o1.age - o2.age;
            }
        });
        t.add(new Turtle(100));
        t.add(new Turtle(50));
        t.add(new Turtle(200));
        for(Turtle tm : t){
            System.out.println(tm);
        }
    }
}

class Turtle{
    int age;

    public Turtle(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "age=" + age +
                '}';
    }
}

class TurtleComparator implements Comparator<Turtle> {
    @Override
    public int compare(Turtle o1, Turtle o2) {
        return o1.age - o2.age;
    }
}
