package lecture_nr_16;

import java.util.*;

public class ComparingExample {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(
                Arrays.asList(8, 5, 10, 9, 15)
        );

        System.out.println(integerList);

        Collections.sort(integerList);

        System.out.println(integerList);

        List<Employee> employeeList = new ArrayList<>(
                Arrays.asList(
                        new Employee("asd", "asd", 20, true, false),
                        new Employee("asdasd", "asdasd", 18,false, false),
                        new Employee("asdasd", "asd", 30,true, true),
                        new Employee("asdasd", "asdasd", 50,false, true)
                )
        );

        Comparator<Employee> compareByAge = (o1, o2) -> {

            if(o1.age == o2.age){
                return 0;
            }
            if(o1.age < o2.age){
                return 1;
            } else {
                return -1;
            }
        };

        Comparator<Employee> compareByAge2 = Comparator.comparingInt(e -> e.age);

//        Collections.sort(employeeList, compareByAge);
        System.out.println(employeeList);


        List<Integer> integerList2 = new ArrayList<>(
                Arrays.asList(88, 54, 19, 91, 15)
        );

        Comparator<Integer> compareBySecondDigit = (o1, o2) -> {
            if(o1%10 == o2%10){
                return 0;
            }
            if(o1%10 > o2%10){
                return 1;
            } else {
                return -1;
            }
        };

//        Collections.sort(integerList2, compareBySecondDigit);

        System.out.println(integerList2);

        Comparator<Integer> compareBySecondDigit2 = Comparator.comparingInt(e -> e%10);

        Collections.sort(integerList2, compareBySecondDigit2);

        System.out.println(integerList2);

        Comparator<Employee> compareByAllFields = Comparator.comparing((Employee e) -> e.name)
                .thenComparing(e -> e.surname)
                .thenComparingInt(e -> e.age);

//        Collections.sort(employeeList, compareByAllFields);

        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        Collections.sort(employeeList); //usingCompareTo
        Collections.sort(employeeList, EmployeeComparators.COMPARE_BY_CAN_ATTEND_BUSINESS_MEETING.comparator); //Using comparator
        Collections.sort(employeeList, EmployeeComparators.COMPARE_BY_CAN_CONDUCT_INTERVIEW.comparator); //Using comparator
        Collections.sort(employeeList, EmployeeComparators.COMPARE_BY_CAN_DO_BOTH.comparator); //Using comparator





    }
}
