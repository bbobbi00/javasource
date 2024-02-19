package util;


import java.util.Arrays;
import java.util.Comparator;


public class ArrayEx {
    public static void main(String[] args) {
        // binarySearch() - 오름차순 정렬, 못찾으면 음수로 결과 나옴

    // 내림차순 정렬
    // T[] : 배열이 객체 타입이라는 의미
    // Map<K,V> :K,V==>객체 타입
    // Collection<E> ==> 객체 타입
    // int ==> Integer
    Integer arr3[] = { 27, 55, 15, 6, 9, 75 };
    Arrays.sort(arr3, Comparator.reverseOrder());
    System.out.println(Arrays.toString(arr3));

    String[] strArr = { "cat", "dog", "lion", "tiger", "apple", "zoo" };
    Arrays.sort(strArr);
    System.out.println(Arrays.toString(strArr));
    Arrays.sort(strArr, Comparator, reverseOrder());
    System.out.println(Arrays.toString(strArr));
  }
}

    
    

