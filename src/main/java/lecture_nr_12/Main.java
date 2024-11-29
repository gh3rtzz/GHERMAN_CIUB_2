package lecture_nr_12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(
                Arrays.asList("Alexey", "Serghei", "Anton", "Dumitru", "Oleg")
        );

        List<String> sortedList = new ArrayList<>();

        for (String element : stringList) {
            if (element.startsWith("A")) {
                sortedList.add(element);
            }
        }

        List<String> streamSortedList = stringList.stream() //Stream opening
                .filter(e -> e.startsWith("A"))             //Intermediate operation
                .toList();                                  //Terminal operation

        System.out.println(streamSortedList);

        List<Person> personList = new ArrayList<>(
                Arrays.asList(
                        new Person("Alexey", "Soloviov", 23),
                        new Person("Timur", "Sidelinikov", 32),
                        new Person("Timur", "Sidelinikov", 40),
                        new Person("Timur", "Sidelinikov", 60),
                        new Person("Dumitru", "Ciobanu", 50),
                        new Person("Dumitru", "Ciobanu", 40),
                        new Person("Dumitru", "Ciobanu", 18)
                )
        );

        List<String> namesList = personList.stream()
                .map(e -> e.name)
                .map(e -> e.toUpperCase(Locale.ROOT))
                .toList();

        System.out.println(namesList);

        List<String> personsOver30 = personList.stream()
                .filter(e -> e.age >= 30)
//                .filter(e -> e.name.startsWith("T"))
                .map(e -> e.name)
//                .limit(4)
                .distinct()
                .toList();

        System.out.println(personsOver30);

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println(s1 == s2);

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s3 == s4);

        List<String> sortedNameList = personList.stream()
                .map(e -> e.name)
                .sorted()
                .toList();

        System.out.println(sortedNameList);

        String s5 = "Hello";
        String s6 = "Hello!";
        System.out.println(s5.compareTo(s6));


        long timurCount = personList.stream()
                .map(e -> e.name)
                .filter(e -> e.equals("Alexey"))
                .count();

        System.out.println(timurCount);

        //findFirst findAny

        Optional<Person> personOptional = personList.stream()
                .filter(e -> e.name.startsWith("Z"))
                .findFirst();

//        System.out.println(personOptional.get());

        if(personOptional.isPresent()){
            System.out.println(personOptional.get().name);
        }

        System.out.println(personOptional.orElse(new Person("A", "B", 1)).name);


        Optional<String> firstFoundNameThatStartsWithT = personList.stream()
                .map(e -> e.name)
                .filter(e -> e.startsWith("Z"))
                .findFirst();

        System.out.println(firstFoundNameThatStartsWithT.orElse("Not Found!"));

        if(firstFoundNameThatStartsWithT.isPresent()){
            System.out.println(firstFoundNameThatStartsWithT.get());
        } else {
            System.out.println("Not Found!");
        }

        Optional<String> o1 = Optional.ofNullable("Hello");

        System.out.println(o1.isPresent());
//        System.out.println(o1.get()); //NOT SAFE!

        System.out.println(o1.orElse("Nothing here!"));

        List<Person> p1 = new ArrayList<>(Arrays.asList(
                new Person("Alexey", "Soloviov", 23),
                new Person("Timur", "Sidelinikov", 32),
                new Person("Dumitru", "Ciobanu", 40)
                )
        );

        List<Person> p2 = new ArrayList<>(Arrays.asList(
                new Person("Liubov", "Soloviov", 23),
                new Person("Igor", "Sidelinikov", 32),
                new Person("Seghei", "Ciobanu", 40)
        )
        );

        List<Person> p3 = new ArrayList<>(Arrays.asList(
                new Person("Valentin", "Soloviov", 23),
                new Person("Ceaglar", "Sidelinikov", 32),
                new Person("Evghenii", "Ciobanu", 40)
        )
        );

        List<List<Person>> personLists = new ArrayList<>(
                Arrays.asList(p1, p2, p3)
        );

        List<String> allPersonsListFiltered = personLists.stream()
                .flatMap(e -> e.stream())
                .filter(e -> e.age > 30)
                .map(e -> e.name)
                .map(e -> e.toUpperCase(Locale.ROOT))
                .toList();

        List<String> allPersonsNameList = personLists.stream()
                        .flatMap(e -> e.stream())
                        .map(e -> e.name)
                        .toList();

        System.out.println(allPersonsNameList);
    }
}
