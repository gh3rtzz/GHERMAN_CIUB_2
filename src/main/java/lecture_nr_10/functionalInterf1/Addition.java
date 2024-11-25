package lecture_nr_10.functionalInterf1;

import java.util.function.BiFunction;

public class Addition implements BiFunction<Integer, Integer, Float> {

    @Override
    public Float apply(Integer x, Integer y) {
        return Float.valueOf(x + y);
    }
}
