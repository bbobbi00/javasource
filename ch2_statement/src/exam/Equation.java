package exam;

public class Equation {

  public static void main(String[] args) {
    // 4x+5y=60 인 모든 해 구하기
    // 단, x,y는 10이하의 자연수

    int x = 4, y = 8;
    for (int i = 1; i < 11; x++) {
      for (int j = 1; j < 11; j++) {
        if (4 * x + 5 * y == 60) {
          System.out.printf("%d, %d\n", x, y);
        }
      }
    }
  }
}
