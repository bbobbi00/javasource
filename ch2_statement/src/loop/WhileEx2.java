package loop;

public class WhileEx2 {

  public static void main(String[] args) {
    // 구구단 출력
    // 3*1 = 3
    // 3*2=6
    //

    for (int i = 1; i < 10; i++) {
      System.out.printf("%d * %d = %d\n", 3, i, (3 * i));
    }
  }
}
