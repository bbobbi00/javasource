package loop;

import java.util.Scanner;

public class DowhileEx1 {

  public static void main(String[] args) {
    int input = 0, answer = 0;

    answer = (int) (Math.random() * 100) + 1;

    Scanner sc = new Scanner(System.in);

    do {
      System.out.print("1~100 사이의 정수 입력 >> ");
      input = sc.nextInt();

      if (answer < input) {
        System.out.println("더 작은 수를 입력하세요");
      } else {
        System.out.println("더 큰 수를 입력하세요");
      }
    } while (input != answer);
    System.out.println("정답입니다! 프로그램을 종료합니다");
  }
}
