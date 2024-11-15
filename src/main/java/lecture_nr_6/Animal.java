package lecture_nr_6;

public class Animal {

    protected int nrOfLegs;

    public Animal(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public void move(){
        System.out.println("Walking...");
    }
}
