package lecture_nr_7.abstraction2;

public class Janitor extends Employee{

    int[] floorsAssigned;

    @Override
    public void work() {
        System.out.println("The janitor is cleaning the floor...");
    }

    public Janitor(String name, String surname, int[] floorsAssigned) {
        super(name, surname);
        this.floorsAssigned = floorsAssigned;
    }
}
