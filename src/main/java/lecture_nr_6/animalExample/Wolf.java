package lecture_nr_6.animalExample;

public class Wolf extends Wild {

    public String favoriteAnimalToEat;

    public Wolf(int nrOfLegs, String environment, String favoriteAnimalToEat) {
        super(nrOfLegs, environment);
        this.favoriteAnimalToEat = favoriteAnimalToEat;
    }

    public void howl(){
        System.out.println("Wolf is howling!");
    }
}
