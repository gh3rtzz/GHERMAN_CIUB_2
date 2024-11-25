package lecture_nr_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(3);
        integerList.add(9);
        integerList.add(7);
        integerList.add(5);

        System.out.println("Does the list contain number 7: " + integerList.contains(7));
        System.out.println("Does the list contain number 10: " + integerList.contains(10));

        integerList.set(2, 10);

        System.out.println("Index of number 5 is: " + integerList.indexOf(5));

        for(int i = 0; i != integerList.size(); i++){
            System.out.print(integerList.get(i));
        }
        System.out.println();
        System.out.println("Size of list before deletion: " + integerList.size());

        integerList.remove(1);


        for(int i = 0; i != integerList.size(); i++){
            System.out.print(integerList.get(i));
        }
        System.out.println();
        System.out.println("Size of list after deletion: " + integerList.size());

        System.out.println(integerList.get(1));

        System.out.println("Is the list empty? " + integerList.isEmpty());

        integerList.clear();

        System.out.println("Is the list empty after clean method? " + integerList.isEmpty());

        Integer[] intArrayFromList = new Integer[0];

        integerList.toArray(intArrayFromList);

        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

//        linkedList.addAll(Arrays.asList(1, 2, 3, 4, 5));
    }
}
