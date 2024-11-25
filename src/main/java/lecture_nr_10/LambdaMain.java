package lecture_nr_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaMain {

    public static void main(String[] args) {

        Function<Integer, Integer> powerTo2 = e -> e * e;

        Function<Integer, Integer> powerTo2ver2 = (Integer e) -> {
            return e * e;
        };

        BiFunction<Integer, Integer, Integer> addTwoNumbers = (x, y) -> x + y;

        BiFunction<Integer, Integer, Integer> addTwoNumbersver2 = (Integer x, Integer y) -> {
            return x + y;
        };

        Predicate<Integer> isNumberOdd = e -> e % 2 != 0;

        Predicate<Integer> isNumberOddver2 = (Integer e) -> {
            return e % 2 != 0;
        };

        Consumer<String> printAnything = e -> System.out.println(e);

        Consumer<String> printAnythingver2 = (String e) -> {
            System.out.println(e);
        };

        Supplier<List<Integer>> returnListWithNumbersFrom0To10 = () -> new ArrayList<>(Arrays.asList(
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        ));

        Supplier<List<Integer>> returnListWithNumbersFrom0To10ver2 = () -> {
            List<Integer> integerList = new ArrayList<>();
            for(int i = 0; i <= 10; i++)
                integerList.add(i);
            return integerList;
        };

        List<Integer> integerList = returnListWithNumbersFrom0To10ver2.get();

        System.out.println(integerList);
    }
}
