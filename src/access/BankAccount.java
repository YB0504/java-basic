package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    // public 메소드 : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않음 금액입니다.");
        }
    }

    // public 메소드 : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메소드
    public int getBalance() {
        return balance;
    }

    // 클래스 내부 검증을 위한 메소드이므로 private으로 막았다.
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
