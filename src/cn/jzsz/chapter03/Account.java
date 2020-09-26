package cn.jzsz.chapter03;

/**
 * @Author AT-zfc
 * @Since 2020-04-06 22:17
 */
class Account {

    String name;
    double balance;
    public Account(String name,double balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance(double balance) {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }
    public void withdrawal(double amount) throws InsufficientFundException{
        if (amount>balance){
            throw new  InsufficientFundException();
        }else {
            balance=balance-amount;


        }
    }

}




