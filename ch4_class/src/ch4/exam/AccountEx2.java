package ch4.exam;

import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    // Account 객체를 담을 배열 생성 3개
    Scanner sc = new Scanner(System.in);
    Account accArr[] = new Account[3];

    for (int i = 0; i < accArr.length; i++) {
      System.out.print("계좌번호 >>");
      String accountNo = sc.nextLine();
      System.out.print("계좌주 >>");
      String owner = sc.nextLine();
      System.out.print("잔액 >>");
      int balance = Integer.parseInt(sc.nextLine());

      accArr[i] = new Account(accountNo, owner, balance);
    }

    // 확인

    for (Account account : accArr) {
      System.out.println(account);
    }
  }
}
