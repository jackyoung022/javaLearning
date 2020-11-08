package com.jackyoung.GenericTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<Animal>(); // 使用泛型指定集合中使用的数据类型
        Cat c = new Cat();
        Bird b = new Bird();

        list.add(c);
        list.add(b);

        Iterator<Animal> it = list.iterator();
        while(it.hasNext()){
            it.next().move();
        }
    }
}

class Animal{
    public void move(){
        System.out.println("move");
    }
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("catch mouse");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("fly");
    }
}