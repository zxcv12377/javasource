package oop;

import java.util.Scanner;

public class AccountEx4 {

    private static Account[] account = new Account[100];
    private static Scanner sc = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("------------------------------------------------------------");

            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
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

    private static void createAccount() {
        System.out.print("계좌 번호 입력 >> ");
        String accountNum = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String ownerName = sc.nextLine();
        System.out.print("잔액 입력 >> ");
        long balance = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = new Account(accountNum, ownerName, balance);
                break;
            }
        }
    }

    private static void accountList() {
        System.out.println(account.length);
        System.out.println("---------------------------");
        System.out.println("계좌 목록");
        System.out.println("---------------------------");
        // for (int i = 0; i < account.length; i++) {
        // if (account[i] == null)
        // break;
        // System.out.printf("%s\t%s\t%d\n", account[i].getAno(), account[i].getOwner(),
        // account[i].getBalance());
        // }
        for (Account acc : account) {
            if (acc == null)
                break;
            System.out.printf("%s\t%s\t%d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
        }
    }

    private static void deposit() {

        System.out.print("계좌 번호 입력 >> ");
        String accountNum = sc.nextLine();

        System.out.print("입금할 금액을 입력 >> ");
        long balance = Integer.parseInt(sc.nextLine());
        Account findAcc = findAccount(accountNum);
        if (findAcc != null) {
            findAcc.deposit(balance);
        } else {
            return;
        }
    }

    private static void withdraw() {
        System.out.print("계좌 번호 입력 >> ");
        String accountNum = sc.nextLine();

        System.out.print("출금할 금액을 입력 >> ");
        long balance = Integer.parseInt(sc.nextLine());
        Account findAcc = findAccount(accountNum);
        if (findAcc != null) {
            findAcc.withdraw(balance);
        } else {
            return;
        }

    }

    private static Account findAccount(String ano) {

        // for (int i = 0; account[i] != null; i++) {
        // if (ano.equals(account[i].getAno())) {
        // return account[i];
        // }
        // }
        // return null;

        // for (int i = 0; i < account.length; i++) {
        // if (account[i] != null) {
        // if (account[i].getAno().equals(ano)) {
        // return account[i];
        // }
        // if (account[i].getAno().equals(ano)) {

        // break;
        // }
        // }
        // }
        // return null;

        for (int i = 0; i < account.length; i++) {
            if (ano.equals(account[i].getAno()))
                return account[i];
            if (account[i].getAno() == null)
                break;
        }
        return null;
    }
}
