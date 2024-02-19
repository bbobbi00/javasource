package util;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * Iterator 인터페이스
 * 컬렉션에 저장된 요소를 접근하는 데 사용되는 인터페이스
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    Set<String> set = map.keySet();
    Iterator<String> iterator = set.iterator();

    while (iterator.hasNext()) {
      String key = iterator.next();
      String values = map.get(key);
      System.out.println(key + ":" + values);
    }
    System.out.println();

    Set<Entry<String, String>> entries = map.entrySet();
    Iterator<Entry<String, String>> iterator2 = entries.iterator();
    while (iterator2.hasNext()) {
      Entry<String, String> entry = iterator2.next();
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
  }
}
