package com.jackyoung.hashMapTest;

import java.util.HashMap;
import java.util.Map;

/*
hashMap中的key可否为null
    答：可以

 */
public class hashCodeTest02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(null,null);

    }
}
