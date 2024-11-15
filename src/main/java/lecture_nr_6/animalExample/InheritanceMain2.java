package lecture_nr_6.animalExample;

import lecture_nr_6.Animal;

public class InheritanceMain2 {

    public static void main(String[] args) {

        Animal a1 = new Animal(4);

        Pet p1 = new Pet(4, "Chuck");
        Wild w1 = new Wild(4, "Forest");

        Cat c1 = new Cat(4, "Murzik", 9);
        Dog d1 = new Dog(4, "Sharik", "Apport!");

        Wolf ww1 = new Wolf(4, "Forest", "Sheep");
        Lion l1 = new Lion(4, "Forest");

        a1.move(); //Animal

        p1.move(); //Animal
        p1.play(); //Pet

        w1.move(); //Animal
        w1.hunt(); //Wild

        c1.move();      //Animal
        c1.play();      //Pet
        c1.climbTree(); //Cat

        d1.move();          //Animal
        d1.play();          //Pet
        d1.executeCommand();//Dog

        l1.move();      //Animal
        l1.hunt();      //Wild
        l1.roar();      //Lion

        ww1.move();     //Animal
        ww1.hunt();     //Wild
        ww1.howl();     //Wolf

        Wild ww2 = new Lion(4, "asd");

        // Need to create an array of Pets

        Pet[] petsArray = new Pet[]{
                c1, d1, p1
        };

        //Need to iterate through the array and print nicknames

        for(int i = 0; i != petsArray.length; i++){

            System.out.println(petsArray[i].nickName);
        }

        Pet p2 = c1;

        Sparrow s1 = new Sparrow(2);

        s1.move();

        Animal[] animalArray = new Animal[]{
                c1, ww1, s1
        };

        System.out.println("------------");
        for(int i = 0; i != animalArray.length; i++){
            animalArray[i].move();
        }

//        System.out.println(p1.nrOfLegs); // Won't compile because of protected access modifier!


    }
}
