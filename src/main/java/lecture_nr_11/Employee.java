package lecture_nr_11;

public class Employee {

    String name;
    String surname;
    String gender;

    public Employee(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    //OVERLOADED CONTRUCTOR
    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
