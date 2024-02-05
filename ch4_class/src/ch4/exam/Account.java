package ch4.exam;

public class Account {

  // 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)

  private String accountNumber;
  private String name;
  private int num;

  public Account() {}

  public Account(String accountNumber, String name, int num) {
    this.accountNumber = accountNumber;
    this.name = name;
    this.num = num;
  }
}
