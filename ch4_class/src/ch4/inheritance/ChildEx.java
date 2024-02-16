package ch4.inheritance;

public class ChildEx {
    public static void main(String[] args) {
        // 부모, 자식 인스턴스 생성 가능 함
        Parent parent = new Parent();
        Child child = new Child();
        Child2 child2 = new Child2();
        Grandchild grandchild = new Grandchild();

        child.

        System.out.println("부모의 멤버 변수" + parent.age);
        System.out.println("부모가 물려준 멤버 변수 child" + child.age);
        System.out.println("부모가 물려준 멤버 변수 child2" + child2.age);
        System.out.println("child 멤버 메소드");
        child.play();
        System.out.println("Parent가 물려준 멤버 변수" + grandchild.age);
        grandchild.play();

        // 오버라이딩 메소드
        parent.print();
        child.print();
        child2.print();
        grandchild.print();

    }
    
}
