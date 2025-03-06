package oop;

public class AccountEx1 {
    public static void main(String[] args) {
        Account account = new Account("110-10-0100", "이름", 1000000);

        account.deposit(1000);
        System.out.println(account.getBalance());
        System.out.println();

        account.withdraw(50000000);
        System.out.println(account.getBalance());
    }
}
