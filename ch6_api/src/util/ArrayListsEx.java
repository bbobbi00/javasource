package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*컬렉션 프레임워크 : 데이터 군을 저장하는 클래스들을 표준화한 설계
 *
 * Collection
 * List  Set(Collection 인터페이스 상속)
 * Map (상속 X)
 *
 * List(인터페이스) : 순서가 있는 데이터의 집합(데이터의 중복 허용)
 * 구현 클래스 - ArrayList, Stack, Vector...
 * 고정 크기 => 크기 변경이 필요하다면
 *  ==> 배열과 동일한 개념
 *      고정크기 => 크기 변경 시 다른 배열 생성 후 옮겨야 함
 */

public class ArrayListsEx {

  public static void main(String[] args) {
    // initial capacity : 10
    // List<Integer> list = new ArrayList<>(20);
    ArrayList<Integer> list = new ArrayList<>(20);
    list.add(15);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(55);
    list.add(65);

    // toString() 오버라이딩 여부
    System.out.println(list);

    // 내림차순
    // list.sort(Comparator.reverseOrder());

    // 오름차순
    list.sort(Comparator.naturalOrder());
    System.out.println(list); //

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("Java");
    list2.add("JSP");
    list2.add("JTML");
    list2.add("CSS");
    list2.add("JAVASCRIPT");
    list2.add("PYTHON");

    // 메소드
    System.out.println("size() " + list2.size());
    // arr[3]
    System.out.println("get()" + list2.get(3));
    // 지정된 위치에 있는 객체 반환
    System.out.println("indexOf() " + list2.indexOf("Java"));
    // 지정된 객체가 저장된 위치 반환
    System.out.println("indexOf()" + list2.indexOf("JAVA"));
    System.out.println("remove()" + list2.remove("Java"));
    System.out.println(list2);

    // ArrayList ==> 배열로 변환
    Object[] arr = list2.toArray();
    for (Object object : arr) {
      System.out.println(object);
    }

    //    배열 ==> ArrayList 변환
    //   Arrays
    int[] arr2 = { 3, 5, 6, 7, 9 };
    List<int[]> list3 = Arrays.asList(arr2);

    System.out.println("isEmpty() " + list2.isEmpty());
    //   ArrayList 가 비어 있는지 확인
    list2.set(1, "Oracle");
    // 특정 위치에 객체 추가
    System.out.println(list2);
  }
}
