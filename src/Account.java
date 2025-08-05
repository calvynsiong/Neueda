public class Account {
    private AccountType accountType;

    public Account() {
        this.accountType = AccountType.CHECKING;
    }

    public Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account Type: " + accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return accountType == account.accountType;
    }

    @Override
    public int hashCode() {
        return accountType != null ? accountType.hashCode() : 0;
    }
}
