package com.jackyoung.hashMapTest;

import java.util.*;

public class hashCodeTest01 {
    public static void main(String[] args) {
        Map<Integer,Student> map = new HashMap<>();
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("lisi");
        Student s3 = new Student("lisi");


        map.put(1111,s1);
        map.put(2222,s2);
        map.put(2222,s3);
        System.out.println(map.size());

        Set<Student> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());
    }

}
class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }
    //需要重写equals和hashCode方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}