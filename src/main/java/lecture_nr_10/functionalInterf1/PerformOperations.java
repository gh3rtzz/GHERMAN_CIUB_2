package lecture_nr_10.functionalInterf1;

import java.util.function.BiFunction;

public class PerformOperations {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Float> addition = new Addition();
        BiFunction<Integer, Integer, Float> subtraction = new Subtraction();

        System.out.println(performOperation(addition, 3, 5));
        System.out.println(performOperation(subtraction, 3, 5));
    }

    public static float performOperation(BiFunction<Integer, Integer, Float> operation,
                                         int x, int y){
        return operation.apply(x, y);
    }
}
