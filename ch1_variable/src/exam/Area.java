package exam;

public class Area {

  public static void main(String[] args) {
    // 사다리꼴의 넓이를 구한 후 출력
    // (윗변 + 아랫변) * 높이 /2
    // 소수점 2자리까지 출력

    int length1 = 6;
    int length2 = 2;
    int height = 4;
    double width = (length1 + length2) * height / 2.0;
    System.out.printf("넓이: %.2f", width);
  }
}
