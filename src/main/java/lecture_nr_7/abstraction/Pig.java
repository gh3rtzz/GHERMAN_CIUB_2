package lecture_nr_7.abstraction;

public class Pig extends Animal{


    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public Pig(int nrOfLegs) {
        super(nrOfLegs);
    }
}
