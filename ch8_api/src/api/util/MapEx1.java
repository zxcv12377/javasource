package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("id_0011", "홍길동");
        map.put("id_0012", "최길동");
        map.put("id_0013", "김길동");
        map.put("id_0011", "이길동");
        map.put("id_0014", "박길동");

        // key 값 가져오기
        Set<String> set = map.keySet();

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
