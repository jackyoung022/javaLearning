package com.jackyoung.hashMapTest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
/*
hashTable的key不能为空,value也不能为空
 */
public class hashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,"123");//NullPointerException
    }
}
