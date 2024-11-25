package lecture_nr_9;

public interface Movable{

    default void move(){
        System.out.println("Something is moving...");
    }
}
