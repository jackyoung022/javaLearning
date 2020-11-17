package com.jackyoung.ThreadTest;
/*
编写类实现Runable接口
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread02 r = new MyThread02();
        Thread t = new Thread(r);//构造线程
        t.start();
    }
}
//这是一个可运行类
class MyThread02 implements Runnable{
    @Override
    public void run() {

    }
}