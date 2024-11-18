package lecture_nr_7.abstraction2;

public class Manager extends Employee{

    int sizeOfTeam;


    @Override
    public void work() {
        System.out.println("The manager is developing a report...");
    }

    public Manager(String name, String surname, int sizeOfTeam) {
        super(name, surname);
        this.sizeOfTeam = sizeOfTeam;
    }
}
