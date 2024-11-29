package lecture_nr_11.example2;

import java.util.function.Predicate;

public enum EmployeeFilters {

    FILTER_CAN_CONDUCT_INTERVIEW(e -> e.canConductInterview),
    FILTER_CAN_ATTEND_BUSINESS_MEETING(e -> e.canAttendBusinessMeeting),
    FILTER_CAN_DO_BOTH(e -> e.canConductInterview && e.canAttendBusinessMeeting);

    Predicate<Employee> filter;

    EmployeeFilters(Predicate<Employee> filter) {
        this.filter = filter;
    }
}
