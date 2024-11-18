package lecture_nr_7.abstraction;

public class Dog extends Animal{


    public Dog(int nrOfLegs) {
        super(nrOfLegs);
    }

    @Override
    public void animalSound() {
        System.out.println("The dog says: bark bark!");
    }
}
