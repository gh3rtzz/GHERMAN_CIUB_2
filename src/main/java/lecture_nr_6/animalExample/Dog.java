package lecture_nr_6.animalExample;

public class Dog extends Pet {

    public String favoriteCommand;

    public Dog(int nrOfLegs, String nickName, String favoriteCommand) {
        super(nrOfLegs, nickName);
        this.favoriteCommand = favoriteCommand;
    }

    public void executeCommand(){
        System.out.println("The dog is executing command: " + favoriteCommand);
    }
}
