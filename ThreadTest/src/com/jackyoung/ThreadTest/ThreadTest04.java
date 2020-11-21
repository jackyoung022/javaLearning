package com.jackyoung.ThreadTest;
/*
使用Thread.yield() 让位
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        myThread04 r = new myThread04();
        Thread t = new Thread(r);
        t.setName("t");
        t.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("main-->" + i);
        }
    }
}
class myThread04 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if(i % 100 == 0){
                Thread.yield();
            }
            System.out.println("thread-->" + i);
        }
    }
}