package condition;

import java.util.Scanner;

public class IfEx4 {

  public static void main(String[] args) {
    // 점수가 >90 A, >=80 B, >=70 C, >=60 D, F
    int score = 75;
    if (score >= 90) {
      System.out.println("등급은 A 입니다");
    } else if (score >= 80) {
      System.out.println("등급은 B 입니다");
    } else if (score >= 70) {
      System.out.println("등급은 C 입니다");
    } else if (score >= 60) {
      System.out.println("등급은 D 입니다");
    } else {
      System.out.println("등급은 F 입니다");
    }

    int score1 = 75;
    char grade = ' ';
    if (score1 >= 90) {
      System.out.println("등급은 A 입니다");
      grade = 'A';
    } else if (score1 >= 80) {
      System.out.println("등급은 B 입니다");
      grade = 'B';
    } else if (score1 >= 70) {
      System.out.println("등급은 C 입니다");
      grade = 'C';
    } else if (score1 >= 60) {
      System.out.println("등급은 D 입니다");

      grade = 'D';
    } else {
      System.out.println("등급은 F 입니다");
      grade = 'F';
    }

    // 점수를 입력 받은 후 점수에 따라 출력
    // 당신의 점수는 100입니다.
    // 당신의 학점은 A+ 입니다.

    //  >=90   >=98 A+  90>=점수<94 A-, A
    // >=80  >=88 B+,  80>=점수<84 B-, B
    // 나머지는 C

    Scanner sc = new Scanner(System.in);
    System.out.println("점수 입력");
    int score2 = sc.nextInt();

    char grade1 = ' ';
    int opt = '0';
    if (score >= 90) {
      if (score2 >= 98) {
        opt = '+';
      } else if (score2 < 94) {
        opt = '-';
      } else if (score2 <= 80) {
        opt = '-';
      } else if (score2 >= 88) {
        opt = '+';
      } else if (score2 < 84) {
        opt = '-';
      }
    } else {
      grade1 = 'C';
    }
    System.out.printf("당신의 점수는 %d 입니다\n", score);
    System.out.printf("당신의 점수는 %c%c 입니다\n", grade, opt);
  }
}
