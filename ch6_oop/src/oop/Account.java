package oop;

import lombok.*;

@ToString // toString 메소드 생성
@AllArgsConstructor // 멤버변수 전부 선택해서 생성자
@NoArgsConstructor // default 생성자
@Getter
@Setter

public class Account {
    // 속성 : 계좌번호(ano), 이름(owner), 잔액(balance)
    // 110-10-0100
    private String ano;
    private String owner;
    private long balance;

    // 생성자(default, 멤버변수 3개 초기화)
    // public Account() {
    // }

    // public Account(String ano, String owner, long balance) {
    // this.ano = ano;
    // this.owner = owner;
    // this.balance = balance;
    // }

    // public String getAno() {
    // return ano;
    // }

    // public String getOwner() {
    // return owner;
    // }

    // public long getBalance() {
    // return balance;
    // }

    // 기능 : 예금하다(잔액 = 잔액 + 예금액), 출금하다(잔액 = 잔액 - 출금액)
    // deposit, withdraw
    void deposit(long amount) {
        this.balance += amount;
    }

    void withdraw(long amount) {
        if (amount > balance)
            return;
        // 인출액이 잔액보다 작으면 출금
        this.balance -= amount;
    }

    // toString
    // @Override
    // public String toString() {
    // return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance +
    // "]";
    // }

}
