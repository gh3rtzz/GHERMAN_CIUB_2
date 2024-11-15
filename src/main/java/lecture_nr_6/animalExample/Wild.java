package lecture_nr_6.animalExample;

import lecture_nr_6.Animal;

public class Wild extends Animal {

    public String environment;

    public Wild(int nrOfLegs, String environment) {
        super(nrOfLegs);
        this.environment = environment;
    }

    public void hunt(){
        System.out.println("Wild animal is hunting!");
    }
}
