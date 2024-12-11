package lecture_nr_15;

public class BaseBallPlayer extends Human implements Player{

    String name;
    String surname;

    public BaseBallPlayer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
