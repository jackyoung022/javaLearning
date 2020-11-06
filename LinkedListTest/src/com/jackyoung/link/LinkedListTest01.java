package com.jackyoung.link;

import java.util.LinkedList;

public class LinkedListTest01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); //LinkedList也是有下标的
        }
    }
}
