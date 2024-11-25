package lecture_nr_10.functionalInterf2.employeeFilters;

import lecture_nr_10.functionalInterf2.Employee;

import java.util.function.Predicate;

public class FilterCanAttendBusinessMeeting implements Predicate<Employee> {

    @Override
    public boolean test(Employee emp) {
        if(emp.canAttendBusinessMeeting == true){
            return true;
        }
        return false;
    }
}
