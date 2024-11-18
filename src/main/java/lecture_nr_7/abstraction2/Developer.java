package lecture_nr_7.abstraction2;

public class Developer extends Employee{

    String profProgrammingLanguage;

    @Override
    public void work() {
        System.out.println("The developer is writing in :" + profProgrammingLanguage);
    }

    public Developer(String name, String surname, String profProgrammingLanguage) {
        super(name, surname);
        this.profProgrammingLanguage = profProgrammingLanguage;
    }
}
