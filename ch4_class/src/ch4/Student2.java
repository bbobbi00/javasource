package ch4;

public class Student2 {

  // 멤버변수 (=인스턴스변수, property,속성,주소)
  // 학번(20241011), 이름(홍길동), 주소(서울시 종로구)

  private String id;
  private String name;
  private String addr;
  private String hp;

  //   멤버메소드(=인스턴스메소드,기능,동작)
  //  속성을 변경시킬 수 있도록 메소드 작성
  // 메소드 작성 규칙
  // 리턴타입 메소드명 (){}
  // return type : 정수형, 실수형, 불린형, 문자형, String, 배열, void

  void changeAddr(String addr) {
    // 멤버변수 addr 의 값을 변경
    this.addr = addr;
    // 리턴 값은 없음
  }

  void changeHp(String hp) {
    this.hp = hp;
  }

  // 생성자(constructor) -멤버변수 초기화(초기화를 안하면 기본값이기 때문에)
  // 클래스를 객체로 생성할 때 필수로 필요함
  Student2() {}

  public Student2(String id, String name, String addr) {
    this.id = id;
    this.name = name;
    this.addr = addr;
  }

  Student2(String id, String name, String addr, String hp) {
    this.id = id;
    this.name = name;
    this.addr = addr;
    this.hp = hp;
  }

  @Override
  public String toString() {
    return (
      "Student2 [id=" +
      id +
      ", name=" +
      name +
      ", addr=" +
      addr +
      ", hp=" +
      hp +
      "]"
    );
  }
}
