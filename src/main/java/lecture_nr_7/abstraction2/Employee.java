package lecture_nr_7.abstraction2;

public abstract class Employee {

    String name;
    String surname;

    public abstract void work();

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
