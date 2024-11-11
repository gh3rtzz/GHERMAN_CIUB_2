package lecture_nr_4;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee e1 = new Employee("Alex", "Soloviov");
        System.out.println(Employee.nrOfEmployees);
        Employee e2 = new Employee("Andrei", "Ciobanu");

        System.out.println(e1.name);
        System.out.println(e2.surname);
        System.out.println(Employee.nrOfEmployees);

        e1.printEmployeeDetails();

        Employee.printNrOfEmployees();
    }
}
