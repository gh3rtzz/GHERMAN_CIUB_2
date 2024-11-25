package lecture_nr_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(3);
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(10);
        integerSet.add(123123);
        integerSet.add(-30);
        integerSet.add(0);
        integerSet.add(0);

        System.out.println(integerSet);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(3);
        integerList.add(3);
        integerList.add(5);
        integerList.add(5);
        integerList.add(7);
        integerList.add(7);

        System.out.println(integerList);

        Set<Integer> intSet2 = new HashSet<>(integerList);

        System.out.println(integerList.hashCode());

    }
}
