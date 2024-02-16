// 패키지 문
package com.project.book;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
// import java.util.Date;
// import java.util.Scanner;
import java.util.*;

// import 구문 =>  다른 패키지에 있는 클래스 사용

// 클래스 선언
public class book {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdf.format(date));

        LocalDate dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        Scanner sc = new Scanner(System.in);
    }
}
