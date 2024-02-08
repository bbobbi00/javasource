package ch4.exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("110-11-222","홍길동",100000);

    double deposit = account.deposit(100000);
    System.out.println("예금하다" + deposit);

    double withdraw = account.withdraw(50000);
    System.out.println("출금하다" + withdraw);
  }
}
