package lecture_nr_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstMain {

    public static void main(String[] args) {

        Object o1 = new Object();

        System.out.println(o1);

        Person p1 = new Person("asd", "asd", 1);
        System.out.println(p1);

        List<String> stringList = new ArrayList<>(
                Arrays.asList("A", "B", "C")
        );

        stringList.toString();
        System.out.println(stringList);

        List<Person> personList = new ArrayList<>(
                Arrays.asList(p1, new Person("jhg", "jgf", 2))
        );

        System.out.println(personList);

        Person p2 = new Person("jkfdsjk", "asdkjjaksd", 3);
        Person p3 = new Person("asdaasd", "asdaoj", 4);

        System.out.println("[" + p2 + ", " + p3 + "]");

        Person p4 = new Person("jkfdsjk", "asdkjjakse", 3);
        Person p5 = new Person("jkfdsjk", "asdkjjakse", 3);

        System.out.println(p4.equals(p5));
        System.out.println(p4 == p5);

        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());

    }
}
