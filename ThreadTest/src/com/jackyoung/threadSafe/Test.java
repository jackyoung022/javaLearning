package com.jackyoung.threadSafe;

public class Test {
    public static void main(String[] args) {
        Account act = new Account("act-001",10000);
        //两个线程使用同一个act对象
        AccountThread t1 = new AccountThread(act);
        AccountThread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
