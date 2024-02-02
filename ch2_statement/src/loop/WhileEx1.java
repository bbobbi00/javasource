package loop;

public class WhileEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("I can do it");
    }
    int i = 0;
    while (i < 5) {
      System.out.println("I can do it");
      i++;
    }
    i = 0;

    while (i <= 10) {
      sum += i;
      i++;
    }

    System.out.println("1~10 까지 합" + sum);
  }
}
