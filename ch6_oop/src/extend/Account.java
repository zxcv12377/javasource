package extend;

public class Account {
    private String ano;
    private String owner;
    private long balance;

    // public Account() {
    // }

    public Account(String ano, String owner, long balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long balance) {
        this.balance += balance;
    }

    public void withdraw(long balance) throws Exception {
        if (balance > this.balance)
            throw new Exception("잔액이 부족합니다.");
        this.balance -= balance;
    }

    @Override
    public String toString() {
        return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
