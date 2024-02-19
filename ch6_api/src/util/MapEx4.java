package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx4 {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("홍길동", 95);
    map.put("김길동", 92);
    map.put("박길동", 88);
    map.put("이길동", 69);
    map.put("장길동", 72);

    // 홍길동 : 95

    //  1) key 값만 set 구조로 변경 후 접근
    Set<String> set = map.keySet();
    Iterator<String> iterator = set.iterator();
    // NoSuchElementException : 런타임
    while (iterator.hasNext()) {
      String key = iterator.next();
      int jumsu = map.get(key);
      System.out.println(iterator.next() + ":");
    }
  }
}
