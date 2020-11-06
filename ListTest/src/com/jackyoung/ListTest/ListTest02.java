package com.jackyoung.ListTest;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
/*
ArrayList的构造
 */
public class ListTest02 {
    public static void main(String[] args) {
        List l1 = new ArrayList(); // 无参构造
        List l2 = new ArrayList(100); // 给定初始容量构造

        Collection c = new HashSet();
        c.add(1);
        c.add(2);
        c.add(3);
        List l3 = new ArrayList(c); // 使用其他集合构造
    }
}
