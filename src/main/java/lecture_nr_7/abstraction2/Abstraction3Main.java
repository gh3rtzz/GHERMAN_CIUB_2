package lecture_nr_7.abstraction2;

public class Abstraction3Main {

    public static void main(String[] args) {

        Employee e1 = new Manager("asd", "asd" ,4);
        Employee e2 = new Developer("asdasd", "asd", "Ruby");

        Employee[] employees = new Employee[]{
                e1, e2
        };

//        Manager m1 = employees[0]; WON'T COMPILE!

        Manager m1 = (Manager) e1;

//        e1.sizeOfTeam Won't compile because class employee doesn't have sizeOfTeam variable
        System.out.println(m1.sizeOfTeam);

//        Manager m2 = (Manager) e2; Will compile but will throw a ClassCastException
    }
}
