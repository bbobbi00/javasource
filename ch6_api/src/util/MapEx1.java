package util;

// 내부 인터페이스 Map.Entry

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();

    // 요소 추가
    map.put("id_0123", "홍길동");
    map.put("id_0124", "박보검");
    map.put("id_0125", "송중기");
    map.put("id_0126", "현빈");

    System.out.println(
      "key 에 해당하는 value 가져오기 get() " + map.get("id_0125")
    );
    System.out.println(
      "key 존재여부 constainsKey() " + map.containsKey("id_0125")
    );
    System.out.println(
      "value 존재여부 constainsKey() " + map.containsKey("id_0125")
    );
    System.out.println("map 요소 크기 size() " + map.size());
    System.out.println("map 요소 삭제 remove() " + map.remove("id_0126"));

    Set<String> keys = map.keySet();
    System.out.println(keys);

    Collection<String> values = map.values();
    System.out.println(values);
  }
}
