package after.account;

/**
 * 具体状态【正常状态】
 */
public class RestrictedState implements AccountState{

    private Account account;

    public RestrictedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposite(int money) {
        int balance = account.getBalance();
        balance += money;
        account.setBalance(balance);
        System.out.println("账户入账 " + money);
        updateState();
    }

    @Override
    public void withdraw(int money) {
        System.out.println("账户支出受限");
        updateState();
    }


    private String computeInterest() {
        int balance = account.getBalance();
        return "账户每日需支付利息 " + balance * 0.1;
    }

    @Override
    public String getState() {
       StringBuffer sb = new StringBuffer();
       sb.append("账户当前状态为 ");
       sb.append(AccountStateEnum.RESTRICTED_STATE.name());
       sb.append("\n");
       sb.append(computeInterest());
       return sb.toString();
    }


    @Override
    public void updateState() {
        int balance = account.getBalance();

        if (balance >= 0) {
            account.setAccountState(new NormalState(account));
        } else if (balance >= -2000 && balance < 0) {
            account.setAccountState(new OverDraftState(account));
        }

        System.out.println(account.getAccountState().getState());
    }
}
