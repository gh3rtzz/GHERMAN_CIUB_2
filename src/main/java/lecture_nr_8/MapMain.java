package lecture_nr_8;

import java.util.*;

public class MapMain {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Hello");
        map.put(9, "World!");

        System.out.println(map.get(3));

        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("key1", "Hello!");
        stringMap.put("tekwill", "World!");

        System.out.println(stringMap.get("tekwill"));

        Set<Integer> keySet = map.keySet();
        List<String> valueList = new ArrayList<>(map.values());

        System.out.println(keySet);
        System.out.println(valueList);
    }
}
