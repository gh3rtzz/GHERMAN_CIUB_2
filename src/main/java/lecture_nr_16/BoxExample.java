package lecture_nr_16;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxExample {

    public static void main(String[] args) {

        List<String> stringList = getAndReturnList("asd");
        List<Integer> integerList = getAndReturnList(3);

        Map<String, Integer> map = new HashMap<>();
        addToExistingHashMap("asd", 3, map);

        Map<Character, Boolean> map1 = new HashMap<>();
        addToExistingHashMap('A', true, map1);

        Map<?, ?> map2 = getKeyValueAndCreateMap(123, "asd");
        Map<Integer, String> map3 = getKeyValueAndCreateMap(123, "asd");

        System.out.println(map2.keySet());
        System.out.println(map2.values());

        printAllMapValues(map3);

        List<String> valueList = returnAllMapValues(map3);
    }

    public static <T> List<T> returnAllMapValues(Map<?, T> inputMap){

        List<T> returnList = (List<T>) inputMap.values();
        return returnList;
    }

    public static void printAllMapValues(Map<?, ?> inputMap){

        for(Object key : inputMap.keySet()){
            System.out.println(key + " : " + inputMap.get(key));
        }
    }

    public static <K, V> Map<K, V> getKeyValueAndCreateMap(K key, V value){

        Map<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public static <V, K> void addToExistingHashMap(K key, V value, Map<K,V> inputMap){

        inputMap.put(key, value);
    }

    //I need to create a method that will get an unknown type and put it in
    // a list and return the list with the element

    public static <T> List<T> getAndReturnList(T input){

        List<T> returnList = new ArrayList<>();
        returnList.add(input);
        return returnList;
    }
}
