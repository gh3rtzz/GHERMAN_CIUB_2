package lecture_nr_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PECSExample {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<Long> longList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        printNumbersFromList(integerList);
//        printNumbersFromList(floatList);
//        printNumbersFromList(longList);
//        printNumbersFromList(stringList);
    }

    public static void printNumbersFromList(List<? super Integer> numberList){

//        for(Number n : numberList){
//            System.out.println(n);
//        }
    }


}
