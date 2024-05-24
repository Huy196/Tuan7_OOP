package ĐaHinh;

public class FeeBasedAccount extends Account{
    double fee = 10;
    public void withdraw(double money){
        super.withdraw(money);
        double balance = fee;
    }
}
