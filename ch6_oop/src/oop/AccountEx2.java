package oop;

import java.util.Scanner;

public class AccountEx2 {

    private static Account account;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // AccountEx2 obj = new AccountEx2();
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("------------------------------------------------------------");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    account = createAccount();

                    break;
                case 2:
                    accountList(account);
                    break;
                case 3:
                    deposit(account);
                    break;
                case 4:
                    withdraw(account);
                    break;
                case 5:
                    run = false;
                    break;

                default:
                    System.out.println("잘못된 번호 입력");
                    break;
            }
        }
        sc.close();
    }

    private static Account createAccount() {
        System.out.print("계좌 번호 입력 >> ");
        String accountNum = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String ownerName = sc.nextLine();
        System.out.print("잔액 입력 >> ");
        long balance = Integer.parseInt(sc.nextLine());
        return new Account(accountNum, ownerName, balance);
    }

    private static void accountList(Account account) {
        System.out.println("---------------------------");
        System.out.println("계좌 목록");
        System.out.println("---------------------------");
        System.out.printf("%s\t%s\t%d\n", account.getAno(), account.getOwner(), account.getBalance());

    }

    private static void deposit(Account account) {
        System.out.print("계좌 번호 입력 >> ");
        String accountNum = sc.nextLine();
        if (!(account.getAno().equals(accountNum))) {
            System.out.println("계좌 번호가 틀립니다.");
            return;
        }

        System.out.print("입금할 금액을 입력 >> ");
        long balance = Integer.parseInt(sc.nextLine());
        account.deposit(balance);
        System.out.println("현재 잔액 >>" + account.getBalance());

    }

    private static void withdraw(Account account) {
        System.out.print("계좌 번호 입력 >> ");
        String accountNum = sc.nextLine();
        if (!(account.getAno().equals(accountNum))) {
            System.out.println("계좌 번호가 틀립니다.");
            return;
        }
        System.out.print("출금할 금액을 입력 >> ");
        long balance = Integer.parseInt(sc.nextLine());
        account.withdraw(balance);
        System.out.println("현재 잔액 >>" + account.getBalance());
    }

    // private static Account findAccount(){}
}
