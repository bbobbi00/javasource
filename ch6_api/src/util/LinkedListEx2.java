package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx2 {

  public static void main(String[] args) {
    ArrayList<String> aList = new ArrayList<>(2000000);
    LinkedList<String> linkedList = new LinkedList<>();

    System.out.println("순차적 추가 비교");
    System.out.println("ArrayList : " + add1(aList));
    System.out.println("LinkedList : " + add1(linkedList));
    System.out.println();
    System.out.println("중간 추가 비교");
    System.out.println("ArrayList :" + add2(aList));
    System.out.println("LinkedList : " + add2(aList));
    System.out.println();
    System.out.println("중간 삭제 비교");
    System.out.println("ArrayList :" + add3(aList));
    System.out.println("LinkedList");
  }
}
