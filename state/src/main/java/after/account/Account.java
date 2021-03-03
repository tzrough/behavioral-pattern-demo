package after.account;

public class Account {

    private AccountState accountState;
    private int balance;

    public Account(int balance) {
        this.balance = balance;
        this.accountState = new NormalState(this);
    }

    // 存款
    void deposite(int money) {
        accountState.deposite(money);
    }

    // 取款
    void withdraw(int money) {
        accountState.withdraw(money);
    }


    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
