package lecture_nr_16;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    String name;
    String surname;
    int age;
    boolean canConductInterview;
    boolean canAttendBusinessMeeting;

    public Employee(String name, String surname, int age, boolean canConductInterview, boolean canAttendBusinessMeeting) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.canConductInterview = canConductInterview;
        this.canAttendBusinessMeeting = canAttendBusinessMeeting;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", canConductInterview=" + canConductInterview +
                ", canAttendBusinessMeeting=" + canAttendBusinessMeeting +
                '}';
    }

//    //compare to by age
//    @Override
//    public int compareTo(Employee o) {
//
//        return Comparator.comparingInt((Employee e) -> e.age).compare(this, o);
//    }


    @Override
    public int compareTo(Employee o) {
        return Comparator.comparing((Employee e) -> e.name)
                .thenComparing(e -> e.surname)
                .thenComparingInt(e -> e.age)
                .compare(this, o);
    }
}
