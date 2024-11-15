package lecture_nr_6.animalExample;

public class Lion extends Wild{

    public Lion(int nrOfLegs, String environment) {
        super(nrOfLegs, environment);
    }

    public void roar(){
        System.out.println("Lion is roaring!");
    }
}
