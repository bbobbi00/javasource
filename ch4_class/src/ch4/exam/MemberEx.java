package ch4.exam;

public class MemberEx {

  public static void main(String[] args) {
    // 회원 객체 생성 ==> 생성자 호출
    // 이름(필수),아이디,비밀번호
    String id;
    String password;
    String name;

    Member member1 = new Member("member1", "member1", "member1");
    // 아이디,비밀번호,이름,나이,직업
    Member member2 = new Member("member2", "member2", "성춘향", "회사원");

    // grade, point => 마트 규칙에 따라 변경

    Member member3 = new Member();
    // grade, point =>마트 규칙에 따라 변경
  }
}
