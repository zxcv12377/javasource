package extend;

public class BonusPointAccount extends Account {

    private int bonus;

    public BonusPointAccount(String ano, String owner, long balance, int bonus) {
        super(ano, owner, balance);
        this.bonus = bonus;
    }

    @Override
    public void deposit(long balance) {
        bonus += balance * 0.01;
        super.deposit(balance + bonus);

        bonus += balance * 0.01;
        System.out.println(bonus);
        // bonus = bonus + balance *0.01;
    }
}
