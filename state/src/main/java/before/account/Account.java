package before.account;

public class Account {

    private String accountState;
    private int balance;

    public Account(int balance) {
        this.balance = balance;
        this.accountState = AccountStateEnum.NORMAL_STATE.name();
    }

    // 存款
    void deposite(int money) {
        this.balance += money;
        System.out.println("账户入账 " + money);
        checkState();
    }

    // 取款
    void withdraw(int money) {
        if(accountState.equalsIgnoreCase(AccountStateEnum.NORMAL_STATE.name()) || accountState.equalsIgnoreCase(AccountStateEnum.OVER_DARFT_STATE.name())) {
            this.balance -= money;
            System.out.println("账户支出 " + money);
            checkState();
            computeInterest();
        }else {
            System.out.println("账户支出受限");
            computeInterest();
        }
    }

     private void computeInterest() {
        if(accountState.equalsIgnoreCase(AccountStateEnum.RESTRICTED_STATE.name()) || accountState.equalsIgnoreCase(AccountStateEnum.OVER_DARFT_STATE.name())) {
            System.out.println("账户每日需支付利息 " + balance * 0.1);
        }
    }


    void checkState() {
        if (balance >= 0) {
            accountState = AccountStateEnum.NORMAL_STATE.name();
        }
        else if (balance > -2000 && balance < 0) {
            accountState = AccountStateEnum.OVER_DARFT_STATE.name();
        }
        else if (balance <= -2000) {
            accountState = AccountStateEnum.RESTRICTED_STATE.name();
        }
        System.out.println("账户状态更新为 " + accountState);
    }

}
