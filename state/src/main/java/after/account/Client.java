package after.account;

public class Client {

    public static void main(String[] args) {
        Account account = new Account(1000);

        account.withdraw(1000);
        account.withdraw(2000);
        account.withdraw(3000);
        account.withdraw(4000);
    }
}
