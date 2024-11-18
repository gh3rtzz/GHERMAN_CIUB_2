package lecture_nr_7.abstraction;

public abstract class Animal {

    int nrOfLegs;

    public abstract void animalSound();

    public Animal(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }
}
