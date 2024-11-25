package lecture_nr_9;

public interface Flyable {

    void cruise();
    void takeOff();
    void land();

    static void engineFireProtocol(){
        System.out.println("Fire protocol engaged..");
    }
}
