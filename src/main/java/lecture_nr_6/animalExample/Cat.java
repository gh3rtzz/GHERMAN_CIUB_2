package lecture_nr_6.animalExample;

public class Cat extends Pet {

    public int nrOfLives;

    public Cat(int nrOfLegs, String nickName, int nrOfLives) {
        super(nrOfLegs, nickName);
        this.nrOfLives = nrOfLives;
    }

    public void climbTree(){
        System.out.println("Cat is climbing a tree...");
    }
}
