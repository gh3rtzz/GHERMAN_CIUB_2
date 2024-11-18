package lecture_nr_7.abstraction;

public class AbstractionMain {

    public static void main(String[] args) {

//        Animal a1 = new Animal(); WON'T COMPILE
        Dog d1 = new Dog(4);
        Pig p1 = new Pig(4);

        d1.animalSound();
        p1.animalSound();

    }
}
