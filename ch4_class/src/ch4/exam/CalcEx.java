package ch4.exam;

public class CalcEx {
    public static void main(String[] args) {
        // 객체 생성
        Calc calc = new Calc();

      int result  =calc.add(num1:15, num2:20);

      System.out.println("덧셈 결과" + result);

      System.out.println("곱셈 결과" + calc.multiply(num1:3, num2:5));

    //   나눗셈
    result = calc.divide(num1:20,num2:10);
    System.out.println("나눗셈 결과" + result);
    }
    
}
