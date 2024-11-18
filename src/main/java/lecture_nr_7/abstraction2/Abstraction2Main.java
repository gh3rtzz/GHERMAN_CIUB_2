package lecture_nr_7.abstraction2;

public class Abstraction2Main {

    public static void main(String[] args) {

//        Employee e1 = new Employee(); WON'T COMPILE
        Developer d1 = new Developer("Anton", "Soloviov", "Java");
        Janitor j1 = new Janitor("Serghei", "Achimov", new int[]{1, 2, 3});
        Manager m1 = new Manager("Adrian", "Ciobanu", 4);
        Employee m2 = new Manager("Peter", "Ivanov", 10);

        Employee[] employees = new Employee[]{
                d1, j1, m1, m2
        };

        for(int i = 0; i != employees.length; i++){

            employees[i].work();
        }

        Employee e1 = new Developer("Artur", "Sokolov", "C#");
        Employee e2 = new Manager("Peter", "Ivanor", 7);

        if(e1 instanceof Developer){
            System.out.println("e1 is Developer!");
        }

        if(e2 instanceof Developer){
            System.out.println("e2 is Developer!");
        }

        for(int i = 0; i != employees.length; i++){

            if(employees[i] instanceof Manager){
                Manager tempManager = (Manager) employees[i];
                System.out.println(tempManager.sizeOfTeam);
            }
        }

        //instanceOf syntaxis

        //1

        if(e1 instanceof Manager){
            Manager tempManager = (Manager) e1;
            System.out.println(tempManager.sizeOfTeam);
        }

        //2

        if(e1 instanceof Manager tempManager){
            System.out.println(tempManager.sizeOfTeam);
        }


    }
}
