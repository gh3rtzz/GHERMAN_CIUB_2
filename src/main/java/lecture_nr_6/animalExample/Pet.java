package lecture_nr_6.animalExample;

import lecture_nr_6.Animal;

public class Pet extends Animal {

    public String nickName;

    public Pet(int nrOfLegs, String nickName) {
        super(nrOfLegs);
        this.nickName = nickName;
    }

    public void play(){
        System.out.println("Pet is playing...");
    }

    public void printNrOfLegs(){
        System.out.println(nrOfLegs); //Protected access modifier!
    }
}
