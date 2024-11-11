package lecture_nr_4;

public class Employee {

    String name;
    String surname;

    static int nrOfEmployees = 0;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        nrOfEmployees++;
    }

    public void printEmployeeDetails(){

        System.out.println("My name is: " + name);
        System.out.println("My surname is: " + surname);
    }

    public static void printNrOfEmployees(){

        System.out.println("The current number of employees is: " + nrOfEmployees);
    }
}
