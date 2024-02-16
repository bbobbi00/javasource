package ch4.exam2;

import java.util.Scanner;


import com.project.book.Sub;

public class CalcEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Num1 :");
        int num1=Integer.parseInt(sc.nextLine());
        System.out.println("Input Num2 :");
        int num2=Integer.parseInt(sc.nextLine());
        System.out.println("Input Num3 :");
        int num3=Integer.parseInt(sc.nextLine());
        
        Calc calc = null;
        switch (op) {
            calc = new Add();
                
                break;

                case "*":
                calc = new Sub();
                break;
                case "/":
                calc = new Div();
                break;
        
                
        
            default:
                break;
        
        }
        calc.setValue(num1,num2);
        System.out.println(calc.calculate);
    }
    
}
