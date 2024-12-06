package lecture_nr_15;

import java.util.ArrayList;
import java.util.List;

public class WildCardMain {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        print(stringList);
        print(integerList);

        printSomething("asd");
        printSomething(123);
    }

    public static void print(List<?> inputList){

        for(Object element : inputList){
            System.out.println(element);
        }
    }

    public static void printSomething(Object element){

    }
}
