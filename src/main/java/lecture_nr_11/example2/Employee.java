package lecture_nr_11.example2;

public class Employee {

    String name;
    String surname;

    public boolean canConductInterview;
    public boolean canAttendBusinessMeeting;

    public Employee(String name, String surname, boolean canConductInterview, boolean canAttendBusinessMeeting) {
        this.name = name;
        this.surname = surname;
        this.canConductInterview = canConductInterview;
        this.canAttendBusinessMeeting = canAttendBusinessMeeting;
    }
}