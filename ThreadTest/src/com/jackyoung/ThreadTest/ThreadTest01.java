package com.jackyoung.ThreadTest;

public class ThreadTest01 {
    public static void main(String[] args) {
        //创建分支线程
        MyThread myThread = new MyThread();
        //开辟新的栈，启动线程
        //start()方法的执行时间很短
        myThread.start();

        //主方法的线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("main--->" + i);
        }
    }
}

class MyThread extends Thread{
    //分支线程的主线程
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("thread--->" + i);
        }
    }
}