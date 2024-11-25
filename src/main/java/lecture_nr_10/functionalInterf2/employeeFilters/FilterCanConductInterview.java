package lecture_nr_10.functionalInterf2.employeeFilters;

import lecture_nr_10.functionalInterf2.Employee;

import java.util.function.Predicate;

public class FilterCanConductInterview implements Predicate<Employee> {

    @Override
    public boolean test(Employee emp) {
        if(emp.canConductInterview == true)
            return true;
        return false;
    }
}
