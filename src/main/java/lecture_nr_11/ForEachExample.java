package lecture_nr_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ForEachExample {

    public static void main(String[] args) {

        String[] stringArray = new String[]{
                "A1", "B2", "C3"
        };

        for(int i = 0; i != stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        for(String element: stringArray){
            System.out.println(element);
        }

        Set<String> stringSet = new HashSet<>(Arrays.asList("A1", "B2", "C3"));

        for(String element: stringSet){
            System.out.println(element);
        }
    }
}
