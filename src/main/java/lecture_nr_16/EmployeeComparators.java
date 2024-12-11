package lecture_nr_16;

import java.util.Comparator;

public enum EmployeeComparators {

    COMPARE_BY_CAN_ATTEND_BUSINESS_MEETING(Comparator.comparing((Employee e) -> e.canAttendBusinessMeeting)),
    COMPARE_BY_CAN_CONDUCT_INTERVIEW(Comparator.comparing((Employee e) -> e.canConductInterview)),
    COMPARE_BY_CAN_DO_BOTH(Comparator.comparing((Employee e) -> e.canAttendBusinessMeeting && e.canConductInterview));

    public final Comparator<Employee> comparator;

    EmployeeComparators(Comparator<Employee> comparator) {
        this.comparator = comparator;
    }
}
