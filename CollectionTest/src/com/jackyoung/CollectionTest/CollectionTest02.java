package com.jackyoung.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("abc");
        c.add("xyz");
        c.add("ddd");

        Iterator it = c.iterator();
        while(it.hasNext()){
            Object o = it.next();
//            c.remove(o);//这里发生了集合结构的改变，应该重新获取迭代器。出现错误
            it.remove();//使用迭代器中的remove方法，可以对迭代器进行删除元素操作
        }
    }
}
