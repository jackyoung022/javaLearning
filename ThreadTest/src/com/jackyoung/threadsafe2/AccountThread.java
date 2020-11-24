package com.jackyoung.threadsafe2;

public class AccountThread extends Thread{
    //线程必须共享同一个账户对象
    private Account act;
    public AccountThread(Account act){
        this.act = act;
    }
    public void run(){
        //取款动作
        double money = 5000;
        act.withdraw(money);

        System.out.println(act.getAccno() + " 取款 " + money + " 余额 " + act.getBalance());
    }
}
