package lecture_nr_11.example2;

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
        
        filterAndPrintEmployees(EmployeeFilters.FILTER_CAN_ATTEND_BUSINESS_MEETING, employeeList);
        filterAndPrintEmployees(EmployeeFilters.FILTER_CAN_CONDUCT_INTERVIEW, employeeList);
        filterAndPrintEmployees(EmployeeFilters.FILTER_CAN_DO_BOTH, employeeList);
    }

    public static void filterAndPrintEmployees(EmployeeFilters filter, List<Employee> employeeList){

        for(int i = 0; i != employeeList.size(); i++){
            if(filter.filter.test(employeeList.get(i)) == true) {
                System.out.println(employeeList.get(i).name + " " + employeeList.get(i).surname);
            }
        }
    }
}
