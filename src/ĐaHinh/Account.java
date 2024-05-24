package ĐaHinh;

public class Account {
    private double balance = 0;
    public void depoit(double money){
        balance += money;
    }
    public void withdraw(double money){
        balance -= money;
    }
}
