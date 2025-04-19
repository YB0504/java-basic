package oop2.exercise;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println("출금 성공, 잔액: " + balance);
        } else {
            System.out.println("잔액 부족");
        }
    }
}
