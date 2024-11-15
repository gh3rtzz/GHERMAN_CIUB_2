package lecture_nr_6.animalExample;

public class Sparrow extends Bird{

    public Sparrow(int nrOfLegs) {
        super(nrOfLegs);
    }

    @Override
    public void move(){
        System.out.println("Jumping...");
    }
}
