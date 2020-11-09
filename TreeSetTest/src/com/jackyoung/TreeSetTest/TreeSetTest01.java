package com.jackyoung.TreeSetTest;

import java.util.TreeSet;

/*
使用自定义类的时候，需要继承Comparable，重写compareTo方法
 */
public class TreeSetTest01 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(15);
        TreeSet<Person> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        for (Person p: set) {
            System.out.println(p);
        }
    }
}
class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) { //重写该方法，让TreeSet知道如何比较
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}