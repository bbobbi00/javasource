package util;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsEx2 {

  public static void main(String[] args) {
    List<Member> list = new ArrayList<>();

    Member member = new Member();

    member.setId("hong123");
    member.setName("홍길동");

    list.add(member);

    Member member2 = new Member();
    member.setId("kim123");
    member.setName("김길동");

    Member member3 = new Member();
    member.setId("choi123");
    member.setName("최길동");
    list.add(member3);

    for (Member mem : list) {
      System.out.println(mem);
    }
  }
}
