package loop;

public class ForEx4 {

  public static void main(String[] args) {
    // 5행 10열의 별(*)
    // 1) int i = ;
    // 2)i <5;
    // 3)반복문 안으로 진입 : syso 실행
    // 4)i++ => i=1
    // 5)i <5;
    // 6) 반복문 안으로 진입 : syso 실행
    // 7) i++ => i=2
    // ...
    // 8) i++ =>5
    // 9)i<5 조건이 false 가 되면 반복문은 종료
    //
    // 10) j ==11 안쪽 for 문 종료;
    // 11) System.out.println();
    // 12) 바깥쪽 for i++
    // 13)i <6
    // 14) 안쪽 for 10번 수행
    // 바깥쪽 for 문이 참일때까지 반복 수행

    for (int i = 1; i < 6; i++) {
      System.out.print("*");
    }
    System.out.println();

    for (int j = 1; j < 6; j++) {
      for (int j = 1; j < 11; j++)} {
        System.out.print("*");
      }

      System.out.print("**********");
    }
  }
}
