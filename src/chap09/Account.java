package chap09;

public class Account {
    private long balance;
    public Account() {

    }
    public long getBalance() {
        return balance;
    }
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws BalancelnsufficientException {
        if (balance < money) {
            throw new BalancelnsufficientException("You do not have enough money"+ (balance - money));
        }
    }
}
