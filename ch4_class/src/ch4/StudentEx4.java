package ch4;

import java.util.Scanner;

public class StudentEx4 {

  public static void main(String[] args) {
    Student3 stuArr[] = new Student3[3];
    System.out.println(stuArr[0]);
    System.out.println(stuArr[0].getId());
    //  NullPointerException

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < stuArr.length; i++) {
      stuArr[i] = new Student3();
      // 아이디,이름,국어,영어,수학점수 입력받아서 초기화
      System.out.print("Input id");
      String id = sc.nextLine();
      System.out.print("Input name");
      String name = sc.nextLine();
      System.out.print("Input kor");
      int kor = Integer.parseInt(sc.nextLine());
      System.out.println("Input eng");
      int eng = Integer.parseInt(sc.nextLine());
      System.out.print("Input math");
      int math = Integer.parseInt(sc.nextLine());

      stuArr[i].setId(id);
      stuArr[i].setName(name);
      stuArr[i].setKor(kor);
      stuArr[i].setEng(eng);
      stuArr[i].setMath(math);
    }
    // 학생정보 확인
    System.out.println("=========================");
    System.out.println("아이디  이름  국어  영어  수학  총점  평균");
    System.out.println("=========================");

    for (Student3 student3 : stuArr) {
        // Student3 student3 = stuArr[i];
    //   System.out.println(student3); ==> toString()
    // 모든 학생들이 정보 접근
    System.out.println(student3.getId()+" " +student3.getName()+" "+student3.getKor()+ " "+student3.getEng()+ " " + student3.getMath()+ " ");
    
    }

    for (int i=0; i < stuArr.length; i++) {
        int total = stuArr[i].getKor() + stuArr[i].getEng() + stuArr[i].getMath();
        System.out.printf("%s $s %d %d %d\n",
        stuArr[i].getId(),
        stuArr[i].getName(),
        stuArr[i].getKor(),
        stuArr[i].getEng(),
        stuArr[i].getMath(),
        total,
        total / 3.0

        );
        
    }


    }
  }

