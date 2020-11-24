package com.jackyoung.threadSafe;

/*
银行账户类
不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
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
        double before = this.getBalance();
        double after = before - money;
        this.setBalance(after);
    }
}
