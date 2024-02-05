package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx14 {

  public static void main(String[] args) {
    // 1차원 배열 - 사용자 입력 값으로 배열 초기화
    int arr1[] = new int[5];

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < arr1.length; i++) {
      System.out.print("숫자 입력");
      int num = sc.nextInt();
      arr1[i] = num;
    }
    System.out.println("배열 요소 값" + Arrays.toString(arr1));

    // 2차원 배열
    int arr2[][] = new int[2][3];

    for (int m = 0; m < arr2.length; m++) {
      for (int n = 0; n < arr2.length; n++) {
        System.out.println("숫자 입력");

        arr2[m][n] = sc.nextInt();
      }
    }
    for (int[] is : arr2) {
      for (int num : is) {
        System.out.print(num + "\t");
      }
      System.out.println();
    }
  }
}
