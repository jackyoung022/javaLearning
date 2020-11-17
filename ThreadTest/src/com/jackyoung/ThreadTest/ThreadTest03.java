package com.jackyoung.ThreadTest;
//使用标记run来控制线程结束
public class ThreadTest03 {
    public static void main(String[] args) {
        MyThread03 r = new MyThread03();
        Thread t = new Thread(r);
        t.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
    }
}
class MyThread03 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(run){
                System.out.println("thread -->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }


    }
}