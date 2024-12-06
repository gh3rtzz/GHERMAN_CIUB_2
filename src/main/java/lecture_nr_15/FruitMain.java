package lecture_nr_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();
        BigOrange bigOrange = new BigOrange();

        List<Object> objectList = new ArrayList<>();
        List<Fruit> fruitList = new ArrayList<>();
        List<Citrus> citrusList = new ArrayList<>();
        List<Orange> orangeList = new ArrayList<>();
        List<BigOrange> bigOranges = new ArrayList<>();
        List<String> stringList = new ArrayList<>(Arrays.asList("asd"));

        producerExample(fruitList);
        producerExample(citrusList);
        producerExample(orangeList);
        producerExample(bigOranges);

        consumerExample(objectList);
        consumerExample(fruitList);

        consumer2Example(bigOranges);
        consumer2Example(orangeList);
        consumer2Example(citrusList);
        consumer2Example(fruitList);
        consumer2Example(objectList);
    }

    /*
    public static void typeErasureExample1(List<? extends Fruit> fruits){

    }

    public static void typeErasureExample1(List<? extends String> fruits){

    }

    public static void typeErasureExample2(List<?> list){

    }

    public static void typeErasureExample2(List<Object> list){

    }
    CLASH
     */

    public static void producerExample(List<? extends Fruit> fruitList){

        //Producer gets fruit and cannot put any type
        Fruit f = fruitList.get(0);
        Object o = fruitList.get(0);

//        fruitList.add(o);
    }

    public static void consumer2Example(List<? super BigOrange> bigOrangeList){

        Object o = bigOrangeList.get(0);

        bigOrangeList.add(new BigOrange());
    }

    public static void consumerExample(List<? super Fruit> fruitList){

        fruitList.add(new Fruit());
        fruitList.add(new Citrus());
        fruitList.add(new Orange());
        fruitList.add(new BigOrange());

        Object o = fruitList.get(0);
//        Fruit f = fruitList.get(0);
    }

}

class Fruit{

    String name;
}

class Citrus extends Fruit{

}

class Orange extends Citrus{

}

class BigOrange extends Orange{

}
