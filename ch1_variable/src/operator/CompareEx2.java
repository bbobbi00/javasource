package operator;

public class CompareEx2 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true or fasle 로 나옴
    // 문자 vs 비교열
    // '' vs ""
    // 'A', "A"

    String str1 = "홍길동";
    String str2 = "홍길동";
    String str3 = new String("홍길동");
    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println(str1.equals(str3));
    // 문자열 비교는 equals(메소드) 사용
  }
}
