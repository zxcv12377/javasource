package thread;

public class AccUser implements Runnable {

    private Account account = new Account();

    @Override
    public void run() {
        while (account.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            account.withdraw(money);
            System.out.println("balance : " + account.getBalance());
        }
    }
}
