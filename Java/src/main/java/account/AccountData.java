package account;

public class AccountData {
    private final String accountHolder;
    private final int accountNumber;

    public AccountData(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}
