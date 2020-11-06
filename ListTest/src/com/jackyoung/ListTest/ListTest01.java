package com.jackyoung.ListTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("1");
        l.add(0,"2");
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        System.out.println(l.get(0));
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println(l.indexOf("2")); // 获取第一次元素出现的索引
        System.out.println(l.lastIndexOf("2")); // 获取元素最后一次出现的索引

        l.remove(0);//删除下标为0的元素

        l.set(0,"3");//替换索引位置为0的元素
    }
}
