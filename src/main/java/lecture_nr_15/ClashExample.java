package lecture_nr_15;

import java.util.List;

public class ClashExample <T extends Fruit> {

    public void example(T input){}
    public void example(Object input){}

    public void example1(T input){}
    public void example1(String input){};

    /*
    public void example2(List<T> input){};
    public void example2(List<String> input){};
    CLASH
     */


}
