package ch1;

// 자동 형(타입) 변환: promotion
// 정수형/ 문자형 /실수형/ 논리형
// 타입 변환 가능: 작은->큰
// 연산 시 타입 변환 일어남, 작은=>큰 타입으로 

public class Promotionex1 {
    public static void main(String[] args) {
        byte v1=10;
        int intValue = v1;

        short s1 =15;
        intValue = s1;
        System.out.println("intValue=:"+intValue);

        char ch1 = 'a';
        intValue = ch1;
        System.out.println("intValue=:"+intValue);
        
        // float 타입이 int 보다 정밀한 
        // int => float (int<float)
        float floatValue = intValue;
        System.out.println("floatValue=:"+floatValue);

        long longValue = intValue;
        System.out.println("longValue=:"+longValue);

        double doubleValue = intValue;
        
        // int + double
        intValue =55;
        doubleValue = 98.25d;
        System.out.println("doubleValue=:"+doubleValue);

      double result  = intValue + doubleValue;
      System.out.println("doubleValue=:"+doubleValue);

      byte v2=15;
      int byteValue = v1 +v2;
      System.out.println("intValue=:"+intValue);








        
    }
    
}
