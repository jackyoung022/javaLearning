package com.jackyoung.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
@SuppressWarnings("unchecked")
public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);

        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
