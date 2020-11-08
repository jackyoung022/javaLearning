package com.jackyoung.MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
遍历map
 */
public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "zhangsan");
        m.put(2, "wangwu");
        m.put(3, "lisi");

        Set<Integer> keys = m.keySet();

//        Iterator<Integer> it = keys.iterator();
//        while(it.hasNext()){
//            Integer key = it.next();
//            String value = m.get(key);
//            System.out.println(key + "=" + value);
//        }
        for(Integer key : keys){
            System.out.println(key + "=" + m.get(key));
        }
        System.out.println("=======================================");
        //使用Set<Map.Entry<K,V>> entrySet();
        Set<Map.Entry<Integer,String>> set = m.entrySet();
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while(it2.hasNext()) {
            Map.Entry<Integer, String> entry = it2.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        for(Map.Entry<Integer, String> node : set){
            System.out.println(node.getKey() + "-->" + node.getValue());
        }
    }
}
