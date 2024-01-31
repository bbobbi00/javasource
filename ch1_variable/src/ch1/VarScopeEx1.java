package ch1;

public class VarScopeEx1 {
    public static void main(String[] args) {
        // 변수의 유효범위
        // local (지역) 변수 : {}안에서만 유효/ 초기화를 하고 사용함
        // 변수선언 => 값 할당(초기화

        int v2;
        v2 =30;

        int v3;
        int v4;
        { int v1 = 15;
            System.out.println("v1=:" + v1 );
            v3 = v1+v2;




        }
        System.out.println("v2=:" + v2);
        System.out.println("v3=:" + v3);
        // local variable v4 may not have been initialized(로컬변수 v4가 초기화되지 않았음)
        
        System.out.println("v4=:" + v4);


        
    }
    void print() {
        //  main 메소드 안에 선언된 변수를 사용할 수 있을까?
        // System.out.println("v2=:" + v2);


    }
}
