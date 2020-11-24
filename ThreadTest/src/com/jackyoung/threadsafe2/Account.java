package com.jackyoung.threadsafe2;

/*
银行账户类
使用线程同步机制，多线程对同一个账户进行取款，解决线程安全问题
 */
public class Account {
    private String accno;
    private double balance;

    public Account(String accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double money){
        //以下的代码必须是线程排队的，不能并发。
        //一个线程把这里的代码全部执行结束后，另一个线程才能进来
        /*
        synchronized(){
            同步机制语法块
        }
        （）中写同步机制中的共享对象
         */
        synchronized (this){
            double before = this.getBalance();
            double after = before - money;
            this.setBalance(after);
        }

    }
}
