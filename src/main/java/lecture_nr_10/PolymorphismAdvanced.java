package lecture_nr_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PolymorphismAdvanced {

    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();

        printStringList(stringArrayList);
        printStringList(stringLinkedList);
    }

    public static void printStringList(List<String> inputList){

        for(int i = 0; i != inputList.size(); i++){
            System.out.println(inputList.get(i));
        }
    }
}
