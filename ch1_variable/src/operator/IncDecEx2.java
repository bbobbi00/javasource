package operator;

public class IncDecEx2 {

  public static void main(String[] args) {
    int x = 10, y = 20;

    x++;
    // x=x;, x=x+1;
    y++;

    System.out.printf("x=%d, y=%d", x, y);

    x--;
    y--;
    System.out.printf("x=%d, y=%d", x, y);
  }
}
