package ch4;

public class StudentEx {

  public static void main(String[] args) {
    //객체 (인스턴스) 생성
    Student student = new Student();
    System.out.println("student");
    System.out.println("student.id");
    System.out.println("student.name");
    System.out.println("student.addr");
    System.out.println("student.hp");

    student.id = "20241212";
    student.name = "홍길동";
    student.addr = "서울시 종로구";
    student.hp = "010-1234-5678";

    System.out.println("student");
    System.out.println("student.id");
    System.out.println("student.name");
    System.out.println("student.addr");
    System.out.println("student.hp");

    // 생성자 호출
    Student student2 = new Student();
    student.id = "20241013";
    student.name = "성춘향";
    student.addr = "구로구 궁동";
    student.hp = "010-4567-8950";
  }
}
