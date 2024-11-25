package lecture_nr_10.functionalInterf3;

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

        Predicate<Employee> filterCanAttendBusinessMeeting = (Employee t) -> {
            if(t.canAttendBusinessMeeting == true)
                return true;
            return false;
        };

        Predicate<Employee> filterCanConductInterview = (Employee t) -> {
            if(t.canConductInterview == true)
                return true;
            return false;
        };

        //First lambda example
        Predicate<Employee> filterNameStartsWithLetterA = (Employee t) -> {
            if(t.name.startsWith("A") == true)
                return true;
            return false;
        };

        //Second lambda example
        Predicate<Employee> filterNameStartsWithLetterB = (e) -> {
            if(e.name.startsWith("B") == true)
                return true;
            return false;
        };

        //Third lambda example
        Predicate<Employee> filterNameStartsWithLetterC = e -> {
            if(e.name.startsWith("C") == true)
                return true;
            return false;
        };

        Predicate<Employee> filterNameStartsWithLetterD = e -> {
            return e.name.startsWith("D");
        };

        //Fourth lambda example
        Predicate<Employee> filterNameStartsWithE = e -> e.name.startsWith("E");



        filterAndPrintEmployees(filterCanConductInterview, employeeList);
        filterAndPrintEmployees(filterCanAttendBusinessMeeting, employeeList);

        filterAndPrintEmployees(e -> e.name.startsWith("F"), employeeList);
    }

    public static void filterAndPrintEmployees(Predicate<Employee> filter, List<Employee> employeeList){

        for(int i = 0; i != employeeList.size(); i++){
            if(filter.test(employeeList.get(i)) == true) {
                System.out.println(employeeList.get(i).name + " " + employeeList.get(i).surname);
            }
        }
    }
}
