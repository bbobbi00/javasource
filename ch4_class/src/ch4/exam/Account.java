package ch4.exam;

public class Account {

  // 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)

  private String accountNumber;
  private String name;
  private int balance; //잔액

  public Account() {}

  public Account(String accountNumber, String name, int balance) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }

  // 예금하다
  // deposit
  int deposit(int money) {
    // balance = balance + money;
    return this.balance += money;
  }

  // 출금하다
  // withdraw

  // balance = balnce-amount;
  // return balance;
  int withdraw(int money) {
    return this.balance -= money;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return (
      "Account [accountNumber=" +
      accountNumber +
      ", name=" +
      name +
      ", balance=" +
      balance +
      "]"
    );
  }
}
