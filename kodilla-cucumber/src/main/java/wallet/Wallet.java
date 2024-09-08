package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet(){

    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public int debit(int money) {
        if (money < 0) {
            return 0;
        } else if (money <= balance) {
            this.balance -= money;
            return money;
        } else {
            return 0;
        }
    }
}
