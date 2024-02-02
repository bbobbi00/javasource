package exam;

import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean run = true;

    while (true) {
      System.out.println("-----------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("------------------");
      System.out.println("메뉴 선택 >> ");

      int menu = sc.nextInt();

      switch (menu) {
        case 4:
          System.out.println("프로그램 종료");
          run = false;
          break;
        default:
          break;
      }
    }
  }
}
