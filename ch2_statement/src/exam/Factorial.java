package exam;

public class Factorial {

  public static void main(String[] args) {
    // 숫자 입력 받은 후 입력받은 숫자의 n! 계산
    // 6 => 6! => 6*5*4*3*2*1

    Scanner sc = new scanner(System.in);

    System.out.print("숫자입력 :");
    int num = sc.nextInt();

    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= 1;
    }
    System.out.printf("%d!=%d\n", num, fact);
  }
}
