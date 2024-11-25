package lecture_nr_10.functionalInterf2;

//import lecture_nr_10.functionalInterf2.employeeFilters.EmployeeFilter;
import lecture_nr_10.functionalInterf2.employeeFilters.FilterCanAttendBusinessMeeting;
import lecture_nr_10.functionalInterf2.employeeFilters.FilterCanConductInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee em1 = new Employee("Alexey", "Soloviov", true, true);
        Employee em2 = new Employee("Serghei", "Sokolov", false, false);
        Employee em3 = new Employee("Pavel", "Ciobanu", true, false);

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(em1, em2, em3));

        //Example 1
        Predicate<Employee> filterCanConductInterview = new FilterCanConductInterview();
        Predicate<Employee> filterCanAttendBusinessMeeting = new FilterCanAttendBusinessMeeting();

        filterAndPrintEmployees(filterCanConductInterview, employeeList);
        filterAndPrintEmployees(filterCanAttendBusinessMeeting, employeeList);

        //Example 2
        filterAndPrintEmployees(new FilterCanConductInterview(), employeeList);
        filterAndPrintEmployees(new FilterCanAttendBusinessMeeting(), employeeList);
    }

    public static void filterAndPrintEmployees(Predicate<Employee> filter, List<Employee> employeeList){

        for(int i = 0; i != employeeList.size(); i++){
            if(filter.test(employeeList.get(i)) == true) {
                System.out.println(employeeList.get(i).name + " " + employeeList.get(i).surname);
            }
        }
    }
}
