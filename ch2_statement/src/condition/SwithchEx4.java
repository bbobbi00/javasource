package condition;

import java.util.Scanner;

public class SwithchEx4 {

  public static void main(String[] args) {
    char grade = 'B';
    // A or a : 우수회원
    // B or b : 일반회원
    //         : 손님

    Scanner sc = new Scanner(System.in);
    int grade = sc.nextInt();

    switch (grade) {
      case 'A':
      case 'a':
        System.out.println("우수회원");
        break;
      case 'B':
      case 'b':
        System.out.println("보통회원");
        break;
      default:
        System.out.println("손님");
        break;
    }
  }
}
