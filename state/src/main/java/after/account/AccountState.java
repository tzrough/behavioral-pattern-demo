package after.account;

/**
 * 抽象状态【账户状态】
 */
public interface AccountState {

    void deposite(int money);

    void withdraw(int money);

    String getState();

    void updateState();
}
