package lecture_nr_9;

import java.io.Serializable;

public class Human implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Human is swimming");
    }

    @Override
    public void dock() {
        System.out.println("Human is docking to the shore");
    }
}
