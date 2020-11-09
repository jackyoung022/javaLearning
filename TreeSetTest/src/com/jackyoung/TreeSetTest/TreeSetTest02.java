package com.jackyoung.TreeSetTest;

import java.util.TreeSet;

/*
字符与数字混合比较
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<VIP> vips = new TreeSet<>();
        vips.add(new VIP(10,"zhangsan"));
        vips.add(new VIP(10,"zhangli"));
        vips.add(new VIP(30,"wangsan"));
        vips.add(new VIP(25,"wangwu"));

        for(VIP v : vips){
            System.out.println(v);
        }
    }
}
class VIP implements Comparable<VIP>{
    int age;
    String name;

    public VIP(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "VIP{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(VIP v) {
        if(this.age == v.age){
            return this.name.compareTo(v.name);
        }else{
            return this.age - v.age;
        }
    }
}